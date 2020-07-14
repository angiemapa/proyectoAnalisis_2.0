/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.controlador;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import url.controladorBD.Login;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import url.controlador.exceptions.IllegalOrphanException;
import url.controlador.exceptions.NonexistentEntityException;
import url.controladorBD.Usuario;

/**
 *
 * @author USUARIO
 */
public class UsuarioJpaController implements Serializable {

    public UsuarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Usuario usuario) {
        if (usuario.getLoginList() == null) {
            usuario.setLoginList(new ArrayList<Login>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Login> attachedLoginList = new ArrayList<Login>();
            for (Login loginListLoginToAttach : usuario.getLoginList()) {
                loginListLoginToAttach = em.getReference(loginListLoginToAttach.getClass(), loginListLoginToAttach.getId());
                attachedLoginList.add(loginListLoginToAttach);
            }
            usuario.setLoginList(attachedLoginList);
            em.persist(usuario);
            for (Login loginListLogin : usuario.getLoginList()) {
                Usuario oldUsuarioidOfLoginListLogin = loginListLogin.getUsuarioid();
                loginListLogin.setUsuarioid(usuario);
                loginListLogin = em.merge(loginListLogin);
                if (oldUsuarioidOfLoginListLogin != null) {
                    oldUsuarioidOfLoginListLogin.getLoginList().remove(loginListLogin);
                    oldUsuarioidOfLoginListLogin = em.merge(oldUsuarioidOfLoginListLogin);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Usuario usuario) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Usuario persistentUsuario = em.find(Usuario.class, usuario.getId());
            List<Login> loginListOld = persistentUsuario.getLoginList();
            List<Login> loginListNew = usuario.getLoginList();
            List<String> illegalOrphanMessages = null;
            for (Login loginListOldLogin : loginListOld) {
                if (!loginListNew.contains(loginListOldLogin)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Login " + loginListOldLogin + " since its usuarioid field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            List<Login> attachedLoginListNew = new ArrayList<Login>();
            for (Login loginListNewLoginToAttach : loginListNew) {
                loginListNewLoginToAttach = em.getReference(loginListNewLoginToAttach.getClass(), loginListNewLoginToAttach.getId());
                attachedLoginListNew.add(loginListNewLoginToAttach);
            }
            loginListNew = attachedLoginListNew;
            usuario.setLoginList(loginListNew);
            usuario = em.merge(usuario);
            for (Login loginListNewLogin : loginListNew) {
                if (!loginListOld.contains(loginListNewLogin)) {
                    Usuario oldUsuarioidOfLoginListNewLogin = loginListNewLogin.getUsuarioid();
                    loginListNewLogin.setUsuarioid(usuario);
                    loginListNewLogin = em.merge(loginListNewLogin);
                    if (oldUsuarioidOfLoginListNewLogin != null && !oldUsuarioidOfLoginListNewLogin.equals(usuario)) {
                        oldUsuarioidOfLoginListNewLogin.getLoginList().remove(loginListNewLogin);
                        oldUsuarioidOfLoginListNewLogin = em.merge(oldUsuarioidOfLoginListNewLogin);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = usuario.getId();
                if (findUsuario(id) == null) {
                    throw new NonexistentEntityException("The usuario with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws IllegalOrphanException, NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Usuario usuario;
            try {
                usuario = em.getReference(Usuario.class, id);
                usuario.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The usuario with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<Login> loginListOrphanCheck = usuario.getLoginList();
            for (Login loginListOrphanCheckLogin : loginListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Usuario (" + usuario + ") cannot be destroyed since the Login " + loginListOrphanCheckLogin + " in its loginList field has a non-nullable usuarioid field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(usuario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Usuario> findUsuarioEntities() {
        return findUsuarioEntities(true, -1, -1);
    }

    public List<Usuario> findUsuarioEntities(int maxResults, int firstResult) {
        return findUsuarioEntities(false, maxResults, firstResult);
    }

    private List<Usuario> findUsuarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Usuario.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Usuario findUsuario(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Usuario.class, id);
        } finally {
            em.close();
        }
    }

    public int getUsuarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Usuario> rt = cq.from(Usuario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
     public void actualizarExistencia(Usuario usuario){
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Query updateUsuario = em.createNativeQuery("UPDATE Usuario SET Usuario.nombre = ?, Usuario.dpi = ? WHERE Usuario.id = ?");
            updateUsuario.setParameter(1,usuario.getNombre());
            updateUsuario.setParameter(2,usuario.getDpi());
            updateUsuario.setParameter(3,usuario.getId());
            updateUsuario.executeUpdate();
            em.getTransaction().commit();
        } finally {
            if (em != null) {
              
            }
        }
    }
    
}

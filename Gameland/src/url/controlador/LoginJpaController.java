/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.controlador;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import url.controladorBD.Usuario;
import url.controladorBD.Compras;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import url.controlador.exceptions.IllegalOrphanException;
import url.controlador.exceptions.NonexistentEntityException;
import url.controladorBD.Login;
import url.controladorBD.Venta;

/**
 *
 * @author USUARIO
 */
public class LoginJpaController implements Serializable {

    public LoginJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Login login) {
        if (login.getComprasList() == null) {
            login.setComprasList(new ArrayList<Compras>());
        }
        if (login.getVentaList() == null) {
            login.setVentaList(new ArrayList<Venta>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Usuario usuarioid = login.getUsuarioid();
            if (usuarioid != null) {
                usuarioid = em.getReference(usuarioid.getClass(), usuarioid.getId());
                login.setUsuarioid(usuarioid);
            }
            List<Compras> attachedComprasList = new ArrayList<Compras>();
            for (Compras comprasListComprasToAttach : login.getComprasList()) {
                comprasListComprasToAttach = em.getReference(comprasListComprasToAttach.getClass(), comprasListComprasToAttach.getId());
                attachedComprasList.add(comprasListComprasToAttach);
            }
            login.setComprasList(attachedComprasList);
            List<Venta> attachedVentaList = new ArrayList<Venta>();
            for (Venta ventaListVentaToAttach : login.getVentaList()) {
                ventaListVentaToAttach = em.getReference(ventaListVentaToAttach.getClass(), ventaListVentaToAttach.getId());
                attachedVentaList.add(ventaListVentaToAttach);
            }
            login.setVentaList(attachedVentaList);
            em.persist(login);
            if (usuarioid != null) {
                usuarioid.getLoginList().add(login);
                usuarioid = em.merge(usuarioid);
            }
            for (Compras comprasListCompras : login.getComprasList()) {
                Login oldLoginidOfComprasListCompras = comprasListCompras.getLoginid();
                comprasListCompras.setLoginid(login);
                comprasListCompras = em.merge(comprasListCompras);
                if (oldLoginidOfComprasListCompras != null) {
                    oldLoginidOfComprasListCompras.getComprasList().remove(comprasListCompras);
                    oldLoginidOfComprasListCompras = em.merge(oldLoginidOfComprasListCompras);
                }
            }
            for (Venta ventaListVenta : login.getVentaList()) {
                Login oldLoginidOfVentaListVenta = ventaListVenta.getLoginid();
                ventaListVenta.setLoginid(login);
                ventaListVenta = em.merge(ventaListVenta);
                if (oldLoginidOfVentaListVenta != null) {
                    oldLoginidOfVentaListVenta.getVentaList().remove(ventaListVenta);
                    oldLoginidOfVentaListVenta = em.merge(oldLoginidOfVentaListVenta);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Login login) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Login persistentLogin = em.find(Login.class, login.getId());
            Usuario usuarioidOld = persistentLogin.getUsuarioid();
            Usuario usuarioidNew = login.getUsuarioid();
            List<Compras> comprasListOld = persistentLogin.getComprasList();
            List<Compras> comprasListNew = login.getComprasList();
            List<Venta> ventaListOld = persistentLogin.getVentaList();
            List<Venta> ventaListNew = login.getVentaList();
            List<String> illegalOrphanMessages = null;
            for (Compras comprasListOldCompras : comprasListOld) {
                if (!comprasListNew.contains(comprasListOldCompras)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Compras " + comprasListOldCompras + " since its loginid field is not nullable.");
                }
            }
            for (Venta ventaListOldVenta : ventaListOld) {
                if (!ventaListNew.contains(ventaListOldVenta)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Venta " + ventaListOldVenta + " since its loginid field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (usuarioidNew != null) {
                usuarioidNew = em.getReference(usuarioidNew.getClass(), usuarioidNew.getId());
                login.setUsuarioid(usuarioidNew);
            }
            List<Compras> attachedComprasListNew = new ArrayList<Compras>();
            for (Compras comprasListNewComprasToAttach : comprasListNew) {
                comprasListNewComprasToAttach = em.getReference(comprasListNewComprasToAttach.getClass(), comprasListNewComprasToAttach.getId());
                attachedComprasListNew.add(comprasListNewComprasToAttach);
            }
            comprasListNew = attachedComprasListNew;
            login.setComprasList(comprasListNew);
            List<Venta> attachedVentaListNew = new ArrayList<Venta>();
            for (Venta ventaListNewVentaToAttach : ventaListNew) {
                ventaListNewVentaToAttach = em.getReference(ventaListNewVentaToAttach.getClass(), ventaListNewVentaToAttach.getId());
                attachedVentaListNew.add(ventaListNewVentaToAttach);
            }
            ventaListNew = attachedVentaListNew;
            login.setVentaList(ventaListNew);
            login = em.merge(login);
            if (usuarioidOld != null && !usuarioidOld.equals(usuarioidNew)) {
                usuarioidOld.getLoginList().remove(login);
                usuarioidOld = em.merge(usuarioidOld);
            }
            if (usuarioidNew != null && !usuarioidNew.equals(usuarioidOld)) {
                usuarioidNew.getLoginList().add(login);
                usuarioidNew = em.merge(usuarioidNew);
            }
            for (Compras comprasListNewCompras : comprasListNew) {
                if (!comprasListOld.contains(comprasListNewCompras)) {
                    Login oldLoginidOfComprasListNewCompras = comprasListNewCompras.getLoginid();
                    comprasListNewCompras.setLoginid(login);
                    comprasListNewCompras = em.merge(comprasListNewCompras);
                    if (oldLoginidOfComprasListNewCompras != null && !oldLoginidOfComprasListNewCompras.equals(login)) {
                        oldLoginidOfComprasListNewCompras.getComprasList().remove(comprasListNewCompras);
                        oldLoginidOfComprasListNewCompras = em.merge(oldLoginidOfComprasListNewCompras);
                    }
                }
            }
            for (Venta ventaListNewVenta : ventaListNew) {
                if (!ventaListOld.contains(ventaListNewVenta)) {
                    Login oldLoginidOfVentaListNewVenta = ventaListNewVenta.getLoginid();
                    ventaListNewVenta.setLoginid(login);
                    ventaListNewVenta = em.merge(ventaListNewVenta);
                    if (oldLoginidOfVentaListNewVenta != null && !oldLoginidOfVentaListNewVenta.equals(login)) {
                        oldLoginidOfVentaListNewVenta.getVentaList().remove(ventaListNewVenta);
                        oldLoginidOfVentaListNewVenta = em.merge(oldLoginidOfVentaListNewVenta);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = login.getId();
                if (findLogin(id) == null) {
                    throw new NonexistentEntityException("The login with id " + id + " no longer exists.");
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
            Login login;
            try {
                login = em.getReference(Login.class, id);
                login.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The login with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<Compras> comprasListOrphanCheck = login.getComprasList();
            for (Compras comprasListOrphanCheckCompras : comprasListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Login (" + login + ") cannot be destroyed since the Compras " + comprasListOrphanCheckCompras + " in its comprasList field has a non-nullable loginid field.");
            }
            List<Venta> ventaListOrphanCheck = login.getVentaList();
            for (Venta ventaListOrphanCheckVenta : ventaListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Login (" + login + ") cannot be destroyed since the Venta " + ventaListOrphanCheckVenta + " in its ventaList field has a non-nullable loginid field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Usuario usuarioid = login.getUsuarioid();
            if (usuarioid != null) {
                usuarioid.getLoginList().remove(login);
                usuarioid = em.merge(usuarioid);
            }
            em.remove(login);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Login> findLoginEntities() {
        return findLoginEntities(true, -1, -1);
    }

    public List<Login> findLoginEntities(int maxResults, int firstResult) {
        return findLoginEntities(false, maxResults, firstResult);
    }

    private List<Login> findLoginEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Login.class));
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

    public Login findLogin(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Login.class, id);
        } finally {
            em.close();
        }
    }

    public int getLoginCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Login> rt = cq.from(Login.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    public Login buscar(String usuario, String contraseña){
        List<Login> lista = new ArrayList();
        Login lg ;
        lista =  findLoginEntities();
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getUsuario().equals(usuario) && lista.get(i).getContraseña().equals(contraseña)){
                lg = lista.get(i);
                return lg;
            }
        }
        return null;
    }
    
}

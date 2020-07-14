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
import url.controladorBD.Proveedor;
import url.controladorBD.DetalleCompra;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import url.controlador.exceptions.IllegalOrphanException;
import url.controlador.exceptions.NonexistentEntityException;
import url.controladorBD.Compras;

/**
 *
 * @author USUARIO
 */
public class ComprasJpaController implements Serializable {

    public ComprasJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Compras compras) {
        if (compras.getDetalleCompraList() == null) {
            compras.setDetalleCompraList(new ArrayList<DetalleCompra>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Login loginid = compras.getLoginid();
            if (loginid != null) {
                loginid = em.getReference(loginid.getClass(), loginid.getId());
                compras.setLoginid(loginid);
            }
            Proveedor proveedorid = compras.getProveedorid();
            if (proveedorid != null) {
                proveedorid = em.getReference(proveedorid.getClass(), proveedorid.getId());
                compras.setProveedorid(proveedorid);
            }
            List<DetalleCompra> attachedDetalleCompraList = new ArrayList<DetalleCompra>();
            for (DetalleCompra detalleCompraListDetalleCompraToAttach : compras.getDetalleCompraList()) {
                detalleCompraListDetalleCompraToAttach = em.getReference(detalleCompraListDetalleCompraToAttach.getClass(), detalleCompraListDetalleCompraToAttach.getId());
                attachedDetalleCompraList.add(detalleCompraListDetalleCompraToAttach);
            }
            compras.setDetalleCompraList(attachedDetalleCompraList);
            em.persist(compras);
            if (loginid != null) {
                loginid.getComprasList().add(compras);
                loginid = em.merge(loginid);
            }
            if (proveedorid != null) {
                proveedorid.getComprasList().add(compras);
                proveedorid = em.merge(proveedorid);
            }
            for (DetalleCompra detalleCompraListDetalleCompra : compras.getDetalleCompraList()) {
                Compras oldComprasidOfDetalleCompraListDetalleCompra = detalleCompraListDetalleCompra.getComprasid();
                detalleCompraListDetalleCompra.setComprasid(compras);
                detalleCompraListDetalleCompra = em.merge(detalleCompraListDetalleCompra);
                if (oldComprasidOfDetalleCompraListDetalleCompra != null) {
                    oldComprasidOfDetalleCompraListDetalleCompra.getDetalleCompraList().remove(detalleCompraListDetalleCompra);
                    oldComprasidOfDetalleCompraListDetalleCompra = em.merge(oldComprasidOfDetalleCompraListDetalleCompra);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Compras compras) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Compras persistentCompras = em.find(Compras.class, compras.getId());
            Login loginidOld = persistentCompras.getLoginid();
            Login loginidNew = compras.getLoginid();
            Proveedor proveedoridOld = persistentCompras.getProveedorid();
            Proveedor proveedoridNew = compras.getProveedorid();
            List<DetalleCompra> detalleCompraListOld = persistentCompras.getDetalleCompraList();
            List<DetalleCompra> detalleCompraListNew = compras.getDetalleCompraList();
            List<String> illegalOrphanMessages = null;
            for (DetalleCompra detalleCompraListOldDetalleCompra : detalleCompraListOld) {
                if (!detalleCompraListNew.contains(detalleCompraListOldDetalleCompra)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain DetalleCompra " + detalleCompraListOldDetalleCompra + " since its comprasid field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (loginidNew != null) {
                loginidNew = em.getReference(loginidNew.getClass(), loginidNew.getId());
                compras.setLoginid(loginidNew);
            }
            if (proveedoridNew != null) {
                proveedoridNew = em.getReference(proveedoridNew.getClass(), proveedoridNew.getId());
                compras.setProveedorid(proveedoridNew);
            }
            List<DetalleCompra> attachedDetalleCompraListNew = new ArrayList<DetalleCompra>();
            for (DetalleCompra detalleCompraListNewDetalleCompraToAttach : detalleCompraListNew) {
                detalleCompraListNewDetalleCompraToAttach = em.getReference(detalleCompraListNewDetalleCompraToAttach.getClass(), detalleCompraListNewDetalleCompraToAttach.getId());
                attachedDetalleCompraListNew.add(detalleCompraListNewDetalleCompraToAttach);
            }
            detalleCompraListNew = attachedDetalleCompraListNew;
            compras.setDetalleCompraList(detalleCompraListNew);
            compras = em.merge(compras);
            if (loginidOld != null && !loginidOld.equals(loginidNew)) {
                loginidOld.getComprasList().remove(compras);
                loginidOld = em.merge(loginidOld);
            }
            if (loginidNew != null && !loginidNew.equals(loginidOld)) {
                loginidNew.getComprasList().add(compras);
                loginidNew = em.merge(loginidNew);
            }
            if (proveedoridOld != null && !proveedoridOld.equals(proveedoridNew)) {
                proveedoridOld.getComprasList().remove(compras);
                proveedoridOld = em.merge(proveedoridOld);
            }
            if (proveedoridNew != null && !proveedoridNew.equals(proveedoridOld)) {
                proveedoridNew.getComprasList().add(compras);
                proveedoridNew = em.merge(proveedoridNew);
            }
            for (DetalleCompra detalleCompraListNewDetalleCompra : detalleCompraListNew) {
                if (!detalleCompraListOld.contains(detalleCompraListNewDetalleCompra)) {
                    Compras oldComprasidOfDetalleCompraListNewDetalleCompra = detalleCompraListNewDetalleCompra.getComprasid();
                    detalleCompraListNewDetalleCompra.setComprasid(compras);
                    detalleCompraListNewDetalleCompra = em.merge(detalleCompraListNewDetalleCompra);
                    if (oldComprasidOfDetalleCompraListNewDetalleCompra != null && !oldComprasidOfDetalleCompraListNewDetalleCompra.equals(compras)) {
                        oldComprasidOfDetalleCompraListNewDetalleCompra.getDetalleCompraList().remove(detalleCompraListNewDetalleCompra);
                        oldComprasidOfDetalleCompraListNewDetalleCompra = em.merge(oldComprasidOfDetalleCompraListNewDetalleCompra);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = compras.getId();
                if (findCompras(id) == null) {
                    throw new NonexistentEntityException("The compras with id " + id + " no longer exists.");
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
            Compras compras;
            try {
                compras = em.getReference(Compras.class, id);
                compras.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The compras with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<DetalleCompra> detalleCompraListOrphanCheck = compras.getDetalleCompraList();
            for (DetalleCompra detalleCompraListOrphanCheckDetalleCompra : detalleCompraListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Compras (" + compras + ") cannot be destroyed since the DetalleCompra " + detalleCompraListOrphanCheckDetalleCompra + " in its detalleCompraList field has a non-nullable comprasid field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Login loginid = compras.getLoginid();
            if (loginid != null) {
                loginid.getComprasList().remove(compras);
                loginid = em.merge(loginid);
            }
            Proveedor proveedorid = compras.getProveedorid();
            if (proveedorid != null) {
                proveedorid.getComprasList().remove(compras);
                proveedorid = em.merge(proveedorid);
            }
            em.remove(compras);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Compras> findComprasEntities() {
        return findComprasEntities(true, -1, -1);
    }

    public List<Compras> findComprasEntities(int maxResults, int firstResult) {
        return findComprasEntities(false, maxResults, firstResult);
    }

    private List<Compras> findComprasEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Compras.class));
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

    public Compras findCompras(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Compras.class, id);
        } finally {
            em.close();
        }
    }

    public int getComprasCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Compras> rt = cq.from(Compras.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
}

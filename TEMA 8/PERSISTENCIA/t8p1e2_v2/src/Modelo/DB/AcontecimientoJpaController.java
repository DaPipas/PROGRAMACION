/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DB;

import Modelo.DB.exceptions.NonexistentEntityException;
import Modelo.DB.exceptions.PreexistingEntityException;
import Modelo.UML.Acontecimiento;
import Modelo.UML.AcontecimientoPK;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author 1gdaw05
 */
public class AcontecimientoJpaController implements Serializable {

    public AcontecimientoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Acontecimiento acontecimiento) throws PreexistingEntityException, Exception {
        if (acontecimiento.getAcontecimientoPK() == null) {
            acontecimiento.setAcontecimientoPK(new AcontecimientoPK());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(acontecimiento);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findAcontecimiento(acontecimiento.getAcontecimientoPK()) != null) {
                throw new PreexistingEntityException("Acontecimiento " + acontecimiento + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Acontecimiento acontecimiento) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            acontecimiento = em.merge(acontecimiento);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                AcontecimientoPK id = acontecimiento.getAcontecimientoPK();
                if (findAcontecimiento(id) == null) {
                    throw new NonexistentEntityException("The acontecimiento with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(AcontecimientoPK id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Acontecimiento acontecimiento;
            try {
                acontecimiento = em.getReference(Acontecimiento.class, id);
                acontecimiento.getAcontecimientoPK();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The acontecimiento with id " + id + " no longer exists.", enfe);
            }
            em.remove(acontecimiento);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Acontecimiento> findAcontecimientoEntities() {
        return findAcontecimientoEntities(true, -1, -1);
    }

    public List<Acontecimiento> findAcontecimientoEntities(int maxResults, int firstResult) {
        return findAcontecimientoEntities(false, maxResults, firstResult);
    }

    private List<Acontecimiento> findAcontecimientoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Acontecimiento.class));
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

    public Acontecimiento findAcontecimiento(AcontecimientoPK id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Acontecimiento.class, id);
        } finally {
            em.close();
        }
    }

    public int getAcontecimientoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Acontecimiento> rt = cq.from(Acontecimiento.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

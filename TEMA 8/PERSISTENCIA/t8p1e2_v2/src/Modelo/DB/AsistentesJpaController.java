/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DB;

import Modelo.DB.exceptions.NonexistentEntityException;
import Modelo.DB.exceptions.PreexistingEntityException;
import Modelo.UML.Asistentes;
import Modelo.UML.AsistentesPK;
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
public class AsistentesJpaController implements Serializable {

    public AsistentesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Asistentes asistentes) throws PreexistingEntityException, Exception {
        if (asistentes.getAsistentesPK() == null) {
            asistentes.setAsistentesPK(new AsistentesPK());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(asistentes);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findAsistentes(asistentes.getAsistentesPK()) != null) {
                throw new PreexistingEntityException("Asistentes " + asistentes + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Asistentes asistentes) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            asistentes = em.merge(asistentes);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                AsistentesPK id = asistentes.getAsistentesPK();
                if (findAsistentes(id) == null) {
                    throw new NonexistentEntityException("The asistentes with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(AsistentesPK id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Asistentes asistentes;
            try {
                asistentes = em.getReference(Asistentes.class, id);
                asistentes.getAsistentesPK();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The asistentes with id " + id + " no longer exists.", enfe);
            }
            em.remove(asistentes);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Asistentes> findAsistentesEntities() {
        return findAsistentesEntities(true, -1, -1);
    }

    public List<Asistentes> findAsistentesEntities(int maxResults, int firstResult) {
        return findAsistentesEntities(false, maxResults, firstResult);
    }

    private List<Asistentes> findAsistentesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Asistentes.class));
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

    public Asistentes findAsistentes(AsistentesPK id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Asistentes.class, id);
        } finally {
            em.close();
        }
    }

    public int getAsistentesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Asistentes> rt = cq.from(Asistentes.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    /*zona de pruebas de jpql*/
    public List<AsistentesPK> findAsistentesByEvento(String nombre){
        EntityManager em = getEntityManager();
        String jpql = "SELECT asistentes FROM Asistentes asistentes WHERE asistentes.nombre = " + nombre + ";";
        Query query = em.createQuery(jpql);
        List<AsistentesPK> listaDniAsistentes = query.getResultList();
        return listaDniAsistentes;
    }
}

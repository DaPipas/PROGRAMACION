/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDB;

import Modelo.UML.Acontecimiento;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Modelo.UML.Persona;
import ModeloDB.exceptions.NonexistentEntityException;
import ModeloDB.exceptions.PreexistingEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

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
        if (acontecimiento.getPersonaList() == null) {
            acontecimiento.setPersonaList(new ArrayList<Persona>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Persona> attachedPersonaList = new ArrayList<Persona>();
            for (Persona personaListPersonaToAttach : acontecimiento.getPersonaList()) {
                personaListPersonaToAttach = em.getReference(personaListPersonaToAttach.getClass(), personaListPersonaToAttach.getDni());
                attachedPersonaList.add(personaListPersonaToAttach);
            }
            acontecimiento.setPersonaList(attachedPersonaList);
            em.persist(acontecimiento);
            for (Persona personaListPersona : acontecimiento.getPersonaList()) {
                personaListPersona.getAcontecimientoList().add(acontecimiento);
                personaListPersona = em.merge(personaListPersona);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findAcontecimiento(acontecimiento.getNombre()) != null) {
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
            Acontecimiento persistentAcontecimiento = em.find(Acontecimiento.class, acontecimiento.getNombre());
            List<Persona> personaListOld = persistentAcontecimiento.getPersonaList();
            List<Persona> personaListNew = acontecimiento.getPersonaList();
            List<Persona> attachedPersonaListNew = new ArrayList<Persona>();
            for (Persona personaListNewPersonaToAttach : personaListNew) {
                personaListNewPersonaToAttach = em.getReference(personaListNewPersonaToAttach.getClass(), personaListNewPersonaToAttach.getDni());
                attachedPersonaListNew.add(personaListNewPersonaToAttach);
            }
            personaListNew = attachedPersonaListNew;
            acontecimiento.setPersonaList(personaListNew);
            acontecimiento = em.merge(acontecimiento);
            for (Persona personaListOldPersona : personaListOld) {
                if (!personaListNew.contains(personaListOldPersona)) {
                    personaListOldPersona.getAcontecimientoList().remove(acontecimiento);
                    personaListOldPersona = em.merge(personaListOldPersona);
                }
            }
            for (Persona personaListNewPersona : personaListNew) {
                if (!personaListOld.contains(personaListNewPersona)) {
                    personaListNewPersona.getAcontecimientoList().add(acontecimiento);
                    personaListNewPersona = em.merge(personaListNewPersona);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = acontecimiento.getNombre();
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

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Acontecimiento acontecimiento;
            try {
                acontecimiento = em.getReference(Acontecimiento.class, id);
                acontecimiento.getNombre();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The acontecimiento with id " + id + " no longer exists.", enfe);
            }
            List<Persona> personaList = acontecimiento.getPersonaList();
            for (Persona personaListPersona : personaList) {
                personaListPersona.getAcontecimientoList().remove(acontecimiento);
                personaListPersona = em.merge(personaListPersona);
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

    public Acontecimiento findAcontecimiento(String id) {
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

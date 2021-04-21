/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDB;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Modelo.UML.Empresa;
import Modelo.UML.Acontecimiento;
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
public class PersonaJpaController implements Serializable {

    public PersonaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Persona persona) throws PreexistingEntityException, Exception {
        if (persona.getAcontecimientoList() == null) {
            persona.setAcontecimientoList(new ArrayList<Acontecimiento>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Empresa nifEmpresa = persona.getNifEmpresa();
            if (nifEmpresa != null) {
                nifEmpresa = em.getReference(nifEmpresa.getClass(), nifEmpresa.getNif());
                persona.setNifEmpresa(nifEmpresa);
            }
            List<Acontecimiento> attachedAcontecimientoList = new ArrayList<Acontecimiento>();
            for (Acontecimiento acontecimientoListAcontecimientoToAttach : persona.getAcontecimientoList()) {
                acontecimientoListAcontecimientoToAttach = em.getReference(acontecimientoListAcontecimientoToAttach.getClass(), acontecimientoListAcontecimientoToAttach.getNombre());
                attachedAcontecimientoList.add(acontecimientoListAcontecimientoToAttach);
            }
            persona.setAcontecimientoList(attachedAcontecimientoList);
            em.persist(persona);
            if (nifEmpresa != null) {
                nifEmpresa.getPersonaList().add(persona);
                nifEmpresa = em.merge(nifEmpresa);
            }
            for (Acontecimiento acontecimientoListAcontecimiento : persona.getAcontecimientoList()) {
                acontecimientoListAcontecimiento.getPersonaList().add(persona);
                acontecimientoListAcontecimiento = em.merge(acontecimientoListAcontecimiento);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findPersona(persona.getDni()) != null) {
                throw new PreexistingEntityException("Persona " + persona + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Persona persona) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Persona persistentPersona = em.find(Persona.class, persona.getDni());
            Empresa nifEmpresaOld = persistentPersona.getNifEmpresa();
            Empresa nifEmpresaNew = persona.getNifEmpresa();
            List<Acontecimiento> acontecimientoListOld = persistentPersona.getAcontecimientoList();
            List<Acontecimiento> acontecimientoListNew = persona.getAcontecimientoList();
            if (nifEmpresaNew != null) {
                nifEmpresaNew = em.getReference(nifEmpresaNew.getClass(), nifEmpresaNew.getNif());
                persona.setNifEmpresa(nifEmpresaNew);
            }
            List<Acontecimiento> attachedAcontecimientoListNew = new ArrayList<Acontecimiento>();
            for (Acontecimiento acontecimientoListNewAcontecimientoToAttach : acontecimientoListNew) {
                acontecimientoListNewAcontecimientoToAttach = em.getReference(acontecimientoListNewAcontecimientoToAttach.getClass(), acontecimientoListNewAcontecimientoToAttach.getNombre());
                attachedAcontecimientoListNew.add(acontecimientoListNewAcontecimientoToAttach);
            }
            acontecimientoListNew = attachedAcontecimientoListNew;
            persona.setAcontecimientoList(acontecimientoListNew);
            persona = em.merge(persona);
            if (nifEmpresaOld != null && !nifEmpresaOld.equals(nifEmpresaNew)) {
                nifEmpresaOld.getPersonaList().remove(persona);
                nifEmpresaOld = em.merge(nifEmpresaOld);
            }
            if (nifEmpresaNew != null && !nifEmpresaNew.equals(nifEmpresaOld)) {
                nifEmpresaNew.getPersonaList().add(persona);
                nifEmpresaNew = em.merge(nifEmpresaNew);
            }
            for (Acontecimiento acontecimientoListOldAcontecimiento : acontecimientoListOld) {
                if (!acontecimientoListNew.contains(acontecimientoListOldAcontecimiento)) {
                    acontecimientoListOldAcontecimiento.getPersonaList().remove(persona);
                    acontecimientoListOldAcontecimiento = em.merge(acontecimientoListOldAcontecimiento);
                }
            }
            for (Acontecimiento acontecimientoListNewAcontecimiento : acontecimientoListNew) {
                if (!acontecimientoListOld.contains(acontecimientoListNewAcontecimiento)) {
                    acontecimientoListNewAcontecimiento.getPersonaList().add(persona);
                    acontecimientoListNewAcontecimiento = em.merge(acontecimientoListNewAcontecimiento);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = persona.getDni();
                if (findPersona(id) == null) {
                    throw new NonexistentEntityException("The persona with id " + id + " no longer exists.");
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
            Persona persona;
            try {
                persona = em.getReference(Persona.class, id);
                persona.getDni();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The persona with id " + id + " no longer exists.", enfe);
            }
            Empresa nifEmpresa = persona.getNifEmpresa();
            if (nifEmpresa != null) {
                nifEmpresa.getPersonaList().remove(persona);
                nifEmpresa = em.merge(nifEmpresa);
            }
            List<Acontecimiento> acontecimientoList = persona.getAcontecimientoList();
            for (Acontecimiento acontecimientoListAcontecimiento : acontecimientoList) {
                acontecimientoListAcontecimiento.getPersonaList().remove(persona);
                acontecimientoListAcontecimiento = em.merge(acontecimientoListAcontecimiento);
            }
            em.remove(persona);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Persona> findPersonaEntities() {
        return findPersonaEntities(true, -1, -1);
    }

    public List<Persona> findPersonaEntities(int maxResults, int firstResult) {
        return findPersonaEntities(false, maxResults, firstResult);
    }

    private List<Persona> findPersonaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Persona.class));
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

    public Persona findPersona(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Persona.class, id);
        } finally {
            em.close();
        }
    }

    public int getPersonaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Persona> rt = cq.from(Persona.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

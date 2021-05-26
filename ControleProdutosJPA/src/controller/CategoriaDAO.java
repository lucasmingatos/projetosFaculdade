package controller;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Categoria;

public class CategoriaDAO {

    private final EntityManagerFactory emf;
    private final EntityManager em;

    public CategoriaDAO() {
        this.emf = Persistence.createEntityManagerFactory("jpaPU");
        this.em = emf.createEntityManager();
    }

    public long salvar(Categoria cat) {
        try {
            em.getTransaction().begin();
            //em.persist(cat);    //inserir um novo registro
            em.merge(cat);        //inserir ou atualizar
            em.getTransaction().commit();
            return cat.getId();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return -1;
        } finally {
            this.em.close();
            this.emf.close();
        }
    }
    
    public long remover(Long id) {
        try {
            em.getTransaction().begin();
            Categoria cat = em.find(Categoria.class, id);
            em.remove(cat);        
            em.getTransaction().commit();
            return cat.getId();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return -1;
        } finally {
            this.em.close();
            this.emf.close();
        }
    }  
    
    public List<Categoria> listar() {
        try {
            Query q = em.createNamedQuery("Categoria.listar");
            return q.getResultList();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        } finally {
            this.em.close();
            this.emf.close();
        }
    } 
    public long contar() {
        try {
            Query q = em.createNamedQuery("Categoria.contar");
            return (long)q.getSingleResult();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return -1;
        } finally {
            this.em.close();
            this.emf.close();
        }
    } 
    public List<Categoria> pesquisarPorId(int id) {
        try {
            Query q = em.createNamedQuery("Categoria.porId");
            q.setParameter("id", id);
            return q.getResultList();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        } finally {
            this.em.close();
            this.emf.close();
        }
    } 
    public List<Categoria> pesquisarPorNome(String nome) {
        try {
            Query q = em.createNamedQuery("Categoria.porNome");
            q.setParameter("nome","%"+  nome + "%");
            return q.getResultList();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        } finally {
            this.em.close();
            this.emf.close();
        }
    } 

}

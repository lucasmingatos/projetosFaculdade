/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Visita;

/**
 *
 * @author Alexandre
 */
public class VisitaDAO {
    private final EntityManagerFactory emf;
    private final EntityManager em;
    
    public VisitaDAO(){
        this.emf = Persistence.createEntityManagerFactory("jpaPU");
        this.em = emf.createEntityManager();
    }
    
    public long salvar(Visita cat){
        try{
            em.getTransaction().begin();
            em.merge(cat);
            em.getTransaction().commit();
            return cat.getId();
        }catch (Exception e){
            System.out.println("ERRO: " + e.getMessage());
            return -1;            
        }finally{
            this.em.close();
            this.emf.close();
        }
    }
  
    
    public long remover(Long id){
        try{
            //verificar a existencia do objeto
            /*if(cat.getId() != 0){
            Categoria obj = em.find(Categoria.class, cat.getId());
            if(obj != null){
                cat.setId(obj.getId());
            }
            }*/
            
            
            em.getTransaction().begin();
            //em.persist(cat);      //inserir um novo registro
            
            Visita cat = em.find(Visita.class, id);
            
            em.remove(cat);      //inserir ou atualizar
            
            
            em.getTransaction().commit();
            return cat.getId();
        }catch (Exception e){
            System.out.println("ERRO: " + e.getMessage());
            return -1;            
        }finally{
            this.em.close();
            this.emf.close();
        }
    }
       
    
    public List<Visita> listar(){
        try{
           Query q = em.createNamedQuery("Visita.listar");
           return q.getResultList();
        }catch (Exception e){
            System.out.println("ERRO: " + e.getMessage());
            return null;            
        }finally{
            this.em.close();
            this.emf.close();
        }
    }
    
     public long contar(){
        try{
            Query q = em.createNamedQuery("Visita.contar");
            return (long)q.getSingleResult();
        }catch (Exception e){
            System.out.println("ERRO: " + e.getMessage());
            return -1;            
        }finally{
            this.em.close();
            this.emf.close();
        }
    }
    
     
     
     public List<Visita> pesquisarPorNome(String nome){
        try{
           Query q = em.createNamedQuery("Visita.porNome");
           q.setParameter("nome","%"+ nome +"%");
           return q.getResultList();
        }catch (Exception e){
            System.out.println("ERRO: " + e.getMessage());
            return null;            
        }finally{
            this.em.close();
            this.emf.close();
        }
    }
    
     public List<Visita> pesquisarPorId(int id){
        try{
           Query q = em.createNamedQuery("Visita.porId");
           q.setParameter("id", id );
           return q.getResultList();
        }catch (Exception e){
            System.out.println("ERRO: " + e.getMessage());
            return null;            
        }finally{
            this.em.close();
            this.emf.close();
        }
    }
}

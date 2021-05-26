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
import model.Geral;



/**
 *
 * @author Alexandre
 */
public class GeralDAO {
    
    private final EntityManagerFactory emf;
    private final EntityManager em;
    
    public GeralDAO(){
        this.emf = Persistence.createEntityManagerFactory("jpaPU");
        this.em = emf.createEntityManager();
    }
    
    public long salvar(Geral cat){
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
            
            Geral cat = em.find(Geral.class, id);
            
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
       
    
    public List<Geral> listar(){
        try{
           Query q = em.createNamedQuery("Geral.listar");
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
            Query q = em.createNamedQuery("Geral.contar");
            return (long)q.getSingleResult();
        }catch (Exception e){
            System.out.println("ERRO: " + e.getMessage());
            return -1;            
        }finally{
            this.em.close();
            this.emf.close();
        }
    }
    
     
     
     public List<Geral> pesquisarPorNome(String nome){
        try{
           Query q = em.createNamedQuery("Geral.porNome");
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
    
     public List<Geral> pesquisarPorId(int id){
        try{
           Query q = em.createNamedQuery("Geral.porId");
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
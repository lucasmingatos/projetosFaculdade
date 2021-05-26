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
import model.Carro;


/**
 *
 * @author Alexandre
 */
public class CarroDAO {
    private final EntityManagerFactory emf;
    private final EntityManager em;
    
    public CarroDAO(){
        this.emf = Persistence.createEntityManagerFactory("jpaPU");
        this.em = emf.createEntityManager();
    }
    
    public long salvar(Carro cat){
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
            
            Carro cat = em.find(Carro.class, id);
            
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
       
    
    public List<Carro> listar(){
        try{
           Query q = em.createNamedQuery("Carro.listar");
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
            Query q = em.createNamedQuery("Carro.contar");
            return (long)q.getSingleResult();
        }catch (Exception e){
            System.out.println("ERRO: " + e.getMessage());
            return -1;            
        }finally{
            this.em.close();
            this.emf.close();
        }
    }
    
     
     
     public List<Carro> pesquisarPorNome(String modelo){
        try{
           Query q = em.createNamedQuery("Carro.porNome");
           q.setParameter("modelo","%"+ modelo +"%");
           return q.getResultList();
        }catch (Exception e){
            System.out.println("ERRO: " + e.getMessage());
            return null;            
        }finally{
            this.em.close();
            this.emf.close();
        }
    }
    
     public List<Carro> pesquisarPorId(int id){
        try{
           Query q = em.createNamedQuery("Carro.porId");
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

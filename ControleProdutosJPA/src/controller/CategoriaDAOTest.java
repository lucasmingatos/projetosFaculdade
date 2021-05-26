package controller;

import java.util.List;
import model.Categoria;

public class CategoriaDAOTest {

    public static void main(String[] args) {
        
        String categorias[] = {
            "Acessórios", "Esportes",
            "Informática", "Livros",
            "Telefonia"
        };

        for(String c : categorias){
            Categoria cat = new Categoria();
            cat.setNome(c);
            new CategoriaDAO().salvar(cat);
        }
        
        
//        Categoria cat = new Categoria();
//        cat.setId(8L);
//        cat.setNome("Brinquedos");
//        new CategoriaDAO().salvar(cat);

        //remover
        //new CategoriaDAO().remover(5L);
    
        //listar
        List<Categoria> lista = new CategoriaDAO().listar();
        for(Categoria c : lista){
            System.out.println(c.getId());
            System.out.println(c.getNome() + "\n");
        }
        
        
        
  
    }

}

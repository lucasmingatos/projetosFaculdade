package controller;

import java.util.List;
import model.Categoria;

public class CategoriaDAOTestConsultas {

    public static void main(String[] args) {

        //CONSULTA 1: Listar todos os registros da Tabela
        List<Categoria> lista = new CategoriaDAO().listar();
        for (Categoria c : lista) {
            System.out.println("Id   = " + c.getId());
            System.out.println("Nome = " + c.getNome() + "\n");
        }

        //CONSULTA 2: contar a quantidade de registros
        long cont = new CategoriaDAO().contar();
        System.out.println("Total de registros = " + cont);

        //CONSULTA 3: pesquisar por Id
        List<Categoria> listaId = new CategoriaDAO().pesquisarPorId(3);
        if (listaId.size() > 0) {
            Categoria c = listaId.get(0);
            System.out.println("Id   = " + c.getId());
            System.out.println("Nome = " + c.getNome() + "\n");
        } else {
            System.out.println("Nenhum registro encontrado.");
        }

        //CONSULTA 4: pesquisar por Nome
        List<Categoria> listaNome = new CategoriaDAO().pesquisarPorNome("a");
        if (listaNome.size() > 0) {
            for (Categoria c : listaNome) {
                System.out.println("Id   = " + c.getId());
                System.out.println("Nome = " + c.getNome() + "\n");
            }
        } else {
            System.out.println("Nenhum registro encontrado.");
        }
    }
}

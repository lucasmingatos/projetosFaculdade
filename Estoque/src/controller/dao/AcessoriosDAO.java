package controller.dao;

import controlller.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Acessorios;


public class AcessoriosDAO {
    
    
    private Connection con;
    private PreparedStatement cmd;
    
    public AcessoriosDAO(){
       con = Conexao.conectar();
    }
    
    public int inserir(Acessorios e) {
        try {
            String SQL = "insert into acessorios (nome,categoria,quantidade,preco,id_marca) values (?,?,?,?,?)";

            cmd = con.prepareStatement(SQL,
                    Statement.RETURN_GENERATED_KEYS);
            cmd.setString(1, e.getNome());
            cmd.setString(2, e.getCategoria());
            cmd.setInt(3, e.getQuantidade());
            cmd.setDouble(4, e.getPreco());           
            cmd.setInt(5, e.getId_marca());
            
     
            
            if (cmd.executeUpdate() > 0) {
                //retornar o ID gerado pelo banco
                ResultSet rs = cmd.getGeneratedKeys();
                return rs.next() ? rs.getInt(1) : -1;
            } else {
                return -1;  //erro
            }
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return -1;
        } finally {
            Conexao.desconectar(con);
        }
    }
    
    public int atualizar(Acessorios v) {
        try {
            String SQL = "update acessorios set nome=?,categoria=?,quantidade=?,"
                    + "preco=?,id_marca=? where id = ?";

            cmd.setString(1, v.getNome());
            cmd.setString(2, v.getCategoria());
            cmd.setInt(3, v.getQuantidade());
            cmd.setDouble(4, v.getPreco());           
            cmd.setInt(5, v.getId_marca());
         

            if (cmd.executeUpdate() > 0) {
                return v.getId();
            } else {
                return -1;
            }
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return -1;
        } finally {
            Conexao.desconectar(con);
        }
    }
    
    private List<Acessorios> pesquisar(PreparedStatement cmd) {
        try {
            //Executar a consulta
            ResultSet rs = cmd.executeQuery();
            List<Acessorios> lista = new ArrayList<>();
            while (rs.next()) {   //retornou resultado?
                Acessorios acessorios = new Acessorios(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("categoria"),
                        rs.getInt("quantidade"),
                        rs.getDouble("preco"),
                        rs.getInt("id_marca")
                );
                lista.add(acessorios);
            }
            return lista;
        } catch (SQLException erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }
    
    public List<Acessorios> pesquisarPorId(String id) {
        try {
            String SQL = "select * from acessorios where id = ?";
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, Integer.parseInt(id));
            return pesquisar(cmd);
        } catch (SQLException erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        }
    }
    
    public List<Acessorios> pesquisarPorNome(String nome) {
        try {
            String SQL = "select * from acessorios where upper(nome) like ?";
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, "%" + nome.toUpperCase() + "%");
            
            //Executar a consulta
            ResultSet rs = cmd.executeQuery();
            List<Acessorios> lista = new ArrayList<>();
            while (rs.next()) {   //retornou resultado?
                Acessorios acessorios = new Acessorios(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("categoria"),
                        rs.getInt("quantidade"),
                        rs.getDouble("preco"),
                        rs.getInt("id_marca")
                );
                lista.add(acessorios);
            }
            return lista;
        } catch (SQLException erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }
    
    public List<Acessorios> listar() {
        try {
            String SQL = "select * from vestuario order by id";
            cmd = con.prepareStatement(SQL);
            return pesquisar(cmd);
        } catch (SQLException erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        }
    }
    
    
}

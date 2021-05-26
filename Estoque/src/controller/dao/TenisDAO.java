package controller.dao;

import controlller.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Tenis;

public class TenisDAO {
    
    private Connection con;
    private PreparedStatement cmd;
    
    public TenisDAO(){
        con = Conexao.conectar();
    }
    
    public int inserir(Tenis t) {
        try {
            String SQL = "insert into tenis (nome,quantidade,preco,id_marca) values (?,?,?,?,?)";
                    

            cmd = con.prepareStatement(SQL,
                    Statement.RETURN_GENERATED_KEYS);
            cmd.setString(1, t.getNome());
            cmd.setInt(2, t.getQuantidade()); 
            cmd.setDouble(3, t.getPreco());   
            cmd.setInt(4, t.getId_marca());
            //cmd.setInt(5, t.getId_tipo2());

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
    
    public int atualizar(Tenis c) {
        try {
            String SQL = "update tenis set nome=?,quantidade=?,"
                    + "preco=?,id_marca=? where id = ?";

            cmd = con.prepareStatement(SQL);
            cmd.setString(1, c.getNome());
            cmd.setInt(2, c.getQuantidade()); 
            cmd.setDouble(3, c.getPreco());   
            cmd.setInt(4, c.getId_marca());
            //cmd.setInt(5, c.getId_tipo2());


            if (cmd.executeUpdate() > 0) {
                return c.getId();
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
    
    private List<Tenis> pesquisar(PreparedStatement cmd) {
        try {
            //Executar a consulta
            ResultSet rs = cmd.executeQuery();
            List<Tenis> lista = new ArrayList<>();
            while (rs.next()) {   //retornou resultado?
                Tenis tenis = new Tenis(
                        rs.getInt("id"),
                        rs.getString("nome"),
                //        rs.getInt("id_tipo2"),
                        rs.getInt("quantidade"),
                        rs.getDouble("preco"),
                        rs.getInt("id_marca")
                );
                lista.add(tenis);
            }
            return lista;
        } catch (SQLException erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        } finally {
           Conexao.desconectar(con);
        }
    }
    
    public List<Tenis> pesquisarPorId(String id) {
        try {
            String SQL = "select * from tenis where id = ?";
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, Integer.parseInt(id));
            return pesquisar(cmd);
        } catch (SQLException erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        }
    }
    
    public List<Tenis> pesquisarPorNome(String nome) {
        try {
            String SQL = "select * from tenis where upper(nome) like ?";
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, "%" + nome.toUpperCase() + "%");
            //Executar a consulta
            ResultSet rs = cmd.executeQuery();
            List<Tenis> lista = new ArrayList<>();
            while (rs.next()) {   //retornou resultado?
                Tenis tenis = new Tenis(
                        rs.getInt("id"),
                        rs.getString("nome"),
                  //      rs.getInt("id_tipo2"),
                        rs.getInt("quantidade"),
                        rs.getDouble("preco"),
                        rs.getInt("id_marca")
                );
                lista.add(tenis);
            }
            return lista;
        } catch (SQLException erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }
    
    public List<Tenis> listar() {
        try {
            String SQL = "select * from tenis order by id";
            cmd = con.prepareStatement(SQL);
            return pesquisar(cmd);
        } catch (SQLException erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        }
    }
    
}

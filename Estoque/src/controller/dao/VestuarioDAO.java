package controller.dao;

import controlller.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Vestuario;

public class VestuarioDAO {
    
    private Connection con;
    private PreparedStatement cmd;
    
    public VestuarioDAO(){
       con = Conexao.conectar();
    }
    
    public int inserir(Vestuario e) {
        try {
            String SQL = "insert into vestuario (nome,especi,quantidade,preco,id_marca) values (?,?,?,?,?)";

            cmd = con.prepareStatement(SQL,
                    Statement.RETURN_GENERATED_KEYS);
            cmd.setString(1, e.getNome());
            cmd.setString(2, e.getEspeci());
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
    
    public int atualizar(Vestuario v) {
        try {
            String SQL = "update vestuario set nome=?,especi=?,quantidade=?,"
                    + "preco=?,id_marca=? where id = ?";

            cmd.setString(1, v.getNome());
            cmd.setString(2, v.getEspeci());
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
    
    private List<Vestuario> pesquisar(PreparedStatement cmd) {
        try {
            //Executar a consulta
            ResultSet rs = cmd.executeQuery();
            List<Vestuario> lista = new ArrayList<>();
            while (rs.next()) {   //retornou resultado?
                Vestuario vestuario = new Vestuario(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("especi"),
                        rs.getInt("quantidade"),
                        rs.getDouble("preco"),
                        rs.getInt("id_marca")
                );
                lista.add(vestuario);
            }
            return lista;
        } catch (SQLException erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }
    
    public List<Vestuario> pesquisarPorId(String id) {
        try {
            String SQL = "select * from vestuario where id = ?";
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, Integer.parseInt(id));
            return pesquisar(cmd);
        } catch (SQLException erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        }
    }
    
    public List<Vestuario> pesquisarPorNome(String nome) {
        try {
            String SQL = "select * from vestuario where upper(nome) like ?";
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, "%" + nome.toUpperCase() + "%");
            
            //Executar a consulta
            ResultSet rs = cmd.executeQuery();
            List<Vestuario> lista = new ArrayList<>();
            while (rs.next()) {   //retornou resultado?
                Vestuario vestuario = new Vestuario(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("Especi"),
                        rs.getInt("quantidade"),
                        rs.getDouble("preco"),
                        rs.getInt("id_marca")
                );
                lista.add(vestuario);
            }
            return lista;
        } catch (SQLException erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }
    
    public List<Vestuario> listar() {
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

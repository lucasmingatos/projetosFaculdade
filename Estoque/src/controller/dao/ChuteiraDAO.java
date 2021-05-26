package controller.dao;

import controlller.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Chuteira;

public class ChuteiraDAO {
    
    private Connection con;
    private PreparedStatement cmd;
    
    public ChuteiraDAO(){
        con = Conexao.conectar();
    }
    
    public int inserir(Chuteira a) {
        try {
            String SQL = "insert into chuteira (nome,cor,quantidade,preco,id_marca) values (?,?,?,?,?)";
                    

            cmd = con.prepareStatement(SQL,
                    Statement.RETURN_GENERATED_KEYS);
            cmd.setString(1, a.getNome());
            cmd.setString(2, a.getCor()); 
            cmd.setInt(3, a.getQuantidade());
            cmd.setDouble(4, a.getPreco());
            cmd.setInt(5, a.getId_marca());
            //cmd.setInt(6, a.getId_tipo());

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
    
    public int atualizar(Chuteira c) {
        try {
            String SQL = "update chuteira set nome=?,cor=?,quantidade=?,"
                    + "preco=?,id_marca=? where id = ?";

            cmd = con.prepareStatement(SQL);
            cmd.setString(1, c.getNome());
            cmd.setString(2, c.getCor());
            cmd.setInt(3, c.getQuantidade());
            cmd.setDouble(4, c.getPreco());
            cmd.setInt(5, c.getId_marca());
            //cmd.setInt(6, c.getId_tipo());


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
    
    private List<Chuteira> pesquisar(PreparedStatement cmd) {
        try {
            //Executar a consulta
            ResultSet rs = cmd.executeQuery();
            List<Chuteira> lista = new ArrayList<>();
            while (rs.next()) {   //retornou resultado?
                Chuteira chuteira = new Chuteira(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        //rs.getInt("id_tipo"),
                        rs.getString("cor"),
                        rs.getInt("quantidade"),
                        rs.getDouble("preco"),
                        rs.getInt("id_marca")
                );
                lista.add(chuteira);
            }
            return lista;
        } catch (SQLException erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }
    
    public List<Chuteira> pesquisarPorId(String id) {
        try {
            String SQL = "select * from chuteira where id = ?";
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, Integer.parseInt(id));
            return pesquisar(cmd);
        } catch (SQLException erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        }
    }
    
    public List<Chuteira> pesquisarPorNome(String nome) {
        try {
            String SQL = "select * from chuteira where upper(nome) like ?";
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, "%" + nome.toUpperCase() + "%");
            //Executar a consulta
            ResultSet rs = cmd.executeQuery();
            List<Chuteira> lista = new ArrayList<>();
            while (rs.next()) {   //retornou resultado?
                Chuteira chuteira = new Chuteira(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        //rs.getInt("id_tipo"),
                        rs.getString("cor"),
                        rs.getInt("quantidade"),
                        rs.getDouble("preco"),
                        rs.getInt("id_marca")
                );
                lista.add(chuteira);
            }
            return lista;
        } catch (SQLException erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }
    
    public List<Chuteira> pesquisarPorCor(String cor) {
        try {
            String SQL = "select * from chuteira where upper(cor) like ?";
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, "%" + cor.toUpperCase() + "%");
            //Executar a consulta
            ResultSet rs = cmd.executeQuery();
            List<Chuteira> lista = new ArrayList<>();
            while (rs.next()) {   //retornou resultado?
                Chuteira chuteira = new Chuteira(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        //rs.getInt("id_tipo"),
                        rs.getString("cor"),
                        rs.getInt("quantidade"),
                        rs.getDouble("preco"),
                        rs.getInt("id_marca")
                );
                lista.add(chuteira);
            }
            return lista;
        } catch (SQLException erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }

    public List<Chuteira> listar() {
        try {
            String SQL = "select * from chuteira order by id";
            cmd = con.prepareStatement(SQL);
            return pesquisar(cmd);
        } catch (SQLException erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        }
    }
    
    

    
    
}

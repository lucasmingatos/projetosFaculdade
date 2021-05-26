package controller.dao;


import controlller.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Marca;

public class MarcaDAO {
    
    private Connection con;
    private PreparedStatement cmd;
    
    public MarcaDAO(){
       con = Conexao.conectar();
    }
    
    public int inserir(Marca e) {
        try {
            String SQL = "insert into marca (razaosocial,nomefantasia,cnpj) values (?,?,?)";

            cmd = con.prepareStatement(SQL,
                    Statement.RETURN_GENERATED_KEYS);
            cmd.setString(1, e.getRazaosocial());
            cmd.setString(2, e.getNomefantasia());
            cmd.setString(3, e.getCnpj());           
            
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
    
     public int atualizar(Marca f) {
        try {
            String SQL = "update marca set razaosocial=?,nomefantasia=?,cnpj=? where id = ?";
            
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, f.getRazaosocial());
            cmd.setString(2, f.getNomefantasia());
            cmd.setString(3, f.getCnpj()); 

            if (cmd.executeUpdate() > 0) {
                return f.getId();
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
     
    private List<Marca> pesquisar(PreparedStatement cmd) {
        try {
            //Executar a consulta
            ResultSet rs = cmd.executeQuery();
            List<Marca> lista = new ArrayList<>();
            while (rs.next()) {   //retornou resultado?
                Marca marca = new Marca(
                        rs.getInt("id"),
                        rs.getString("razaosocial"),
                        rs.getString("nomefantasia"),
                        rs.getString("cnpj")
                );
                lista.add(marca);
            }
            return lista;
        } catch (SQLException erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }
     
    public List<Marca> pesquisarPorId(String id) {
        try {
            String SQL = "select * from marca where id = ?";

            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, Integer.parseInt(id));

            //Executar a consulta
            ResultSet rs = cmd.executeQuery();
            List<Marca> lista = new ArrayList<>();

            while (rs.next()) {   //retornou resultado?
                Marca e = new Marca(
                        rs.getInt("id"),
                        rs.getString("razaosocial"),
                        rs.getString("nomefantasia"),
                        rs.getString("cnjp")
                );
                lista.add(e);
            }
            return lista;
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }

    public List<Marca> pesquisarPorNome(String nomefantasia) {
        try {
            String SQL = "select * from marca where upper(nomefantasia) like ?";

            cmd = con.prepareStatement(SQL);
            cmd.setString(1, "%" + nomefantasia.toUpperCase() + "%");

            //Executar a consulta
            ResultSet rs = cmd.executeQuery();
            List<Marca> lista = new ArrayList<>();

            while (rs.next()) {   //retornou resultado?
                Marca e = new Marca(
                        rs.getInt("id"),
                        rs.getString("razaosocial"),
                        rs.getString("nomefantasia"),
                        rs.getString("cnjp")
                );
                lista.add(e);
            }
            return lista;
        } catch (Exception erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }

    public List<Marca> listar() {
        try {
            String SQL = "select * from marca order by id";
            cmd = con.prepareStatement(SQL);
            return pesquisar(cmd);
        } catch (SQLException erro) {
            System.out.println("ERRO: " + erro.getMessage());
            return null;
        }
    }
    
}


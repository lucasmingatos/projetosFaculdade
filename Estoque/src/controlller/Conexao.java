package controlller;

import java.sql.Connection;
import java.sql.DriverManager;

    

public class Conexao {
    
    private static final String DATABASE = "lojaesportes_db";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "localhost";
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://127.0.0.1:5432/" + DATABASE;
    
    public static Connection conectar() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL,
                    USERNAME, PASSWORD);
        } catch (Exception e) {
            System.out.println("ERRO (conexão): "
                    + e.getMessage());
            return null;
        }
    }

    public static void desconectar(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
            System.out.println("ERRO (conexão): "
                    + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        
        Connection con = conectar();
        if ( con != null){
            System.out.println("Conexão realizada com sucesso!");
            desconectar(con);
        }
        
    }
    
}

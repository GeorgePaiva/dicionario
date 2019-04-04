package dao;

import java.sql.*;

public class DbAdapter {

    /*- 01 Variáveis ----------------------------*/
    String jdbUrl = "jdbc:postgresql://localhost:5432/dicionario";
    String username = "postgres";
    String password = "Kamikazzi@8819.1";

    /*- 02 Variáveis ​​do banco de dados -------------------*/
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    /*- Construtor -----------------------------------------*/

    public DbAdapter() {
    }

    /**
     * Concexão para o Banco de Dados.
     */
    public void connect() {
        try {
            // Concexão para o banco de dados
            conn = DriverManager.getConnection(jdbUrl, username, password);

            //Sucesso de impressão
            System.out.println("Banco de dados conectado com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    } // Conexão

    /**
     * Desconectar do Banco de Dados.
     */
    public void disconnect(){
        try {
            if(stmt != null){
                stmt.close();
            }
            if (rs != null){
                rs.close();
            }
            if (conn != null){
                conn.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    } // Disconnect
}

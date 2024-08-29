/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login.restaurante.Modulo_Restaurante;
import java.sql.*;

/**
 *
 * @author bomba
 */
public class Modulo_Conexao {

    public static Connection conector() {
        java.sql.Connection conexao = null;

        // Chamar driver
        String driver = "com.mysql.cj.jdbc.Driver";
        // Armazenando infos do banco
        String url = "jdbc:mysql://127.0.0.1:3306/ConexaoSinistra";
        String user = "root";
        String password = "";

        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão estabelecida com sucesso!");
            return conexao;
        } catch (Exception e) {
            return null;
        }
    }
}
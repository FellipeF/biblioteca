package br.com.univasf.projeto.dal;

import java.sql.*;

/**
 *
 * @author User
 */
public class ModuloConexao {
    //Método responsável por estabelecer a conexão com o banco

    public static Connection conector() {
        java.sql.Connection conexao = null;
        String driver = "com.mysql.cj.jdbc.Driver";    //Usando o driver que foi baixado de banco de dados

        //Informações referentes ao banco:
        String url = "jdbc:mysql://localhost:3306/biblioteca";
        String user = "root";
        String password = "engsoft2023";

        // Conectando com o banco de dados e tratamento de erros
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);   //Obtém conexão usando os parâmetros
            return conexao;
        } catch (Exception e) {
            return null;
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.univasf.projeto.codes;

import br.com.univasf.projeto.dal.ModuloConexao;
import java.sql.*;
import br.com.univasf.projeto.telas.TelaCadastrarLivro;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class CadastroLivroView {

    Connection conexao = ModuloConexao.conector();
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void Adicionar() {
        String sql = "insert into livro(nome, isbn, autor, genero, paginas, edicao, quantidade, secao, contemimagem) values(?,?,?,?,?,?,?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1,TelaCadastrarLivro.txtTitulo.getText());
            pst.setString(1, TelaCadastrarLivro.txtTitulo.getText());
            pst.setString(2, TelaCadastrarLivro.txtISBN.getText());
            pst.setString(3, TelaCadastrarLivro.txtAutor.getText());
            pst.setString(4, TelaCadastrarLivro.txtGenero.getText());
            pst.setInt(5, Integer.parseInt(TelaCadastrarLivro.txtPaginas.getText()));
            pst.setInt(6, Integer.parseInt(TelaCadastrarLivro.txtEdicao.getText()));
            pst.setInt(7, Integer.parseInt(TelaCadastrarLivro.txtQuantidade.getText()));
            pst.setString(8, TelaCadastrarLivro.txtSecao.getText());
            pst.setBoolean(9, false);

            if (TelaCadastrarLivro.txtTitulo.getText().isEmpty()
                    || TelaCadastrarLivro.txtISBN.getText().isEmpty()
                    || TelaCadastrarLivro.txtAutor.getText().isEmpty()
                    || TelaCadastrarLivro.txtGenero.getText().isEmpty()
                    || TelaCadastrarLivro.txtPaginas.getText().isEmpty()
                    || TelaCadastrarLivro.txtEdicao.getText().isEmpty()
                    || TelaCadastrarLivro.txtQuantidade.getText().isEmpty()
                    || TelaCadastrarLivro.txtSecao.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por gentileza, preencha todos os campos!");
            } else {
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
                    
                    TelaCadastrarLivro.txtTitulo.setText(null);
                    TelaCadastrarLivro.txtISBN.setText(null);
                    TelaCadastrarLivro.txtAutor.setText(null);
                    TelaCadastrarLivro.txtGenero.setText(null);
                    TelaCadastrarLivro.txtPaginas.setText(null);
                    TelaCadastrarLivro.txtEdicao.setText(null);
                    TelaCadastrarLivro.txtQuantidade.setText(null);
                    TelaCadastrarLivro.txtSecao.setText(null);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

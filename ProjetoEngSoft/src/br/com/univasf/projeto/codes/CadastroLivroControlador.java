/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.univasf.projeto.codes;
import br.com.univasf.projeto.telas.TelaCadastrarLivro;

/**
 *
 * @author User
 */
public class CadastroLivroControlador {
    private CadastroLivroView view;
    
    public CadastroLivroControlador(CadastroLivroView view)
    {
        this.view = view;
    }
    
    public void CadastrarLivro()
    {
        view.Adicionar();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.univasf.projeto.codes;

public class UsuarioLogado {
    private static UsuarioLogado instance = null;
    private int idUsuario;
    private String nomeUsuario;
    
    private UsuarioLogado()
    {
        
    }
    
    public static UsuarioLogado getInstance()
    {
        if (instance == null)
        {
            instance = new UsuarioLogado();
        }
        return instance;
    }
    
    public int getIdUsuario()
    {
        return idUsuario;
    }
    
    public void setIdUsuario(int idUsuario)
    {
        this.idUsuario = idUsuario;
    }
    
    public String getNomeUsuario()
    {
        return nomeUsuario;
    }
    
    public void setNomeUsuario(String nomeUsuario)
    {
        this.nomeUsuario = nomeUsuario;
    }
}

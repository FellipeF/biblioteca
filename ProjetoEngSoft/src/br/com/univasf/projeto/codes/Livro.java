/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.univasf.projeto.codes;

public class Livro {

    private static Livro instance = null;

    private String titulo;
    private String isbn;
    private String autor;
    private String genero;
    private int paginas;
    private int edicao;
    private int quantidade;
    private String secao;
    private boolean contem_imagem;

    private Livro() {

    }

    public static Livro getInstance() {
        if (instance == null) {
            instance = new Livro();
        }
        return instance;
    }

    public boolean isContem_imagem() {
        return contem_imagem;
    }

    public void setContem_imagem(boolean contem_imagem) {
        this.contem_imagem = contem_imagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

}

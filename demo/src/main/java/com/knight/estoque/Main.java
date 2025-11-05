package com.knight.estoque;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // solução do Capítulo 1 página 14
        // // Inicia a fábrica dos proxies
        // ListagemLivrosService listagemLivrosFactory = new ListagemLivrosService();

        // // Obtém um proxy
        // ListagemLivros listagemLivros =
        // listagemLivrosFactory.getListagemLivrosPort();
        // // Executa o método remoto
        // List<Livro> livros = listagemLivros.listarLivros();

        // solução do Capítulo 2 página 42 corrigida
        ListagemLivrosService listagemLivrosService = new ListagemLivrosService(
                Livro.class.getResource("/livros.wsdl"));
        ListagemLivros listagemLivros = listagemLivrosService.getListagemLivrosPort();
        // Executa o método remoto
        List<Livro> livros = listagemLivros.listarLivrosPaginacao(0, 2);

        
        for (Livro livro : livros) {
            System.out.println("Nome: " + livro.getNome());
            System.out.println("Ano da Publicação: " + livro.getAnoDePublicacao());
            System.out.println("---");
        }

    }
}
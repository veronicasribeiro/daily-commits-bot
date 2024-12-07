package com.dailycommitsbot;

import org.kohsuke.github.GitHub;

import java.io.IOException;

public class DailyCommitsBot {
    public static void main(String[] args) {

        // Lê o token do GitHub a partir da variável de ambiente
        String githubToken = System.getenv("GITHUB_TOKEN");

        // Verifica se o token foi encontrado
        if (githubToken == null) {
            System.out.println("Token de GitHub não encontrado!");
            return;
        }

        try {
            // Conecta ao GitHub usando o token
            GitHub github = GitHub.connectUsingOAuth(githubToken);
            // Exibe o nome de usuário autenticado
            System.out.println("Conexão com GitHub estabelecida! Usuário autenticado: " + github.getMyself().getLogin());
        } catch (IOException e) {
            // Exibe mensagem de erro caso falhe na conexão
            System.out.println("Erro ao conectar ao GitHub: " + e.getMessage());
        }
        
        // Imprime no console o sucesso na obtenção do token
        System.out.print("Bot de commits diários funcionando!");
    }
}

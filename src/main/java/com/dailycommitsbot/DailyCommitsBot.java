package com.dailycommitsbot;

public class DailyCommitsBot {
    public static void main(String[] args) {

        // Lê o token do GitHub a partir da variável de ambiente
        String githubToken = System.getenv("GITHUB_TOKEN");

        // Verifica se o token foi encontrado
        if (githubToken == null) {
            System.out.println("Token de GitHub não encontrado!");
            return;
        }
        
        // Imprime no console o sucesso na obtenção do token
        System.out.print("Bot de commits diários funcionando!");
    }
}

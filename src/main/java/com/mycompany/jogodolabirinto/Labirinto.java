package com.mycompany.jogodolabirinto;

import java.util.Scanner;

public class Labirinto {
    
    // Definindo o labirinto
    static char[][] labirinto = {
        {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
        {'#', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#'},
        {'#', ' ', '#', ' ', '#', ' ', '#', '#', ' ', '#'},
        {'#', ' ', '#', ' ', ' ', ' ', ' ', '#', ' ', '#'},
        {'#', ' ', '#', '#', '#', '#', ' ', '#', ' ', '#'},
        {'#', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', '#'},
        {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
    };
    
    // Posição inicial do jogador
    static int posX = 1;
    static int posY = 1;
    
    // Função para imprimir o labirinto
    static void imprimirLabirinto() {
        for (int i = 0; i < labirinto.length; i++) {
            for (int j = 0; j < labirinto[i].length; j++) {
                if (i == posX && j == posY) {
                    System.out.print('@' + " ");
                } else {
                    System.out.print(labirinto[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    
    // Função para mover o jogador
    static void mover(char direcao) {
        int proxPosX = posX;
        int proxPosY = posY;
        
        if (direcao == 'w') {
            proxPosX--;
        } else if (direcao == 's') {
            proxPosX++;
        } else if (direcao == 'a') {
            proxPosY--;
        } else if (direcao == 'd') {
            proxPosY++;
        }
        
        // Verificar se a próxima posição é válida
        if (labirinto[proxPosX][proxPosY] != '#') {
            posX = proxPosX;
            posY = proxPosY;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            imprimirLabirinto();
            
            System.out.print("Digite WASD para mover o jogador: ");
            char input = scanner.next().charAt(0);
            mover(input);
            
            if (posX == 5 && posY == 8) { // Posição da saída
                System.out.println("Parabéns! Você encontrou a saída!");
                break;
            }
        }
        
        scanner.close();
    }
}
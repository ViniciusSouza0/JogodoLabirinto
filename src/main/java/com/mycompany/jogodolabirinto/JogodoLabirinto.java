package com.mycompany.jogodolabirinto;

import static com.mycompany.jogodolabirinto.Labirinto.imprimirLabirinto;
import static com.mycompany.jogodolabirinto.Labirinto.mover;
import static com.mycompany.jogodolabirinto.Labirinto.posX;
import static com.mycompany.jogodolabirinto.Labirinto.posY;
import java.util.Scanner;

public class JogodoLabirinto {

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




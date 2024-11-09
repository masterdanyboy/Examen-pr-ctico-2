/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen.pkg2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Examen2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String continuar;

        do {
            System.out.println("Elige: 1 para Piedra, 2 para Papel, 3 para Tijera");
            int eleccionUsuario = scanner.nextInt() - 1; // Restamos 1 para el índice

            int eleccionComputadora = random.nextInt(3);
            System.out.println("Tú elegiste: " + (eleccionUsuario + 1));
            System.out.println("La computadora eligió: " + (eleccionComputadora + 1));

            // Determinar el ganador
            if (eleccionUsuario == eleccionComputadora) {
                System.out.println("¡Es un empate!");
            } else if ((eleccionUsuario == 0 && eleccionComputadora == 2) || 
                       (eleccionUsuario == 1 && eleccionComputadora == 0) || 
                       (eleccionUsuario == 2 && eleccionComputadora == 1)) {
                System.out.println("¡Ganaste!");
            } else {
                System.out.println("¡Perdiste!");
            }

            System.out.println("¿Quieres jugar de nuevo? (s/n)");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("¡Gracias por jugar!");
        scanner.close();
    }
}


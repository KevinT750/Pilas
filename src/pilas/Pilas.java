/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilas;

import java.util.Stack;

/**
 *
 * @author kevin
 */
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Stack<String> pila = new Stack<>();

        // Agregar elementos a la pila
        pila.push("10");
        pila.push("20");
        pila.push("30");

        // Mostrar la pila
        System.out.println("Pila: " + pila);

        // Obtener y eliminar el elemento superior de la pila
        String elementoSuperior = pila.pop();
        System.out.println("Ultimo Elemento eliminado: " + elementoSuperior);

        // Mostrar la pila después de la eliminación
        System.out.println("Pila después de la eliminación: " + pila);

        // Obtener el elemento superior sin eliminarlo
        String elementoSuperiorActual = pila.peek();
        System.out.println("Elemento superior actual (sin eliminar): " + elementoSuperiorActual);

        // Tamaño de la pila
        System.out.println("Tamaño de la pila: " + pila.size());

        // Verificar si la pila está vacía
        System.out.println("¿La pila está vacía? " + pila.isEmpty());
        Stack<String> pila1 = new Stack<>();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;

import java.util.Stack;

/**
 *
 * @author kevin
 */
public class push {

    public static void main(String[] args) {
        Stack<String> st1 = new Stack<>();
        st1.push("Kevin");
        st1.push("Steveen");
        st1.push("Teran");
        System.out.println("Pila: " + st1);
        String eliminar = st1.pop();
        System.out.println("Elemento eliminado es: " + eliminar);
        System.out.println("Pila: " + st1);
        String ultimaPila=st1.peek();
        System.out.println("Ultimo Elemento es: " + ultimaPila);
        System.out.println(st1.empty());
        System.out.println(st1.search("Steveen"));
    }
}

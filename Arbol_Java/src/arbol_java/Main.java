/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arbol_java;
/**
 *
 * @author vikhu
 */
public class Main {
    
     public static void main(String[] argumentos) {
        Arbol arbol = new Arbol();
          
        arbol.insertarNodo(2);
        arbol.insertarNodo(3);
        arbol.insertarNodo(4);
        arbol.insertarNodo(0);
        System.out.println("Recorriendo inorden:\n");
        arbol.recorridoInorden();
        System.out.println("\nRecorriendo postorden:");
        arbol.recorridoPosorden();
        System.out.println("\nRecorriendo preorden:");
        arbol.recorridoPreorden();
        System.out.println("\n" + arbol.equals(1)); // true
        System.out.println(arbol.equals(7)); // false
        System.out.println(arbol.equals(0)); // true
    }   
}

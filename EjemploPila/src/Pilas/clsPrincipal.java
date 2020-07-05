/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

/**
 *
 * @author pc
 */
public class clsPrincipal {
    public static void main(String[] args) {
        Pila obj = new Pila();
        obj.insertar(12, "Juan");
        obj.insertar(15, "Pedro");
        obj.insertar(155, "Pepito");
        System.out.println(obj.sacarDatos());
        System.out.println(obj.sacarDatos());
        obj.insertar(200, "Pablo");
        obj.insertar(22, "Mario");
        System.out.println(obj.sacarDatos());
        obj.insertar(52, "Maria");
        obj.insertar(123, "Jose");
        
    }
}

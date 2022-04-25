/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentahabiente;

/**
 *
 * @author Viktor
 */
public class Cuentahabiente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     System.out.println("Categoria de mis clientes");
        Clientes[] Miembro = new Clientes[5]; // Tengo 5 clientes
        Miembro[0] = new Clientes(586265636, "Karla Ortiz", 85000.00f);
        Miembro[1] = new Clientes(255608999, "Gustavo Cerati", 10000.00f);
        Miembro[2] = new Clientes(795836362, "Charly Garcia", 3000.00f);
        Miembro[3] = new Clientes(461421349, "Robert Smith",95000.00f);
        Miembro[4] = new Clientes(457985221, "Paul Maccartney", 17000000.00f);
        System.out.println("For each");
        for (Clientes clientes : Miembro){
            System.out.println(clientes.evaluarNivelCliente());
            
        }
    }
    
}

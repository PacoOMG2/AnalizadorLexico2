/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluarexpresiones.java;

public class EnumeradosEjemplo {

    // Enumeración para representar los puntos cardinales
    enum PuntoCardinal {
        NORTE, SUR, ESTE, OESTE
    }

    public static void main(String[] args) {
        PuntoCardinal direccion = PuntoCardinal.NORTE;
        System.out.println("La direccion actual es " + direccion);
    }
}

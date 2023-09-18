/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluarexpresiones.java;

import java.util.ArrayList;
import java.util.regex.*;

public class ValidacionPaginasWeb {

    public static void main(String[] args) {
        String texto = "Este es un texto de ejemplo que contiene algunas direcciones de paginas web.\n"
                + "Puedes encontrar URLs como https://www.ejemplo.com, http://www.otra-url.com,\n"
                + "o incluso www.sitio-web.org. Aseg ́urate de buscar todas las URLs, independientemente\n"
                + "de si comienzan con ”https://”, ”http://”, o simplemente ”www.”.";

        ArrayList<String> urls = obtenerURL(texto); //se crea un array que almacenará el texto que a su vez llama al metodo obetenrURL

        System.out.println("URLs encontradas:");//se imprime una vez se evaule el texto en el obtenerURL
        for (String url : urls) {//de todas las url´s encontradas se crea un ciclo para imprimir cada uno de los url encontrados
            System.out.println(url);
        }//cierre del for
    }//cierre del main

    public static ArrayList<String> obtenerURL(String texto) {

        // Expresión regular 
        String regex = "(https?://)?(www\\.)?[a-zA-Z0-9\\-]+(\\.[a-zA-Z]+)+(/[a-zA-Z0-9\\-._~:/?#\\[\\]@!$&'()*+,;=]*)?";//se crea el regex para evaluar
                                                                                                              //que tipo de datos son aceptados  

        Pattern pattern = Pattern.compile(regex);//se crea un patron de texto a partir de una variable regex
        Matcher matcher = pattern.matcher(texto);//con el patron de texto se le aplica a la variable texto
        ArrayList<String> urls = new ArrayList<>();//se crea una lista para almacenar las url

        while (matcher.find()) {
            String url = matcher.group();
            urls.add(url);//se añaden las url a una lista
        }//cierre del while

        return urls;
    }//cierre de obtenerURL
}//cierre de la clase principal
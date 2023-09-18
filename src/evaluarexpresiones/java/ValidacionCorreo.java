import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionCorreo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Introduce una direccion de correo electronico: ");
        
        // Leemos la entrada del usuario y la almacenamos en la variable "email"
        String email = scanner.nextLine();     

        //describe el patrón de una dirección de correo válida
        String regex = "^[a-zA-Z0-9]+([._]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+([.-]?[a-zA-Z0-9]+)*\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        
        // Creamos un objeto comparador 
        Matcher matcher = pattern.matcher(email);

        // Comprobamos si la dirección de correo electrónico coincide con el patrón
        if (matcher.matches()) {
            
            System.out.println("La direccion de correo electronico es valida.");
        } else {
            
            System.out.println("La direccion de correo electronico no es valida.");
        }
    }
}


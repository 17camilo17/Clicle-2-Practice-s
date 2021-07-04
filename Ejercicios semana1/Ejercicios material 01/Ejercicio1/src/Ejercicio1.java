import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){

/* Toma un texto (nombre ) y lo retorna como un saludo */
 System.out.println(greet());
  }


public static String greet(){
    var sc = new Scanner(System.in);
    System.out.println("Ingresa tu nombre: ");  //Toma el dato ingresado por teclado y lo guarda en la vaiable name.
    String name = sc.nextLine();
    sc.close();
    return  "Hola " + name + "!.";
    
}
}


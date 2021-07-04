import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
    
    /* Recibe un numero por teclado y cuenta cuantas cifras tiene: */    

   System.out.println(count());
    
    }

public static String count(){
    var sc = new Scanner(System.in);
    System.out.println("Ingresa el numero para contar sus cifras: ");
    int number = sc.nextInt();
    int figure = 0;

    while (number  != 0) {
        number /= 10;
        figure ++;
    }
    return "El numero tiene " + cifras + " cifras" ;
    sc.close();
}
}




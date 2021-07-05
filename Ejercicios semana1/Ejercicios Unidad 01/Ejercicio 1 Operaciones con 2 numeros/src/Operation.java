import java.util.Scanner;

public class Operation {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);
        int option;
        float num1, num2;

        System.out.println("<-------- Operaciones Básicas con 2 Numeros -------->");
        System.out.println("Escribe el número segun tu Opcion: ");
        System.out.println("    1) Sumar.         3) Multiplicar.");
        System.out.println("    2) Restar.        4) Dividir.");
        
        option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("Elegiste Sumar: ");
                System.out.print("Ingresa el Primer numero: ");
                num1 = sc.nextFloat();
                System.out.print("Ingresa el segundo numero: ");
                num2 = sc.nextFloat();
                System.out.println("La Suma de "+num1+ " y " + num2 + " es igual a: " + (num1+num2));


                break;
            case 2:
                 System.out.println("Elegiste Restar: ");
                 System.out.print("Ingresa el Primer numero: ");
                 num1 = sc.nextFloat();
                 System.out.print("Ingresa el segundo numero: ");
                 num2 = sc.nextFloat();
                 System.out.println("La Resta de "+num1+ " y " + num2 + " es igual a: " + (num1-num2));

                break;
            case 3:
                  System.out.println("Elegiste Multiplicar: ");
                  System.out.print("Ingresa el Primer numero: ");
                  num1 = sc.nextFloat();
                  System.out.print("Ingresa el segundo numero: ");
                  num2 = sc.nextFloat();
                  System.out.println("La Multiplicacion de "+num1+ " y " + num2 + " es igual a: " + (num1*num2));

                break;
            case 4:
                  System.out.println("Elegiste Dividir: ");
                  System.out.print("Ingresa el Primer numero: ");
                  num1 = sc.nextFloat();
                  System.out.print("Ingresa el segundo numero: ");
                  num2 = sc.nextFloat();
                  System.out.println("La Division de "+num1+ " y " + num2 + " es igual a: " + (num1/num2));

                break;
        
            default:
                System.out.println("El dato ingresado NO CORRESPONDE A UNA OPCION VÁLIDA."); 
                break;
        }
        sc.close();



    }
}

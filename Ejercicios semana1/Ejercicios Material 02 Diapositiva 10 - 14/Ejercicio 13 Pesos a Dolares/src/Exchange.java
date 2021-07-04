import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);
        int option;
        int todaydollar = 3750;
        float dollars, pes;

        System.out.println("<---------- Conversor de Pesos-Dolares - Dolares-Pesos. ---------->");
        System.out.println("                  >> Dolar Hoy: **" + todaydollar + "** << ");
        System.out.println("Elige la opcion segun corresponda: ");
        System.out.println("  1) Cambiar valor del Dólar. " + todaydollar + ".                 3) Convertir Dólares a Pesos.");
        System.out.println("  2) Convertir Pesos a Dólares.                     4) Salir. ");
        System.out.println("");
        System.out.print("Opcion seleccionada: ");
        option = sc.nextInt();


            while (option == 1) {
                System.out.println("Escribe el valor del Dólar actual.");
                todaydollar = sc.nextInt();
                System.out.println("<---------- Conversor de Pesos-Dolares - Dolares-Pesos. ---------->");
                System.out.println("                  >> Dolar Hoy: **" + todaydollar + "** << ");
                System.out.println("Elige la opcion segun corresponda: ");
                System.out.println("  1) Cambiar valor del Dólar. " + todaydollar + ".                 3) Convertir Dólares a Pesos.");
                System.out.println("  2) Convertir Pesos a Dólares.                     4) Salir. ");
                System.out.println("");
                System.out.print("Opcion seleccionada: ");
                option = sc.nextInt();
            }
            if (option == 2){
                System.out.println("Ingresa la cantidad en Pesos a convertir: ");
                pes = sc.nextFloat();
                System.out.println(pes + "Pesos equivalen a " + pes/todaydollar + " Dólares");
            }else if (option == 3){
                System.out.println("Ingresa la cantidad en Dólares a convertir: ");
                dollars = sc.nextFloat();
                System.out.println(dollars + "Dólares equivalen a " + todaydollar*dollars + " Pesos");
            }else if (option == 4){
                System.out.println("Gracias por usar nuestros servicios.");
                System.out.close();           
        sc.close();
     }
   }
}

import java.util.Scanner;

public class WorkedHours {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);
        int hours;

        System.out.println(" <-------------- Salario Segun Horas Laboradas -------------->");
        System.out.print("Ingresa la cantidad de Horas laboradas en el mes: ");
        hours = sc.nextInt();
        System.out.println("El salario del mes es de: $" + hours*30000 + " por " + hours+ " laboradas.");
        sc.close();
    }
}

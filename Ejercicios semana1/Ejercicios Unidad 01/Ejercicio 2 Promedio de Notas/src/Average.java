import java.util.Scanner;

public class Average {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);
        String name;
        float note1, note2, note3, average;

        System.out.println(" ");
        System.out.println("<---------- Promedio De Alumnos ---------->");
        System.out.println("Ingresa el nombre del Alumno");
        name = sc.nextLine();
        System.out.println("Ingresa las 3 ultimas notas: ");
        System.out.print("Nota 1: ");
        note1 = sc.nextFloat();
        System.out.print("Nota 2: ");
        note2 = sc.nextFloat();
        System.out.print("Nota 3: ");
        note3 = sc.nextFloat();

        average = (note1+note2+note3) / 3;

        if(average >= 3){
            System.out.println("Alumno: "+ name.toUpperCase() + " Aprobado.");
        }else{
            System.out.println("Alumno: "+ name.toUpperCase() + " Reprobado.");
        }
        sc.close();
        
    }
}

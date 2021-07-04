import java.util.Scanner;

public class Time {
    public static void main(String[] args) throws Exception {
        

        var sc = new Scanner(System.in);
        int hour, minutes, seconds;

        System.out.println("Ingresa la Hora (Hora militar): ");
        hour = sc.nextInt();
        System.out.println("Ingresa los Minutos: ");
        minutes = sc.nextInt();
        System.out.println("Ingresa los Segundos: ");
        seconds = sc.nextInt();

        if (hour >24 || minutes >60 || seconds > 60) {
            System.out.println("El formato horario no es correcto.");
        }else{
         System.out.println("La hora es: " + hour + " Horas Con "+ minutes+ " Minutos y "+ seconds + " Segundos.");
        }
        sc.close();

    }
}

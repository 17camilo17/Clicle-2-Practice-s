import java.util.Scanner;

public class Mounth {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);
        int mounth;

        System.out.println("<---------- Numero correspondiente al mes ---------->");
        System.out.println("Escribe un numero entero (entre 1 y 12): ");
        mounth = sc.nextInt();

        

            switch (mounth) {
                case 1:
                System.out.println("El numero 1 Corresponde al mes de ENERO 31 dias");                    
                    break;

                case 2:
                System.out.println("El numero 2 Corresponde al mes de Febrero 28 dias");                    
                    break;

                case 3:
                System.out.println("El numero 3 Corresponde al mes de Marzo 31 dias");                    
                    break;

                case 4:
                System.out.println("El numero 4 Corresponde al mes de Abril 30 dias");                    
                    break;
                    
                case 5:
                System.out.println("El numero 5 Corresponde al mes de Mayo 31 dias");                    
                    break;
    
                case 6:
                 System.out.println("El numero 6 Corresponde al mes de Junio 30 dias");                    
                    break;                
                    
                case 7:
                System.out.println("El numero 7 Corresponde al mes de Julio 31 dias");                    
                    break;
        
                case 8:
                 System.out.println("El numero 8 Corresponde al mes de Agosto 31 dias");                    
                    break;

                case 9:
                 System.out.println("El numero 9 Corresponde al mes de Septiembre 30 dias");                    
                    break;
    
                case 10:
                 System.out.println("El numero 10 Corresponde al mes de Octubre 31 dias");                    
                    break;
    
                case 11:
                 System.out.println("El numero 11 Corresponde al mes de Noviembre 30 dias");                    
                    break;
    
                case 12:
                 System.out.println("El numero 12 Corresponde al mes de Diciembre 31 dias");                    
                    break;
                                
            
                default:
                System.out.println("El numero ingresado no corresponde a ningun mes del año (12 meses)");
                    break;
            }
        sc.close();        
    }
}

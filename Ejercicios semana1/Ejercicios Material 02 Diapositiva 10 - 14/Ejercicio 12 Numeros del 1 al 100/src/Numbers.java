
public class Numbers {
    public static void main(String[] args) throws Exception {
        

     // Buble For:
     System.out.println(" ");
     System.out.println("<----- Numeros del 1 al 100 que no son multiplos de 3 ----->");
     System.out.println("                       Bucle FOR.");
     for (int i = 1; i <= 100; i++) {
         if (i%3 != 0) {
             System.out.print(i +", ");             
         }
     }


     // Bucle while:
     System.out.println(" ");     
     System.out.println("<----- Numeros del 1 al 100 que no son multiplos de 3 ----->");
     System.out.println("                     Bucle WHILE.");
     int j = 1;
     while (j <= 100) {
        if(j%3 != 0){
            System.out.print(j +", ");
        }
         j++;
     }



     // Bucle Do-While
     System.out.println(" ");     
     System.out.println("<----- Numeros del 1 al 100 que no son multiplos de 3 ----->");
     System.out.println("                     Bucle DO-WHILE.");
     int k = 1;
     do {
          if( k%3 != 0){
          System.out.print(k + ", ");           
          }
          k++;
        } while (k <= 100);
     
    }
}

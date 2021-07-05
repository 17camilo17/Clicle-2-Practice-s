import java.util.Scanner;

public class Client {

    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {   
        
        
        var camilo = new Client();
        System.out.println(camilo.getname());


        camilo.setName();
        System.out.println("El nuevo nombre es: " + camilo.getname());

        
    }
   

    private String  name;
    private String  sourname;
    private int  age;
    private String  job;
    private int  salary;


    public Client(){  // Constructor con valores por defecto..
         name = "clientexxxx";
         sourname = "clientexxxxx";
         age = 1111;
         job = "clientexxxxxx";
         salary = 1111;   

    }

    public void setName(){
        System.out.println("Ingresa el nombre: ");
        name = sc.nextLine();
    }

    public void setSourname(){
        System.out.println("Ingresa el Apellido: ");
        sourname = sc.nextLine();
    }

    public void setAge(){
        System.out.println("Ingresa la edad: ");
        age = sc.nextInt();
    }

    public void setJob(){
        System.out.println("Ingresa el oficio: ");
        job = sc.nextLine();
    }

    public void setSalary(){
        System.out.println("Ingresa el salario: ");
        salary = sc.nextInt();
    }


    //Getters:
    public String getname(){
        return name;
    }

    public String getSourname(){
        return sourname;
    }

    public int getAge(){
        return age;
    }

    public String getJob(){
        return job;
    }

    public int getSalary(){
        return salary;
    }


   
        
        
    

     

 

    
}


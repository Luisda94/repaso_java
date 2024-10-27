import java.util.Scanner;

public class test_condiones {


    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();

        //if(salario < 2600.0)  
           // System.out.println("Su tasa es del  15%");
            //System.out.println("Puede deducir hasta R$ 350");
        
       // if(salario <= 3750.0)  
         //   System.out.println("Su tasa es del  22,5%");
           // System.out.println("Puede deducir hasta R$ 636");
        if (salario < 2600.0) {
            System.out.println ("Su tasa es del 15%");
            System.out.println ("Puede deducir R $ 350");
        }

        if (salario < 3750.0) {
            System.out.println ("Su tasa es del 22.5%");
            System.out.println ("Puede deducir R $ 636");
        }
    sc.close();
    
    }    
}

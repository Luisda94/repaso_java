import java.util.Scanner;

public class test_condiones {


    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("ingrese el salario estimados");
        double salario = sc.nextDouble();

        if (salario <= 2600.0) {
            System.out.println ("Su tasa es del 15%");
            System.out.println ("Puede deducir R $ 350");
        }

        else if (salario >= 3750.0 && salario <= 5000.0){
            System.out.println ("Su tasa es del 22.5%");
            System.out.println ("Puede deducir R $ 636");
        }
        else {
        	System.out.println("Su tasa es del 26.3%");
        	System.out.println("Pude deducir R $ 700");
        }
        // if(salario <= 3750.0)  
        //   System.out.println("Su tasa es del  22,5%");
          // System.out.println("Puede deducir hasta R$ 636");

    sc.close();
    
    }    
}

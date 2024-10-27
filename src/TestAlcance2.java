import java.util.Scanner;

public class TestAlcance2 {

	public static void main (String [] args) {
        System.out.println ("pruebas condicionales");
Scanner Sc = new Scanner(System.in);
System.out.println("ingrese su edad, por favor.");
        int edad = Sc.nextInt();
        System.out.println("Ingrese cuantas personas son:");
        int cantidadPersonas = Sc.nextInt();
        boolean acompañado = cantidadPersonas >= 2;// por quitar if innecesarios. se pone aqui. de la otra forma funcion pero es mucho codigo.

 //       if (cantidadPersonas >= 2) {
   //         acompañado = true;
     //   } else {
       //     acompañado = false;
        //}

        if (edad >= 18 || acompañado) {
            System.out.println ("Bienvenido");
        } else {
            System.out.println ("desafortunadamente no puedes ingresar");
        }
 Sc.close();   }
}

public class TestMes {

    public static void main (String [] args) {

        int mes = 1;// esto es para poder trabajar con variables sin usar if/else

        switch (mes) { //switch (variableASerProbada) {
        //case opción1: //(asi es la de como es).
            case 1:
                System.out.println ("El mes es enero");
                //comando (s) si se ha elegido la opción 1
                break;
            case 2:
                System.out.println ("El mes es febrero");
                break;
            case 3:
                System.out.println ("El mes es marzo");
                break;
            case 4:
                System.out.println ("El mes es abril");
                break;
            case 5:
                System.out.println ("El mes es mayo");
                break;
            case 6:
                System.out.println ("El mes es junio");
                break;
            case 7:
                System.out.println ("El mes es julio");
                break;
            case 8:
                System.out.println ("El mes es agosto");
                break;
            case 9:
                System.out.println ("El mes es septiembre");
                break;
            case 10:
                System.out.println ("El mes es octubre");
                break;
            case 11:
                System.out.println ("El mes es noviembre");
                break;
            case 12:
                System.out.println ("El mes es diciembre");
                break;
            default:
                System.out.println ("Mes inválido");
                break;
        }
    }
}

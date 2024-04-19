package fordtest.testford;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // declaramos la varible que tomara el numero que queremos converitr a romano
        int numeroConvertir;
        Scanner entrada = new Scanner(System.in);

        // pedimos el ingreso del numero
        System.out.println( "-----------------numeros naturales a romanos!-------------- " );
        System.out.println( "Ingresa el numero a convertir: " );
        numeroConvertir = entrada.nextInt();
        System.out.println( "numero "+ numeroConvertir);



        



    }

    public static void convertidorRomano(int numero) {
        int numNatural;

        /// U D C PARA LA CONVERSION DE LOS NUMEROS 

        String[]  uni = {"I","II","III","IV","V","VI","VII","VII","IX"}; //DECLARAMOS EL ARREGLO DE LAS CENTENAS
        String[]  dec = {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};//DECLARAMOS EL ARREGLO DE LAS DECENAS
        String[]  cen = {"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};//DECLARAMOS EL ARREGLO DE LAS CENTENAS

    }
}

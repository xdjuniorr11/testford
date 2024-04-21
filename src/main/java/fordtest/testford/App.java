package fordtest.testford;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        // we declared the number that we want to convert to roman number
        int numeroConvertir;
        Scanner entrada = new Scanner(System.in);
        int getout;
        // add a do while condition to get out of the bucle
        do {

        // request the number 

        System.out.println( "-----------------numeros naturales a romanos!-------------- " );
        System.out.println( "Ingresa el numero a convertir: " );
        numeroConvertir = entrada.nextInt();
        System.out.println( "numero "+ numeroConvertir);

        convertidorRomano(numeroConvertir);
        System.out.println( "Desea salir? presione 0  " );
        getout =entrada.nextInt();
        } while (getout != 0);
        

    }

    public static String convertidorRomano(int numero) {
        
        int indiceMil,indiceCen,indiceDec,indiceUn;
        /// U D C to be able to convert the roman numbers

        String[]  uni = {"","I","II","III","IV","V","VI","VII","VII","IX"}; //DECLARAMOS EL ARREGLO DE LAS CENTENAS
        String[]  dec = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};//DECLARAMOS EL ARREGLO DE LAS DECENAS
        String[]  cen = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};//DECLARAMOS EL ARREGLO DE LAS CENTENAS
        String[]  mil = {"","M","MM","MMM"};

        // we need to see de residuo to be able to map with the index, that is going to help us to indetfy which number 
        // we are going to remplace
        indiceMil= numero /1000;
        numero = numero%1000;

        indiceCen= numero /100;
        numero = numero%100;

        indiceDec= numero /10;
        numero = numero%10;
        indiceUn = numero;
        
        System.out.println( mil[indiceMil] + cen[indiceCen] + dec[indiceDec] + uni[indiceUn]);
        return mil[indiceMil] + cen[indiceCen] + dec[indiceDec] + uni[indiceUn];

    }
}

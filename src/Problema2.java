public class Problema2 {

    private static   boolean esMultiplo3(Integer n) {

        return n % 3 == 0;

    }
    private static boolean esMultiplo5(Integer n){

        return n % 5 == 0;
    }

    public static String cadenaNumerosLetras1al20(Integer a, Integer b) {

        String fizz = "Fizz";
        String buzz = "Buzz";
        String cadena = "";
        for (int i = a; i <= b; i++) {

            if (esMultiplo3(i) && esMultiplo5(i)){
                cadena = cadena + fizz + buzz;
            }
            else if (esMultiplo3(i)){
                cadena = cadena + fizz;
            }
            else if (esMultiplo5(i)){
                cadena = cadena + buzz;
            }
            else cadena = cadena + i;

        }

        return cadena;
    }


}

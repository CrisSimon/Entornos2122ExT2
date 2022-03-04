
import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class TestsProblema1 {


@Test
    public void cadenaNumerosLetras1al20Test() {
        String cadena = Problema1.cadenaNumerosLetras1al20() ;
        String experado = "12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19Buzz";

        Assert.assertEquals(experado,cadena);


    }


}

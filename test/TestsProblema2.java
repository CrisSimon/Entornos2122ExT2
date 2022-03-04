import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestsProblema2 {

    @Test
    public void cadenaNumerosLetras_A_al_B_Test() {
        Integer a= 1;
        Integer b = 20;
        String cadena = Problema2.cadenaNumerosLetras1al20(a,b);

        String experado = "12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19Buzz";

        Assert.assertEquals(experado,cadena);


    }


}

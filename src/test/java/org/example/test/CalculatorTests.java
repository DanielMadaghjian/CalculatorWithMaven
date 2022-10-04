package org.example.test;

import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTests {
    @Test
    public void testIsValidExpression() {
        String input = "";

        //test correct expression
        input = "12435+34569-12345*10+50";
        assertEquals(0, Calculator.isValidExpression(input) );

        //test empty expression
        input = " ";
        assertEquals(3, Calculator.isValidExpression(input) );

        //test single value
        input = "3";
        assertEquals(0, Calculator.isValidExpression(input));

        //test operator at the beginning
        input = "+5-7*5";
        assertEquals( 1, Calculator.isValidExpression(input) );

        //test operator at the end
        input = "5-7*5+";
        assertEquals(1, Calculator.isValidExpression(input) );

        //test double operator
        input = "5-7*5++4 ";
        assertEquals(1, Calculator.isValidExpression(input) );

        //test unknown character
        input = "10/2 + f";
        assertEquals(2, Calculator.isValidExpression(input));

        //test decimal values
        input = "3.5*6+10.2";
        assertEquals(3, Calculator.isValidExpression(input));

        //test leading zeros
        input = "3+067-56";
        assertEquals(4, Calculator.isValidExpression(input));
    }
}

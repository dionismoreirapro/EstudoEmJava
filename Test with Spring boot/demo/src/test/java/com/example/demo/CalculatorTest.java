package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
   @Test
    public void calculaSomaDeDoisNumerosTest(){
        Calculator calculadora = new Calculator();

      assertEquals(22,calculadora.sum(20,2));
    }

}

package com.cydeo.tests;

import com.cydeo.pages.CalculatorPage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class CalculatorPOMTest {

    CalculatorPage calculatorPage = new CalculatorPage();


    @Test
    public void multiplyTest(){
        calculatorPage.clickSingleDigit(5);
        calculatorPage.multiply.click();
        //calculatorPage.multiply(); as a method
        calculatorPage.clickSingleDigit(8);
        calculatorPage.equals.click();

        String result = calculatorPage.result.getText();

        System.out.println("result = " + result);

        assertEquals(40,Integer.parseInt(result));



    }



}

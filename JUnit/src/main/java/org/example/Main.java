package org.example;

public class Main {
    public static void main(String[] args) {
        Calc c = new Calc();
        int result = c.divide(10,2);
        int expectedOutput = 3;

        if(result == expectedOutput)
            System.out.println("Test case passed");
        else
            System.out.println("Test case failed");
    }
}
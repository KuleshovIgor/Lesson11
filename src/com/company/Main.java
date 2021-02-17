package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.valueOf;

public class Main {

    public static void main(String[] args) throws IOException, MyException {

        System.out.println("Enter the number 1 or 2");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer n = parseInt(reader.readLine());
        String s = "абвгд";
        StringBuffer sb = new StringBuffer(s);

        if (n == 1) {
            Consumer<String> printer = String -> System.out.println(sb.reverse());
            printer.accept(sb.toString());
        } else if (n == 2) {
            UnaryOperator<Integer> fac = value -> getFactorial(value);
            System.out.println(fac.apply(4));
        } else  if (n != 1 && n != 2){
            throw new MyException("You entered the wrong number");
        }

    }
        private static Integer getFactorial (Integer value){
            int result = 1;
            for (int i = 1; i <= value; i++) {
                result = result * i;
            }
            return result;
        }


}
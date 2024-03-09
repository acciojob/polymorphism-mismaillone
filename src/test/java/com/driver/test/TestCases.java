package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class TestCases {
     static class Product {
        public int product(int x, int y ) {
            return  x * y;
        }

        public int product(int x, int y, int z) {
            return x + y + z ;
        }

        public double product(double x, double y)
        {
            return  x / y;
        }
    }



    public static void main(String[] args) {
            Product p = new Product();

            int result = p.product(5, 4);
            System.out.println(result);
            int sum = p.product(12, 5, 3);

            System.out.println(sum);

            double div  = p.product(12.5, 1.5);

            System.out.println(div);

    }
}

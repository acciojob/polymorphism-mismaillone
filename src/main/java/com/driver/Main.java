package com.driver;

public class Main {
   public static class Product {

        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }

    }

    public static void main(String[] args) {
        Product p = new Product();
        double res = p.product(15.5, 15.2); 
        int sum = p.product(12, 5);
        int sub = p.product(15, 12);
        System.out.println(sum);
        System.out.println(res);
        System.out.println(sub);
    }
}

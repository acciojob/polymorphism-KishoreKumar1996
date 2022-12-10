package com.driver;

public class Main {

        public static class product {
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
        product p=new product();
        int a=p.product(1,2);
        int b=p.product(1,2,3);
        double c= p.product(1.3,5.6);
        System.out.println(a+" "+b+" "+c);
    }
}
package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p=new Product();
        int ans1=p.product(10,25);
        int ans2=p.product(13,22,31);
        double ans3= p.product(1.3,5.6);
        System.out.println(ans1+" "+ans2+" "+ans3);
    }

        public static class Product {
           public int product(int x, int y) {

                return x * y;
            }

            public int product(int x, int y, int z) {

                return x * y * z;
            }

            public double  product(double x, double y) {

                return x * y;
            }

        }

}
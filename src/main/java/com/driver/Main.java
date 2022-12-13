package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p=new Product();
        int ans1=p.Product(10,25);
        int ans2=p.Product(13,22,31);
        double ans3= p.Product(1.3,5.6);
        System.out.println(ans1+" "+ans2+" "+ans3);
    }

        public static class Product {
           public int Product(int x, int y) {

                return x * y;
            }

            public int Product(int x, int y, int z) {

                return x * y * z;
            }

            public double  Product(double x, double y) {

                return x * y;
            }

        }

}
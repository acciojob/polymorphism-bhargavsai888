package com.driver;

public class Main {
    public static class Product{
   public int product(int x,int y){
    int ans=x*y;
    return ans;
 }
   public int product(int x,int y,int z){
            int value=x*y*z;
            return value;
        }
        public double product(double x,double y){
            double value=x*y;
            return value;
        }
    }
    public static void main(String[] args) {
        Product p=new Product();
        int firstValue=p.product(2,3);
        int secondValue=p.product(2,3,7);
        double thirdValue=p.product(2.7,3.0);
    }

}
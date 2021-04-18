package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of the digits in number 124 is " +  sumDigits(543));
        System.out.println("The sum of the digits in number 124 is " +  sumDigits(-234));
        System.out.println("The sum of the digits in number 124 is " +  sumDigits(7));
        System.out.println("The sum of the digits in number 124 is " +  sumDigits(445353));
    }
    public static int sumDigits(int number){
      if(number<10){
        return -1;
    }
      int sum=0;
      while(number>0){
          int digit= number%10;
          sum +=digit;
          number /=10;

      }
      return sum;

      }
}

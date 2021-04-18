package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 45));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (temperature >= 25 && temperature <= 35) {
            return  true;
        }else if(temperature>=25 && temperature <= 45){
        }
        return  false;
      }
}



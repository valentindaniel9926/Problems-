package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(bark(true,2));

    }


    public static boolean bark(boolean barking, int houroftheday) {
        if (barking == false || houroftheday < 0 || houroftheday > 23)
            return false;
        else if (barking == true && houroftheday >= 0 && houroftheday < 8)
            return true;
        else if (barking == true && houroftheday >= 22 && houroftheday < 23)
            return true;
        else return false; }
}

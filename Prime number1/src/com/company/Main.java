package com.company;

public class Main {

    public static void main(String[] args) {
	int count=0;
	for(int i=10;i<=50;i++){
	    if(isPrime(i)){
	    count++;
        System.out.println("Number " + i + " is a prime number");
        if(count==3){
            System.out.println("Exiting for loop");
            break;
        }
    }
    }
}

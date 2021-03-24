package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner read = new Scanner (System.in);
        String name = read.nextLine ( );
        int age = read.nextInt ( );

        System.out.println ("Hello Jaysam!" + name +age );
    }
}

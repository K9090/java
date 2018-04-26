package com.timo;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
	    int myInt = 2_147_483_645;

        // byte has a width of 8
        byte myByte = -128;

        // short has a width of 16
        short myShort = -32768;

        // long has a width of 64
        long myNewLong = myShort / (myByte);
        System.out.println("myNewLong:" + myNewLong);
    }
}

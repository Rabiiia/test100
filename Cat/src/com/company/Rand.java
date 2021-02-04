package com.company;

public class Rand
{
    public int RandomNumber(int high, int low)
    {
        java.util.Random rand = new java.util.Random();
        return rand.nextInt(high-low + 1);
    }
}

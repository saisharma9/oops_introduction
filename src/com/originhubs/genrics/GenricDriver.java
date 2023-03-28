package com.originhubs.genrics;

public class GenricDriver
{
    public static void main(String[] args)
    {
        CustomClass k = new CustomClass();

        k.addElement("Sai");
        k.addElement("Sharma");
        k.addElement(89);


        System.out.println(k.toString());
    }
}

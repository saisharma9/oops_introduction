package com.originhubs.exception;

public class UncheckedException
{
    public static void main(String[] args)
    {


        //ArthimeticException
        try
        {
            int a=9 , b=0;
            int c=a/b;
            System.out.println("Result : "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot be divided by 0");
        }

        //NullPointerException

try{
    String k = null;
    int l = k.length();
    System.out.println("The length is : " +l);
}

catch (NullPointerException e){
    System.out.println("NullPointerException.");
}

//StirngIndexoutofbound

        try{

            String name="Sharma";
            char k = name.charAt(5);
            System.out.println("The char is " + k);
        }
         catch (Exception e) {
             System.out.println("the exception is : " );
             e.printStackTrace();
         }



    }



}

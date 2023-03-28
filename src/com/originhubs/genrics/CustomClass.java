package com.originhubs.genrics;

import java.util.*;
public class CustomClass <T>
{
    ArrayList<T> list = new ArrayList<T>() ;

    public void addElement( T element)
    {
        list.add(element);
    }

    public void removeElement(T element)
    {
        list.remove(element);
    }



    @Override
    public java.lang.String toString() {
        return list.toString();
    }
}

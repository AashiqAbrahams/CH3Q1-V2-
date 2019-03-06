package com.aashiq;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;



public class PersonTest
{
    private Person aashiq = new Person("Aashiq");


    @Test
    public void getName() throws Exception{
        assertEquals("Aashiq", aashiq.getName());
    }


}

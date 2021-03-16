package com.curso;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class LibreriaTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void suma5y8()
    {
        assertTrue( 13==Libreria.suma(5,8) );
    }
}

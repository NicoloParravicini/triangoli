/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_tpsit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nicolo
 */
public class TriangoloTest {

    public TriangoloTest() {
    }

    /**
     * Test of calcolaPerimetro method, of class Triangolo.
     */
    @Test
    public void testCalcolaPerimetro() {

        double a = 10;
        double b = 15;
        double c = 12;

        System.out.println("calcolaPerimetro");
        Triangolo instance = new Triangolo(a, b, c);
        double expResult = 37;
        double result = instance.calcolaPerimetro();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of calcolaArea method, of class Triangolo.
     */
    @Test
    public void testCalcolaArea() {

        double a = 3;
        double b = 4;
        double c = 5;

        System.out.println("calcolaArea");
        Triangolo instance = new Triangolo(a, b, c);
        double expResult = 6;
        double result = instance.calcolaArea();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void classificaTriangolo() {

        double a = 13;
        double b = 13;
        double c = 13;

        System.out.println("classificazione triangolo");
        Triangolo instance = new Triangolo(a, b, c);
        String expResult = "il triangolo è equilatero";
        String result = instance.classificaTriangolo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }


}

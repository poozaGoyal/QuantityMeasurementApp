package com.apps.quantitymeasurementapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuantityMeasurementAppTest {

    @Test
    public void testFeetEquality_SameValue() {
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(5.0);
        QuantityMeasurementApp.Feet feet2 = new QuantityMeasurementApp.Feet(5.0);
        assertTrue(feet1.equals(feet2));
    }

    @Test
    public void testFeetEquality_DifferentValue() {
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(5.0);
        QuantityMeasurementApp.Feet feet2 = new QuantityMeasurementApp.Feet(6.0);
        assertFalse(feet1.equals(feet2));
    }

    @Test
    public void testFeetEquality_NullReference() {
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(5.0);
        assertFalse(feet1.equals(null));
    }

    @Test
    public void testFeetEquality_DifferentClass() {
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(5.0);
        assertFalse(feet1.equals("abc"));
    }

    @Test
    public void testFeetEquality_SameReference() {
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(5.0);
        assertTrue(feet1.equals(feet1));
    }


}

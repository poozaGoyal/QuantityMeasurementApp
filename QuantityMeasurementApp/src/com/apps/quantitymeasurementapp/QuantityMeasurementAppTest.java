package com.apps.quantitymeasurementapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void testInchesEquality_SameValue() {
        QuantityMeasurementApp.Inches inches1 = new QuantityMeasurementApp.Inches(5.0);
        QuantityMeasurementApp.Inches inches2 = new QuantityMeasurementApp.Inches(5.0);
        assertTrue(inches1.equals(inches2));
    }

    @Test
    public void testInchesEquality_DifferentValue() {
        QuantityMeasurementApp.Inches inches1 = new QuantityMeasurementApp.Inches(5.0);
        QuantityMeasurementApp.Inches inches2 = new QuantityMeasurementApp.Inches(6.0);
        assertFalse(inches1.equals(inches2));
    }

    @Test
    public void testInchesEquality_NullReference() {
        QuantityMeasurementApp.Inches inches = new QuantityMeasurementApp.Inches(5.0);
        assertFalse(inches.equals(null));
    }

    @Test
    public void testInchesEquality_DifferentClass() {
        QuantityMeasurementApp.Inches inches = new QuantityMeasurementApp.Inches(5.0);
        assertFalse(inches.equals("abc"));
    }

    @Test
    public void testInchesEquality_SameReference() {
        QuantityMeasurementApp.Inches inches = new QuantityMeasurementApp.Inches(5.0);
        assertTrue(inches.equals(inches));
    }

    @Test
    public void testFeetInchesComparison() {
        Length feet = new Length(1.0, Length.LengthUnit.FEET);
        Length inches = new Length(34, Length.LengthUnit.INCHES);
        assertFalse(feet.equals(inches));
    }

    @Test
    public void yardsEquals36Inches() {
        assertTrue(QuantityMeasurementApp.demonstrateLengthComparison(1, Length.LengthUnit.YARDS,
                36, Length.LengthUnit.INCHES));
    }

    @Test
    public void centimeterEquals39Points3701Inches() {
        assertTrue(QuantityMeasurementApp.demonstrateLengthComparison(100, Length.LengthUnit.CENTIMETERS,
                39.3701, Length.LengthUnit.INCHES));
    }

    @Test
    public void threeFeetEqualsOneYard() {
        assertTrue(QuantityMeasurementApp.demonstrateLengthComparison(3.0, Length.LengthUnit.FEET,
                1.0, Length.LengthUnit.YARDS));
    }

    @Test
    public void differentValuesSameUnitNotEqual() {
        Length feet1 = new Length(5.0, Length.LengthUnit.FEET);
        Length feet2 = new Length(6.0, Length.LengthUnit.FEET);
        assertFalse(feet1.equals(feet2));
    }

    @Test
    public void equalsReturnsFalseForNull() {
        Length feet = new Length(5.0, Length.LengthUnit.FEET);
        assertFalse(feet.equals(null));
    }

}

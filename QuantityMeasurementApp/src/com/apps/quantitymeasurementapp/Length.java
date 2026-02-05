package com.apps.quantitymeasurementapp;

public class Length {
    private double value;
    private LengthUnit unit;

    public enum LengthUnit {
        FEET(12.0),
        INCHES(1.0),
        YARDS(36.0),
        CENTIMETERS(0.393701);

        private final double conversionFactor;

        LengthUnit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        public double getConversionFactor(){
            return conversionFactor;
        }
    }
    public Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    private double convertToBaseUnit(){
        return value * unit.getConversionFactor();
    }

    public boolean compare(Length length){
        return Double.compare(this.convertToBaseUnit(), length.convertToBaseUnit()) == 0;
    }

    public Length convertTo(LengthUnit targetUnit) {
        final double epsilon = 1e-6;
        if(targetUnit == null || this.unit == null)
            throw new IllegalArgumentException();
        if (this.unit == targetUnit)
            return this;
        if (this.value == 0.0)
            return new Length(0.0, targetUnit);
        if(Double.isInfinite(value) || Double.isNaN(value))
            throw new IllegalArgumentException("Invalid length value: " + this.value);

        if (this.convertToBaseUnit() / targetUnit.getConversionFactor() > Double.MAX_VALUE || this.convertToBaseUnit() / targetUnit.getConversionFactor() < -Double.MAX_VALUE
        || this.convertToBaseUnit() / targetUnit.getConversionFactor() < Double.MIN_VALUE && this.convertToBaseUnit() / targetUnit.getConversionFactor() > -Double.MIN_VALUE)
            throw new ArithmeticException("Overflow and Underflow occurred during conversion");
        if (Math.abs(this.convertToBaseUnit() / targetUnit.getConversionFactor()) < epsilon)
        {

        }
        double targetValue = this.convertToBaseUnit() / targetUnit.getConversionFactor();
        Length length = new Length(targetValue, targetUnit);
        length.value = Double.parseDouble(length.toString());
        return length;
    }

    @Override
    public String toString() {
        return String.format("%.2f", value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return this.compare((Length) obj);
    }

    public static void main(String[] args) {
        Length length1 = new Length(1.0, LengthUnit.FEET);
        Length length2 = new Length(12.0, LengthUnit.INCHES);
        Length length3 = new Length(10.0, LengthUnit.INCHES);
        Length length4 = new Length(30.48, LengthUnit.CENTIMETERS);
        Length length5 = new Length(43443, LengthUnit.YARDS);
        Length length6 = new Length(-36.0, LengthUnit.INCHES);

        System.out.println("Are lengths equal? " + length1.equals(length2));
        System.out.println("Are lengths equal? " + length2.equals(length3));
        System.out.println("Are lengths equal? " + length1.equals(length4));
        System.out.println("Are lengths equal? " + length5.equals(length1));

        System.out.println(length1.convertTo(LengthUnit.INCHES));
        System.out.println(length2.convertTo(LengthUnit.YARDS));
        System.out.println(length6.convertTo(LengthUnit.YARDS));
        System.out.println(length5.convertTo(LengthUnit.INCHES));

    }
}

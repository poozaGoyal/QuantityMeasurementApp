package com.apps.quantitymeasurementapp;

public class Length {
    private double value;
    private LengthUnit unit;

    public enum LengthUnit {
        FEET(12.0),
        INCHES(1.0);

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

        System.out.println("Are lengths equal? " + length1.equals(length2));
        System.out.println("Are lengths equal? " + length2.equals(length3));
    }
}

package com.apps.quantitymeasurementapp;

public class QuantityMeasurementApp {

    public static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null) return false;
            if (!(obj instanceof Feet)) return false;
            Feet other = (Feet) obj;
            return Double.compare(value, other.value) == 0;
        }

    }

    public static class Inches {
        private final double value;

        public Inches(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null) return false;
            if (!(obj instanceof Inches)) return false;
            Inches other = (Inches) obj;
            return Double.compare(value, other.value) == 0;
        }

    }

    public static void demonstrateFeetEquality() {
        Feet feet1 = new Feet(5.0);
        Feet feet2 = new Feet(5.0);
        Feet feet3 = new Feet(6.0);
        Feet feet4 = null;

        System.out.println("feet1 equals feet2: " + feet1.equals(feet2)); // true
        System.out.println("feet1 equals feet3: " + feet1.equals(feet3)); // false
        System.out.println("feet1 equals feet4: " + feet1.equals(feet1)); // true
        System.out.println("feet1 equals feet4: " + feet1.equals(feet4)); // false
        System.out.println("feet1 equals feet3: " + feet1.equals("abc")); // false
    }

    public static void demonstrateInchesEquality() {
        Inches inches1 = new Inches(10.0);
        Inches inches2 = new Inches(10.0);
        Inches inches3 = new Inches(12.0);
        Inches inches4 = null;

        System.out.println("inches1 equals inches2: " + inches1.equals(inches2)); // true
        System.out.println("inches1 equals inches3: " + inches1.equals(inches3)); // false
        System.out.println("inches1 equals inches4: " + inches1.equals(inches1)); // true
        System.out.println("inches1 equals inches4: " + inches1.equals(inches4)); // false
        System.out.println("inches1 equals inches3: " + inches1.equals("abc")); // false
    }

    public static void main(String[] args) {
        demonstrateFeetEquality();
        demonstrateInchesEquality();
    }
}

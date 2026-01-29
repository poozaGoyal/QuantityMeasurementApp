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

    public static void main(String[] args) {
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
}

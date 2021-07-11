package com.company;

public class Calculation {
    public double D;
    double arr[] = new double[2];
    public double[] calculation(double a, double b, double c) {
        D = b * b - 4 * a * c;
        if (D > 0) {
            double d = Math.sqrt(D);
            arr[0] = (-b-d)/(2 * a);
            arr[1] = (-b+d)/(2 * a);
            return arr;
        } else if (D == 0) {
            arr[0] = (-b)/(2 * a);
            return arr;
        }
        return null;
    }
}

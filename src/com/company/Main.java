package com.company;

import java.util.Scanner;

public class Main {
    public static class QuaEquation {
        private double a;
        private double b;
        private double c;

        public double getA() {
            return a;
        }

        public void setA(double a) {
            this.a = a;
        }

        public double getB() {
            return b;
        }

        public void setB(double b) {
            this.b = b;
        }

        public double getC() {
            return c;
        }

        public void setC(double c) {
            this.c = c;
        }

        public QuaEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public double getDelta() {
           double delta = Math.pow(this.b, 2) - 4 * this.a * this.c;
           return delta;
        }

        public double getRoot1() {
            return (-this.b - Math.sqrt(this.getDelta())) / (2 * this.a);
        }

        public double getRoot2() {
            return (-this.b + Math.sqrt(this.getDelta())) / (2 * this.a);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the a: ");
        double a = sc.nextDouble();

        System.out.println("Enter the b: ");
        double b = sc.nextDouble();

        System.out.println("Enter the c: ");
        double c = sc.nextDouble();

        QuaEquation qE = new QuaEquation(a, b, c);

        System.out.println(qE.getRoot1());
        System.out.println(qE.getRoot2());

        System.out.println(qE.getDelta());

    }
}

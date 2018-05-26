package com.csinc;
import java.util.Scanner;

//java Calculator program

public class Calculator {
        private float a;
        private float b;
        private float result;
        private int operator;
        private Scanner input = new Scanner(System.in);
        private boolean exitCalculator = false;

        public void cal() {
            while (!exitCalculator) {

                System.out.println("Enter 1 for addition");
                System.out.println("Enter 2 for subtraction");
                System.out.println("Enter 3 for multiplication");
                System.out.println("Enter 4 for division");
                System.out.println("Enter 5 for Exit : ");
                operator = input.nextInt();

                switch (operator) {
                    case 1:
                        result = addition();
                        System.out.println("Result is " + result);
                        break;

                    case 2:
                        result = subtraction();
                        System.out.println("Result is " + result);
                        break;

                    case 3:
                        result = multiplication();
                        System.out.println("Result is " + result);
                        break;

                    case 4:
                        result = divide();
                        System.out.println("Result is " + result);
                        break;

                    case 5:
                        exitCalculator = true;
                        System.out.println("Calculator program Terminated \n");
                        break;

                    default:
                        System.out.println("Please provide proper input \n");

                }
            }
        }

        private float addition() {
            System.out.println("Enter first number : ");
            a = input.nextInt();
            System.out.println("Enter second number : ");
            b = input.nextInt();
            return a + b;
        }

        private float subtraction() {
            System.out.println("Enter first number : ");
            a = input.nextInt();
            System.out.println("Enter second number : ");
            b = input.nextInt();
            return a - b;
        }

        private float multiplication() {
            System.out.println("Enter first number : ");
            a = input.nextInt();
            System.out.println("Enter second number : ");
            b = input.nextInt();
            return a * b;
        }

        private float divide() {
            System.out.println("Enter first number : ");
            a = input.nextInt();
            System.out.println("Enter second number : ");
            b = input.nextInt();
            return a / b;
        }

    }


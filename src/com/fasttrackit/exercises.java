package com.fasttrackit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        ex1(scan);
//        ex2(scan);
//        ex3(scan);
//        ex4(scan);
//        ex5(scan);
//        ex6(scan);
//        ex7(scan);
//        ex8(scan);
//        ex9(scan);
//        ex10(scan);
//        ex11(scan);
//        ex12(scan);
        ex13(scan);

    }

    public static void ex1(Scanner scan) {
        System.out.println("FORMULA ENTRU SUMA PATRATELOR PRIMELOR 'n' NUMERE NATURALE:  1^2 + 2^2 + 3^2 + 4^2 + ... n^2 = [n (n + 1)*(2n+1)] / 6 ");
        System.out.print("n = ");
        int n = scan.nextInt();
        int sum = n * (n + 1) * (2 * n + 1) / 6;
        System.out.println("Suma patratelor primelor " + n + " numere naturale este : " + sum);
    }

    public static void ex2(Scanner scan) {
        double sum = 0;
        int counter = 0;
        Boolean stop = true;
        System.out.println("\n" + "\n" + "Enter numbers to calculate average" + "\n" + "enter '-1' to see result" + "\n" + "\n");
        while (stop) {
            System.out.print("Enter number:  ");
            double number = scan.nextDouble();
            sum += number;
            counter++;
            if (number == -1) {
                stop = false;
            }
        }
        System.out.println("Average = " + (sum / counter));
    }

    public static void ex3(Scanner scan) {
        double sum = 0;
        int counter = 0;
        char text;
        System.out.println("\n" + "\n" + "Enter numbers to calculate average" + "\n" + "Enter '-1' to see result" + "\n");
        double number = 0;
        do {
            System.out.print("Enter number: ");
            number = scan.nextDouble();
            sum += number;
            counter++;
        }
        while (number != -1);
        System.out.println("\n" + "Average = " + (sum / counter));
    }

    public static void ex4(Scanner scan) {
        System.out.print("Enter the number of elements you want to compare: ");
        int arrsize = scan.nextInt();
        int arr[] = new int[arrsize];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element: ");
            arr[i] = scan.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arrsize; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("max number is : " + max + "\n" + "min number is : " + min);
    }

    public static void ex5(Scanner scan) {
        System.out.print("Enter the number of elements of the array has : ");
        int arrLength = scan.nextInt();
        int arr[] = new int[arrLength];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element: ");
            arr[i] = scan.nextInt();
        }
        int firstHalf[] = Arrays.copyOfRange(arr, 0, arrLength / 2);
        int secondHalf[] = Arrays.copyOfRange(arr, arr.length / 2, arrLength);

        ArrayList<Integer> seenBeforeList = new ArrayList<>();
        int countForDouble = 0;
        for (int i = 0; i < firstHalf.length; i++) {
            int value = firstHalf[i];
            countForDouble++;

            if (seenBeforeList.contains(value) && countForDouble < 3) {
                System.out.println("Duplicate Element in the first half of array : " + value);
            } else {
                seenBeforeList.add(value);
            }
        }

        ArrayList<Integer> seenTreeList = new ArrayList<>();
        int countForOddTriple = 0;
        for (int i = 0; i < secondHalf.length; i++) {
            int value = secondHalf[i];
            countForOddTriple++;
            if (seenTreeList.contains(value) && countForOddTriple < 4 && (countForOddTriple % 2 != 0)) {
                System.out.println("Three times and odd  element in the second part of array: " + value);
            } else {
                seenTreeList.add(value);
            }
        }
        for (int i = 0; i < secondHalf.length; i++) {
            if (secondHalf[i] % 2 == 0) {
                System.out.println("Half of the even number from the second part of arr: " + secondHalf[i] / 2);
            }
        }
    }

    public static void ex6(Scanner scan) {
        System.out.print("Enter the number  : ");
        int[] arr = IntStream.rangeClosed(9, 24).toArray();
        int number = scan.nextInt();
        boolean isPresent = false;
        int check = 0;
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                check += number;
            }
        }
        if (check != 0) {
            isPresent = true;

        }
        System.out.println(isPresent);
    }

    public static void ex7(Scanner scan) {
        System.out.println("calculul puterilor");
        System.out.print("introduceto baza: ");
        double base = scan.nextInt();
        System.out.print("introduceti exponentul :");
        double exponent = scan.nextInt();
        double result = Math.pow(base, exponent);
        System.out.println(base + " la puterea  " + exponent + " = " + result);
    }


    public static void ex8(Scanner scan) {
        System.out.print("Enter a number to calculate factorial: ");
        int number = scan.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

    public static void ex9(Scanner scan) {
        System.out.print("Enter the number of elements of the array has : ");
        int arrsize = scan.nextInt();
        int arr[] = new int[arrsize];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element: ");
            arr[i] = scan.nextInt();
        }
        for (int i = 1; i < arrsize - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println(arr[i] + " " + arr[i + 1]);
            } else {
                System.out.println(arr[i + 1] + " " + arr[i]);
            }
        }
    }

    public static void ex10(Scanner scan) {
        System.out.println("calculul sumei : suma = 1+x+x la puterea 2 + x la puterea 3 + ….+ x la puterea n . ");
        System.out.print("introduceti vaoarea lui x: ");
        double x = scan.nextInt();
        System.out.print("introduceti valoarea lui n :");
        double exponent = scan.nextInt();
        double result = ((1 - Math.pow(x, exponent + 1)) / (1 - x));
        System.out.println("rezultat : " + result);
    }

    public static void ex11(Scanner scan) {
        System.out.print("Enter the number of elements of the array has : ");
        int arrsize = scan.nextInt();
        int arr[] = new int[arrsize];
        String isTrue = "crescator";
        String isFalse = "descrescator";
        boolean trueOrFalse = false;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element: ");
            arr[i] = scan.nextInt();
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                trueOrFalse = true;
            } else {
                trueOrFalse = false;
                break;
            }

        }
        if (trueOrFalse == true) {
            System.out.println(isTrue);
        } else {
            System.out.println(isFalse);
        }
    }

    public static void ex12(Scanner scan) {
        System.out.print("Enter the number of elements of the array has : ");
        int arrsize = scan.nextInt();
        int arr[] = new int[arrsize];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element: ");
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the range in which you want to search. Ex: 4 - 20");
        int[] range = IntStream.rangeClosed(scan.nextInt(), scan.nextInt()).toArray();
        System.out.println("your range set is : " + Arrays.toString(range));
        ArrayList<Integer> newArray = new ArrayList<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < range.length; j++) {
                if (arr[i] == range[j]) {
                    newArray.add(arr[i]);
                }
            }
        }
        System.out.print("Common elements are: " + Arrays.toString(newArray.toArray()));
    }

    public static void ex13(Scanner scan) {
        System.out.print("Enter the number of elements of the array has : ");
        int arrsize = scan.nextInt();
        int arr[] = new int[arrsize];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element: ");
            arr[i] = scan.nextInt();
        }
        ArrayList<Integer> newArray = new ArrayList<>(arr.length);
        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] || arr[i] > arr[i + 1]) {
                newArray.add(arr[i]);
            }
        }
        System.out.print("Common elements are: " + Arrays.toString(newArray.toArray()));
    }
}

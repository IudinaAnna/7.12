package com.company;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        int i=0;
        int Array[]=new int[100];
        Scanner input=new Scanner(System.in);
        do {
            System.out.print((i + 1) + " Число=");
            int n = input.nextInt();
            if (elemanVarmı(Array, n) == false) {
                if( n>=10 && n<=100) {
                    Array[i] = n;
                    i++;
                }
            } else if (elemanVarmı(Array, n) == true) {
                System.out.println("Повторите ввод: ");
            }
        }while (i < 5);
    }
    private static boolean elemanVarmı(int Array[], int n) {
        for (int i = 0; i < Array.length; i++)
        {
            if(Array[i]==n)
            {
                return true;
            }
        }
        return false;
    }
}


package com.company;

public class Main {
    public static void main(String[] args) {
        int n = 4536597;
        int p = 0;
        int i = 0;
        cifre(n, i, p);

    }
    private static void cifre(int n, int i, int p){
        int uc = 0;
        if (n>0){
            uc = n %10;
            if (uc % 2 == 0){
                p = p * 10 + uc;
            }else{
                i = i * 10 + uc;
            }
            n = n / 10;
            cifre(n, i, p);
        }else{
            System.out.println("p=" + invNumber(p));
            System.out.println("i=" + invNumber(i));
        }
    }

    private static int invNumber(int n){
        int i = 0;
        while (n > 0){
            i = i * 10 + n % 10;
            n = n / 10;
        }
        return i;
    }
}

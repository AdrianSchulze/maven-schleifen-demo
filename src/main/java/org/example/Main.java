package org.example;

public class Main {
    public static void main(String[] args) {
    }

    public static int facultyGenerator(int var) {

        if(var == 0) {
            return 1;
        }
        else {
            int ergebnis = 1;
            for(int i=1;i<=var;i++)
            {
                ergebnis *= i;

            }
            return ergebnis;
        }

    }
}
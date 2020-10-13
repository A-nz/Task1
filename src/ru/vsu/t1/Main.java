package ru.vsu.t1;

import java.util.Scanner;

public class Main {
    
    public static void main (String[] args){
        double T1= getValue("температура 1");
        double T2= getValue("температура 2");
        double V1= getValue("объём 1");
        double V2= getValue("объём 2");

        double volume = mixVolume(V1, V2);
        double temp = mixTemp(T1, T2);
        printMixTempAndMixVolume(volume, temp);
    }

    private static double mixTemp (double T1, double T2) {
        return ((T1+T2) / 2);
    }

    private static double mixVolume (double V1, double V2) {
        return (V1+V2);
    }

    private static double getValue(String nameOfValue) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("%s=", nameOfValue);
        return scanner.nextDouble();

    }

    private static void printMixTempAndMixVolume(double volume, double temp) {
        System.out.println("Объём смеси равен: " + volume);
        System.out.println("Температура смеси равна: " + temp);
    }

}
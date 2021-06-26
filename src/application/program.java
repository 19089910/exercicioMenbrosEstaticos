package application;

import utilities.conversorDeMoeda;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o preço em dólar? obs: a IOF = 0,06 em CADA DOLA COMPRADO");
        double precoDola = sc.nextDouble();
        System.out.println("Quantos dólares serão comprados?");
        double quantidade = sc.nextDouble();
        System.out.println("Valor a ser pago em reais SEM IOF: " + conversorDeMoeda.semIOF(precoDola, quantidade));
        System.out.println("Valor a ser pago em reais COM IOF: " + conversorDeMoeda.dolaParaReal(precoDola, quantidade));


    }
}

/**
 * Na empresa onde trabalhamos, há tabelas com o quanto foi gasto em cada mês. Para fechar
 * o balaço do primeiro trimestre, precisamos somar o gasto total. Sabendo que, em Janeiro,
 * foram gastos 15000 reais, em fevereiro 2300 reais e em março, 17000 reais, faça um programa
 * que calcule e imprima o gasto do trimestre.
 */

public class balaco {

    public static void main(String[] args) {

        int janeiro = 15000, feveriro = 23000, marco = 17000,soma;
        soma = janeiro+feveriro+marco;

        System.out.printf("A soma do trimestre foi de %d",soma);

    }
}

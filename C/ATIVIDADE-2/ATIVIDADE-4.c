/*04. Faça um programa em C que calcule o reajuste do salário de um funcionário. 
Para isso, o programa deverá ler o salário atual do funcionário e ler o percentual
de reajuste. Ao final imprimir o valor do novo salário.*/

#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL,"Portuguese");
    float salario_atual,reajuste,porcentagem;

    printf("Qual é o valor do seu salario atual: ");
    scanf("%f", &salario_atual);

    printf("Qual é a porcentagem do reajuste: ")
    scanf("%f", &porcentagem);

    reajuste = salario_atual + (salario_atual* porcentagem/100);

    printf("O seu saldo com o reajuste é de R$%.2f",reajuste);

}
/*02. Faça um programa em C que leia dois números reais e calcule as quatro operações básicas entre estes dois números, adição, subtração, multiplicação e divisão. Ao final, o programa deve imprimir os 
resultados dos cálculos.*/
#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL,"Portuguese");
    int numero1, numero2;

    printf("Digite o primeiro numero: ");
    scanf("%d", &numero1);
    printf("Digite o segundo número: ");
    scanf("%d",&numero2);

    printf("A soma dos dois números %d + %d é %d");
    printf("A subtração dos dois números %d - %d é %d");
    printf("A multiplicação dos dois números %d * %d é %d");
    printf("A divisão dos dois números %d / %d é %d");
}

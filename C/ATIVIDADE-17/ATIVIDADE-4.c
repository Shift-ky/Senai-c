/*04. Faça um programa em C que leia um número e um expoente, após a leitura, calcule e imprima a potência do número lido em relação ao expoente também lido.
*/
#include <stdio.h>
#include <math.h>
int main()
{
    float num,expoente;

    printf("Digite um valor: : ");
    scanf("%f",&num);

    printf("Digite o expoente: ");
    scanf("%f",&expoente);
    

    printf("O resultado é %f",pow(num,expoente));

}

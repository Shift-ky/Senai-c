/*03. Faça um programa em C que calcule a área de um retângulo, para isso o programa deve ler a altura e a base. O cálculo deve ser feito em uma função. Após calcular o programa deve imprimir o valor da área do retângulo. 
*/

#include <stdio.h>

float area(float a, float b)
{
    return a*b;
}
int main()
{
    float altura,base;

    printf("Digite o valor da altura: ");
    scanf("%f",&altura);

    printf("Digite o valor da base>: ");
    scanf("%f",&base);

    printf("A area do retangulo e %.2f",area(altura,base));

}

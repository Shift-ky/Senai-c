/*03. Faça um programa em C que calcule a conversão entre graus centígrados e Fah�renheit. Para isso, leia o valor em centígrados e calcule com base na fórmula a
seguir. Após calcular o programa deve imprimir o resultado da conversão. 
F =
9∗C +160/5 
Em que: 
• F = Graus em Fahrenheit 
• C = Graus centígrados
*/
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL,"Portuguese");
    float graus, fah;

    printf("Digite o valor em graus: ");
    scanf("%f",&graus);

    fah = (graus* 9/5) + 32;

    printf("%.2f Gruas em Fahrenheit é: %f\n",graus,fah);



}

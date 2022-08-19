/*02. Faça um programa em C que leia um número real e imprima ¼ deste número.
*/
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL,"");
    float numero,qua;

    printf("Digite um valor: ");
    scanf("%f",&numero);

    qua = numero * 0.25;

    printf("1 \\4do numero %f é : %f\n",numero,qua);



}

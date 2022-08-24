/*01. Faça um programa em C que permita entrar com o ano de nascimento da pessoa e com o 
ano atual. O programa deve imprimir a idade da pessoa. Não se esqueça de verificar se o ano 
de nascimento informado é válido.
 */

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");

    int atual = 2022, ano, idade;

    printf("Informe o ano de nascimento: ");
    scanf("%d", &ano);

    if (ano > 0 && ano <= 2022)
    {
        idade = atual - ano;
        printf("Asua idade é: %d", idade);
    }
    else
    {
        printf("Data de nascimeto inválido");
    }
}
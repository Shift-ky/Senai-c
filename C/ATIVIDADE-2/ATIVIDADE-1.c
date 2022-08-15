/*01. Idade;*/

#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL,"Portugueses");

    int idade;
    printf("Digite a sua idade: ");
    scanf("%d",&idade);

    printf("Voce tem %d anos \n",idade);
}

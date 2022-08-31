/*5. Faça um algoritmo estruturado que leia uma quantidade não determinada de números positivos. Calcule a quantidade de números pares e ímpares, a média de valores pares e a média geral dos números lidos. O número que encerrará a leitura será zero.
*/
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


int main()
{
    setlocale(LC_ALL,"Portuguese");

    int cont=0,somaCont=0,cont2=0;
    int somaPar=0,somaImpar=0,contPar=0,contImpar=0;

    while (cont >= 0)
    {
        printf("Digite um valor positivo ou um negativo para encerrar o programa\n-> ");
        scanf("%d",&cont);

        if(cont > 0)
        {
            somaCont += cont;
            ++cont2;
            if(cont %2 == 0)
            {
                somaPar +=cont;
                contPar++;
            }else
            {
                somaImpar += cont;
                contImpar++;
            }

        }
    }
    printf("A soma dos números pares é: %d\n",somaPar);
    printf("A soma dos números impares é: %d\n",somaImpar);
    printf("A media dos números digitados é: %d\n",somaCont/cont2);
    printf("A media dos números Impares é: %d\n",somaImpar/contImpar);
    printf("A média dos números pares é: %d\n",somaPar/contPar);
}

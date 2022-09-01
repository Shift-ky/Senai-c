/*2. Faça um programa que receba do usuário um vetor X com 10 posições. Em seguida deverão ser impressos o maior e o menor elemento desse vetor.
*/

#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL,"Portuguese");

    int numeros[10],cont,maior,menor;

    for(int i = 0; i < 10; i++)
    {
        printf("Digite o %d valor: ",i+1);
        scanf("%d",&numeros[i]);
    }

    for(int i = 0; i <  10; i++)
    {
        if(i == 1){
            maior = numeros[i];
            menor = numeros[i];
        } else if( numeros[i] > maior)
        {
            maior = numeros[i];
        } else if( numeros[i] < menor)
        {
            menor = numeros[i];
        }
    }
    printf("O maior número digitado foi: %d\n",maior);
    printf("O menor número digitado foi: %d\n", menor);

    
}
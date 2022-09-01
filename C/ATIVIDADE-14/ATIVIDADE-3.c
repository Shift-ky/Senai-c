/*3. Faça um programa que receba do usuário dois vetor, A e B, com 10 números inteiros cada. Crie um novo vetor C calculando C = A − B. Mostre na tela os dados do vetor C.
*/

#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL,"Portuguese");

    int a[10],b[10],c[10];

    for(int i = 0; i <10; i++)
    {
        printf("Digite o %d valor para o vetor A: ",i+1);
        scanf("%d",&a[i]);
        printf("\n");
        printf("Digite o %d valor para o vetor B: ",i+1);
        scanf("%d",&b[i]);
        printf("\n");
    }
    for(int i = 0; i < 10; i ++)
    {
        printf("%d - %d = %d\n",a[i],b[i],a[i]-b[i]);
    }
}
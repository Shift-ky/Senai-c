/*05. Faça um programa que leia um vetor com tamanho 10 de números inteiros. Após ler, uma função deve criar um novo vetor com base no primeiro, mas, o novo vetor deve ser ordenado de forma crescente. O programa deve imprimir este novo vetor após a ordenação.*/

#include <stdio.h>
int vet[10];

int main(){
    int i;
    for(i = 0; i <10; i++)
    {
        printf("Disite %d numero do vetor: ",i+1);
        scanf("%d",&vet[i]);
    }
    ordenar();
    for(i = 0; i < 10; i++)
    {
        printf("VETOR ORDENADO: %d\n",vet[i]);
    }
    printf("\n");
    system("pause");
}

void ordenar()
{
    int i, j, aux;

    for( i = 0; i < 10; i++)
    {
        for(j = i + 1; j < 10; j++)
        {
            if(vet[i]> vet[j])
            {
                aux = vet[i];
                vet[i] = vet[j];
                vet[j] = aux;
            }
        }
    }

}
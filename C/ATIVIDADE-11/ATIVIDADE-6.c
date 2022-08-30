/*6. Faça um programa que leia as médias finais de vários alunos de uma turma e 
mostre a maior média, a menor média e a média aritmética da turma. 
O programa para quando encontrar uma média negativa.*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


int main()
    {
        setlocale(LC_ALL, "Portuguese");

        int cont;
        float somaMedia, valor = 0,maior = 0,menor = 999;

        while(valor >= 0) {
            printf("Digite %d nota ou -1 para sair: ",cont);
            scanf("%f",&valor);
            if(valor >=0){
                somaMedia += valor;
                cont++;

                if(valor > maior){
                    maior = valor;
                } else if(valor < menor) {
                    menor = valor;
                }

            }
        }
        printf("O maior valor digitado foi %.1f\n",maior);
        printf("O menor valor digitado foi: %.1f\n",menor);
        printf("A média da turma é: %.1f"\n,somaMedia/cont);
    }


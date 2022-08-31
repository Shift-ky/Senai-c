/*1. Desenvolver um algoritmo que leia a altura de 5 pessoas. Este programa deverá calcular e
mostrar :
   a. A menor altura do grupo;
   b. A maior altura do grupo;
*/
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


int main()
    {
        setlocale(LC_ALL, "Portuguese");


        int cont = 0;
        float altura, somaAltura = 0, maior,menor;

        while(cont < 5){
            printf("Informe a %d altura ",cont+1);
            scanf("%f",&altura);

            somaAltura +=altura;

            if(cont == 1){
                menor = altura;
                maior = altura;
            }
            if(altura > maior){
                    maior = altura;
            } else if(altura < menor) {
                menor = altura;
            }
            cont++;
        }
        printf("A maior altura digitada foi %.2f\n",maior);
        printf("A menor altura digitada foi %.2f\n",menor);
        printf("A média das altura digitada é %.2f\n",somaAltura/5);
    }


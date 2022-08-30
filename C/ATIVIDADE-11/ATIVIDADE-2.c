/*2. Escrever um programa para exibir os números de 1 até 50 na tela.*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


int main()
    {
        setlocale(LC_ALL, "Portuguese");

        int op = 1;

        while(op <=50){
            printf("%d\n",op);
            op++;
        }

    }
/*1. Crie um programa que imprima 11 vezes a frase " Hello World!" utilizando uma estrutura de repetição while.
*/
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


int main()
    {
        setlocale(LC_ALL, "Portuguese");

        int op = 1;

        while(op <=11){
            printf("hello, world\n");
            op++;
        }

    }

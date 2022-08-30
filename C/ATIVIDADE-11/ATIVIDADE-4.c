/*
4. Faça um programa que mostre a tabuada de um número N (N será lido do teclado).*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


int main()
    {
        setlocale(LC_ALL, "Portuguese");

        int num,op = 0;
        printf("Digite um número para ver a sua taboada: ");
        scanf("%d",&num);

        while(op <=10){
            printf("%2d X %2d = %2d: \n",num,op,num*op);
            op++;
        }


    }

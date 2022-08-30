/*
3. Crie um programa para ler 3 notas e mostrar a média delas.*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


int main()
    {
        setlocale(LC_ALL, "Portuguese");

        int op = 1;
        float nota, somaNota;

        while(op <=3){
            printf("Digite a %d nota: ",op);
            scanf("%f",&nota);
            op++;
            somaNota += nota;
        }
        printf("A média é: %.2f",somaNota / 3);

    }


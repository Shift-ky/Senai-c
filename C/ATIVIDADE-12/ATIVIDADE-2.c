/*2. Escreva um algoritmo que leia um valor inicial A e imprima a sequência de valores do cálculo de A! e o seu resultado. Ex: 5! = 5 X 4 X 3 X 2 X 1 = 120
*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


int main()
    {
        setlocale(LC_ALL, "Portuguese");


        int num, cont = 0, soma = 1;

        printf("Digite um valor: ");
        scanf("%d",&num);
        printf("%d! = ", num);

        while(cont < num){
            if(cont < num - 1){
                printf(" %d X",num-cont);
            }else{
                printf(" %d = ", num - cont);
            }
            ++cont;
            soma*=cont;
    }
    printf("%d",soma);
    return 0;
}



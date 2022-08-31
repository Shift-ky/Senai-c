/*3. Desenvolver um algoritmo que efetue a soma de todos os números ímpares que são múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


int main() {

    setlocale(LC_ALL, "Portuguese");

    int cont = 1, soma = 0;

    while(cont <= 500){
        if(cont %2 == 0){
            if(cont %3 == 0){
                soma +=cont;
            }
        }
        cont++;
    }
    printf("A soma dos números ímpares e multiplos de 3 são: %d",soma);
}

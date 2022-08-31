/*4. Escrever um algoritmo que leia uma quantidade desconhecida de números e conte quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve terminar quando for lido um número negativo.
*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


int main()
    {
        setlocale(LC_ALL, "Portuguese");

        int num,cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;

        while (num >=0) {
            printf("Digite um número: ");
            scanf("%d", &num);

            if (num >=0 && num <= 25) {
                cont1++;
            } else if( num >= 26 && num <= 50) {
                cont2++;
            } else if(num >=51 && num <= 75){
                cont3++;
            } else if(num >= 76 && num <= 100){
            cont4++;
            }
        }
        printf("Foram digitados %d entre os número de 0 até 25\n",cont1);
        printf("Foram digitados %d entre os número de 26 até 50\n",cont2);
        printf("Foram digitados %d entre os número de 51 até 75\n",cont3);
        printf("Foram digitados %d entre os número de 76 até 100\n",cont4);
}

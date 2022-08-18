/**
 * @author Robson Paiva (robson-costa@outlook.com.br)
 * @version 0.1
 */
/*02. Faça um programa em C que leia um número real e calcule o quadrado deste número. Ao final, o programa deve imprimir o resultado do cálculo.
*/

#include <stdio.h>
#include <stdlib.h>
# include <locale.h>

int main()
{
    setlocale(LC_ALL,"");

    float numero;

        printf("Digite um número: ");
        scanf("%f",&numero);

        printf("O quadrado do número %.2f é %.2f",numero,numero*numero);

}
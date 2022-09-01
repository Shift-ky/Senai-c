/*4. Faça um programa que preencha um vetor de tamanho 100 com os 100 primeiros números naturais que não são múltiplos de 7. Ao final, imprima esse vetor na tela.
*/
#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL,"Portuguese");

    int numeros[100],a=0;

    for(int i = 0; i < 116; i++)
    {
        if(i % 7 != 0)
        {
            a+=1;
            numeros[a] = i;
        }
    }
for(int i = 0; i < 100; i++)
{
    printf("%d\n",numeros[i]);
}
   
}
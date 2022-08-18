/**
 * @author Robson Paiva (robson-costa@outlook.com.br)
 * @version 0.1

 */
/*03. Faça um programa em C que leia a base e a altura de um retângulo e imprima o perímetro (base + altura) e a área (base * altura).
*/
#include <stdio.h>
#include <stdlib.h>
# include <locale.h>

int main()
{
    setlocale(LC_ALL,"");

    float base,altura,areaQuadrada,perimetro;

        printf("Digite o valor da base: ");
        scanf("%f",&base);

        printf("Digite a altura: ");
        scanf("%f",&altura);


        perimetro = base + altura;

        areaQuadrada = base * altura;

        printf("O perimetro é: %.2f \n,perimetro",perimetro);
        printf("A área é: %.2f",areaQuadrada);

}

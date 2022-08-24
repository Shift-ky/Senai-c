/*02. Em um campeonato nacional de arco-e-flecha, tem-se equipes de três jogadores
para cada estado. Sabendo-se que os arqueiros de uma equipe não obtiveram o mesmo
número de pontos, criar um programa em C que informe se uma equipe foi classificada,
de acordo com a seguinte especificação: 
• Ler os pontos obtidos por cada jogador da equipe; 
• Mostrar esses valores em ordem decrescente; 
• Se a soma dos pontos for maior do que 100, imprimir a média aritmética entre eles, 
caso contrário, imprimir a mensagem "Equipe desclassificada".
*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


int main()
{
    setlocale(LC_ALL,"Portuguese");

    float num1, num2, num3, somap;

    printf("PONTOS DA EQUIPE\n");
    printf("Informe a nota do primeiro jogador: ");
    scanf("%f",&num1);

     printf("Informe a nota do segundo jogador: ");
     scanf("%f",&num2);

     printf("Informe a nota do terceiro jogador: ");
     scanf("%f",&num3);

     somap = num1 + num2 + num3;

     if(somap > 100 ){
        printf("A média dos jogadores é: %.2f \n",somap/3);
        printf("NOTAS DA MAIOR PARA MENOR\n");

        if(num1 < num2 && num2 < num3){
            printf("%f\n%f\n%f",num3,num2,num1);
        } else if(num3 < num2 && num1 < num3){
            printf("%f\n%f\n%f",num2,num3,num1);
        } else if(num2 < num3 && num3 < num1){
            printf("%f\n%f\n%f",num1,num3,num2);
        } else if(num3 < num1 && num1 < num2){
            printf("%f\n%f\n%f",num2,num1,num3);
        } else {
            printf("%f\n%f\n%f",num1,num2,num3);
        }

     } else{
        printf("Equipe desclassificada");
     }
}

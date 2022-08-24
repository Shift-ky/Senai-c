/*05. Escreva um programa em linguagem C que leia um peso na Terra e o número
de um planeta e imprima o valor correspondente do peso neste planeta. A relação
 de planetas é dada a seguir juntamente com o valor das gravidades relativas à Terra.
 Código   Gravidade Relativa   Planeta 
1              0,37               Mercúrio 
2              0,88               Vênus 
3              0,38               Marte 
4              2,64               Júpiter 
5              1,15               Saturno 
6              1,17               Urano  

Para calcular o peso no planeta use a fórmula: 
PP = PT/10×G 
Em que: 
• PP = Peso no planeta 
• PT = Peso na Terra 
• G = Gravidade relativa  
UTILIZE O SWITCH CASE,*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


int main()
{
    setlocale(LC_ALL,"Portuguese");

    int planeta;
    float peso,pesoPlan;

    printf("Digite o valor em kilo: ");
    scanf("%f",&peso);

    printf("SELECIONE UM PLANETA \n[1] - MERCÚRIO \n[2] - VÊNUS \n[3] - MARTE \n[4] - JUPITER \n[5] - SATURNO \n[6] - URANO\n->");
    scanf("%d",&planeta);

    switch(planeta){
case 1:
    pesoPlan = (peso / 10) * 0.37;
    printf("%f kilos em MERCRIO é %f",peso,pesoPlan);
    break;

case 2:
    pesoPlan = (peso / 10) * 0.88;
    printf("%f kilos em VÊNUS é %f",peso,pesoPlan);

    break;

case 3:
    pesoPlan = (peso / 10) * 0.38;
    printf("%f kilos em MARTE é %f",peso,pesoPlan);
    break;

case 4:
    pesoPlan = (peso / 10) * 2.64;
    printf("%f kilos em JÚPITER é %f",peso,pesoPlan);
    break;

case 5:
    pesoPlan = (peso / 10) * 1.15;
    printf("%f kilos em SATURNO é %f",peso,pesoPlan);
    break;

case 6:
    pesoPlan = (peso / 10) * 1.17;
    printf("%f kilos em URANO é %f",peso,pesoPlan);
    }



}
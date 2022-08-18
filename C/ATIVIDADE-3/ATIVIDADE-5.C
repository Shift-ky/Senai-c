/**
 * @author Robson Paiva (robson-costa@outlook.com.br)
 * @version 0.1
 */

/*05.  Faça um programa em C que calcule a quantidade de litros de combustível consumidos em uma viagem, sabendo-se que o carro tem autonomia de 12 km por litro de combustível. O programa deverá ler o tempo decorrido na viagem e a velocidade média e aplicar as fórmulas: 
D = T ×V 
L =
D/12 
 Em que: 
• D = Distância percorrida em horas 
• T = Tempo decorrido 
• V = Velocidade média 
• L = Litros de combustível consumidos

*/
#include <stdio.h>
#include <stdlib.h>
# include <locale.h>

int main()
{
    setlocale(LC_ALL,"");
    float tempo, velocidade, dis, consumo;

        printf("Digite a duração da viagem em horas: ");
        scanf("%f",&tempo);

        printf("Digite a velocidade média do carro: ");
        scanf("%f",&velocidade);

        dis = tempo * velocidade;
        consumo = dis/12;

        printf("O tempo total percorrido do seu carro foi: %.2f horas\n",dis);
        printf("A velocidade média do seu carro é: %f km/h",consumo);

}
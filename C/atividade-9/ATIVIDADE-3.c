/*03. Construa um programa que leia o percurso em quilómetros, o tipo do carro
 e informe o consumo estimado de combustível, sabendo-se que um carro tipo A faz
  12 km com um litro de gasolina, um tipo B faz 9 km e o tipo C, 8 km por litro.
   UTILIZE O SWITCH CASE;
*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


int main()
{
    setlocale(LC_ALL,"Portuguese");

    float kl,litro;
    int tipo;

    printf("INFORME A CATEGORIA DO CARRO \n[1] - CLASSE A \n[2] - CLASSE B \n[3] - CLASSE C \n-> ");
    scanf("%d",&tipo);


    switch(tipo){
    case 1:
        printf("Informe a quilometragem: ");
        scanf("%f",&kl);

        litro = kl /12;
        break;

    case 2:
        printf("Informe a quilometragem: ");
        scanf("%f",&kl);

        litro = kl /9;
        break;
    case 3:

        printf("Informe a quilometragem: ");
        scanf("%f",&kl);

        litro = kl /8;
        break;

        default: printf("Opção inválida");
        break;
    }
    printf("Você precisará de %.2f litros de gasolina para percorrer %.2f kilometros",litro,kl);
}

/*04. Crie um programa que informe a quantidade total de calorias de uma refeição a 
partir da escolha do usuário que deverá informar o prato, a sobremesa, e bebida 
conforme a tabela a seguir
Prato                                 Sobremesa                             Bebida
Vegetariano 180cal       Abacaxi 75cal                        Chá 20cal 
Peixe 230cal                   Sorvete diet 110cal                Suco de laranja 70cal 
Frango 250cal                Mousse diet 170cal                Suco de melão 100cal 
Carne 350cal                  Mousse chocolate 200cal     Refrigerante diet 65cal
*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>


int main()
    {
        setlocale(LC_ALL, "Portuguese");

        int principal,sobremessa, bebida,calorias;
        printf("Escolha o seu prato principal: \n\n");
        printf("[1] - VEGANO \n[2] - PEIXE \n[3] - FRANGO \n[4] - CARNE \n-> ");
        scanf("%d",&principal);

        printf("Escolha a sua sobremessa: ");
        printf("\n[1] - ABACAXI \n[2] - SORVETE DIET \n[3] - MOUSSE DIET \n[4] - MOUSSE DE CHOCOLATE  \n-> ");
        scanf("%d",&sobremessa);

        printf("Escolha a sua bebida: ");
        printf("\n[1] - CHÁ \n[2] - SUCO DE LARANJA \n[3] - SUCO DE MELÃO \n[4] - REFRIGERANTE \n-> ");
        scanf("%d",&bebida);

        switch (principal){
        case 1:
            calorias += 180;
            break;
        case 2:
            calorias += 230;
            break;
        case 3:
            calorias += 250;
            break;
        case 4:
            calorias += 350;
            break;

        }

        switch (sobremessa){
        case 1:
            calorias += 75;
            break;
        case 2:
            calorias += 110;
            break;
        case 3:
            calorias += 170;
            break;
        case 4:
            calorias += 200;
            break;

        }
         switch (bebida){
        case 1:
            calorias += 20;
            break;
        case 2:
            calorias += 70;
            break;
        case 3:
            calorias += 100;
            break;
        case 4:
            calorias += 65;
            break;

        }
        printf("O TOTAL DE CALORIAS CONSUMIDAS NA REFEIÇÃO FOI %d",calorias);



    }
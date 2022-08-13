/**
 * @file ola-mundo.c
 * @author Robson Paiva (robson-costa@outlook.com.br)
 * @brief O programa mostrara o nome  endereço e telefone na tela
 * @version 0.1
 * @date 2022-04-26
 *
 * @copyright Copyright (c) 2022
 *
 */
/*Faça um programa que mostre o seu nome, endereço e telefone*/
#include <stdio.h>
#include <stdlib.h>

int main()
{

   char nome[7] = "Robson";
   char endereco[16] = "Rua sem nome 25";
   char telefone[17] = "(85) 9 9999-9999";

   printf(nome);
   printf("\n");
   printf(endereco);
   printf("\n");
   printf(telefone);

}

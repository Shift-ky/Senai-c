/**
 * @file ola-mundo.c
 * @author Robson Paiva (robson-costa@outlook.com.br)
 * @brief O programa mostrara a media do aluno
 * @version 0.1
 * @date 2022-04-26
 *
 * @copyright Copyright (c) 2022
 *
 */
/*Faça um programa que mostre a média de um aluno*/
#include <stdio.h>
#include <stdlib.h>

int main()
{
    float nota1 = 10.0, nota2=4, media;
    media = (nota1 + nota2)/2;

    printf("%.2f",media);

}

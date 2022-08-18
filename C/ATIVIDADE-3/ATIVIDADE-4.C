/**
 * @author Robson Paiva (robson-costa@outlook.com.br)
 * @version 0.1
 */

/*04.  Faça um programa em C que calcule o perímetro e a area de uma circunferencia de raio R (fornecido pelo usuario).
*/
#include <stdio.h>
#include <stdlib.h>
# include <locale.h>
#define PI 3.14

int main()
{
    setlocale(LC_ALL,"");

    float circun, r =3;

    circun = PI * (r*r);

    printf("%f",circun);
}

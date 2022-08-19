/*04. Supondo que A, B e C são variáveis do tipo inteiro, com valores iguais a 5, 10 e -8, respectivamente, e uma variável D com valor de 1.5, quais os resultados das expressões aritméticas apresentadas em seguida?
a) 2 * A mod 3 – C
b) ( 30 mod 4 * pot ( 3, 3 ) ) * -1 
c) pot ( -C, 2 ) + ( D * 10 ) / A  
*/
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL,"Portuguese");
   int a = 5, b = 10, c = 8;
   float qa,qb,qc;
   float d = 1.5;

   qa = 3 * a % 3 - c;
   qb = (30 % 4 * pow(3,3))* -1;
   qc = pow(-c,2) + (d*10) / a;

   printf("\n\t%f",qa);
   printf("\n\t%f",qb);
   printf("\n\t%f",qc);


}

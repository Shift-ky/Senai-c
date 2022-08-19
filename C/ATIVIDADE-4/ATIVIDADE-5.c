/*05. Determine os resultados obtidos na avaliação das expressões lógicas seguintes, sabendo que A, B, e C contêm, respectivamente, 2, 7 e 3.5 e que existe uma variável lógica L cujo valor é falso (F):
a) B = A * C e ( L ou V )
b) L e B div A >= C ou não A <= C 
c) B / A = C ou B / A <> C 
d) L ou pot ( B , A ) <= C * 10 + A * B*/
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
# include <stdbool.h>
#include <math.h>

int main()
{
    setlocale(LC_ALL,"Portuguese");
   int a = 2, b = 7;
   float c = 3.5;

   bool l = false;
   bool v = true;

   printf("%d\n",b == a * c && (l || v));

   printf("%d\n", l && b/a >= c || !a <= c);

   printf("%d\n", b / a == c || b/ a != c);

   printf("%d\n", l || pow(b,a) <= c * 10 + a * b);


}

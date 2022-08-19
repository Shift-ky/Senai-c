/*1 - Ler três valores para os lados de um triângulo, considerando lados como: A, B
e C. Verificar se os lados fornecidos formam realmente um triângulo, e se for
esta condição verdadeira, deve ser indicado qual o tipo de triângulo foi
informado: isósceles, escaleno ou equilátero.

Dicas:
1 - é necessário saber em primeiro lugar o que é realmente um triângulo
2 - um triângulo é isósceles quando possui dois lados iguais e um diferente,
escaleno quando possui todos os lados diferentes, é equilátero quando possui
todos os lados iguais.
*/
#include <stdio.h>
#include <locale.h>

int main() {
    int a, b, c;

    printf("Digite tres valores: ");
    scanf("%d%d%d", &a, &b, &c);

    if(a + b > c && a + c > b && b + c > a){
        printf("Os 3 lados formam um triangulo!\n");
        if(a == b && a == c)
            printf("Equilatero\n");
        else
            if(a == b || a == c || b == c)
                printf("Isosceles\n");
            else
                printf("Escaleno\n");
    }
    else
        printf("Os 3 lados NAO formam um trinagulo!\n");
}
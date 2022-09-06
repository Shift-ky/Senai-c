/*01. 4 operações da matemática com funções;
*/

#include <stdio.h>
#include <stdlib.h>

int somar(int num1, int num2){
    return num1+num2;
}
int subtrair(int num1, int num2){
    if(num1>num2){
        return num1-num2;
    }else{
        return num2-num1;
    }    
}
int multiplicar(int num1, int num2){
    return num1*num2;
}
float dividir(int num1, int num2){
    return num1/num2;
}

int main()
{
    int n1,n2,opcao;
    printf("Digite o primeiro numero: \n");
    scanf("%i",&n1);
    printf("Digite o primeiro numero: \n");
    scanf("%i",&n2);
    printf("Escolha uma opcao: \n");
    printf("1 - Somar \n");
    printf("2 - Subtrair \n");
    printf("3 - Multiplicar \n");
    printf("4 - Dividir \n");
    scanf("%i",&opcao);
   
    switch(opcao){
      case 1:
        int soma = somar(n1,n2);
        printf("%i",soma);
        break;
      case 2:
        printf("Resultado: %i",subtrair(n1,n2));
        break;
      case 3:
        printf("Resultado: %i",multiplicar(n1,n2));
        break;
      case 4:
        printf("Resultado: %i",dividir(n1,n2));
        break;
      default
        printf("Operacao invalida!!");        
    }
    //chamada da função
   
   
    return 0;
}
/*2 - Construir um programa que calcule o salário líquido de um professor. Para elaborar o programa, você deve possuir alguns dados, tais como: valor da hora aula, número de horas trabalhadas no mês e percentual de desconto do INSS. Em primeiro lugar, deve-se estabelecer o seu salário bruto para fazer o desconto e ter o valor do salário líquido.


Salário de contribuição 
Alíquota
Até R$ 1.100
7,5%

De R$ 1.100,01 a R$ 2.203,48
9%

De R$ 2.203,49 até R$ 3.305,22
12%

De R$ 3.305,23 até R$ 6.433,57
14%*/
#include <stdio.h>
#include <locale.h>

int main(){
    
    setlocale(LC_ALL,"Portuguese")
    float valorHora, horaTra, inss, inssDes,salLi,ali,sBruto;

    printf("Informe o valor da Hora Aula: ");
    scanf(" %f",&valorHora);

    printf("Informe quantas horas trabalhadas esse mês:" );
    scanf(" %f",&horaTra);

    printf("Qual o Percentual do INSS: ");
    scanf("%f",&inss);

    sBruto = valorHora * horaTra;

    inssDes = (sBruto*inss)/100;

    salLi = sBruto - inssDes;

    if(sBruto <= 1.100){
        ali = (sBruto * 7.5)/100;
    }else if(sBruto > 1100 && sBruto < 2203.43){
        ali = sBruto*9 /100;
    } else if(sBruto > 2203,49 && sBruto < 3305.22){
        ali =  sBruto * 12 /100;
    } else if(sBruto > 3305.23 < 6433.57){
        ali = sBruto* 14 /100;
    }
    printf("O salário líquido é: R$ %.2f ",salLi - ali);
}

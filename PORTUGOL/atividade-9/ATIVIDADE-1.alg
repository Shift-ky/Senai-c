//01. Faça um algoritmo que leia dois números inteiros e imprima a subtração deles. Observação:
//a subtração NUNCA pode ser negativa.

algoritmo "semnome"
var
n1,n2,soma:inteiro
inicio

   escreva("Digite um valor: ")
   leia(n1)
   escreva("Digite outro valor: ")
   leia(n2)
   
   se n2 > n1 entao
      soma <- n2 - n1
      senao
         soma <- n1 + n2
   fimse
   escreva("A subtracao dos numeros �: ",soma)

fimalgoritmo
//04. Faça um algoritmo que leia 10 valores e ao final imprima a média aritmética dos valores lidos.
//Use o PARA.

algoritmo "semnome"
var
i:inteiro
numero,tot,media:real
inicio
      para i de 1 ate 10 faca
           escreva("Digite o ",i," Valor")
           leia(numero)
           
           tot <- tot + numero
      fimpara
      media <- tot / 10
      escreva("A medi dos numeros digitados e: ",media:5:2)
fimalgoritmo
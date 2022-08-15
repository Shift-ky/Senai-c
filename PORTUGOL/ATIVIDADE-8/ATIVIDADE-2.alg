//02. Faça um algoritmo que leia dois valores inteiros e efetue a adição. Caso o valor somado seja
//maior que 20, este deverá ser apresentado somando-se a ele mais 8, caso o valor somado seja menor
//ou igual a 20, este deverá ser apresentado subtraindo-se 5.
algoritmo "semnome"
var
i: inteiro
n1,n2,soma:inteiro
inicio
      escreva("Digite um n�mero: ")
      leia(n1)
      escreva("Digite outro numero: ")
      leia(n2)
      
      soma <- n1 + n2
      se soma <= 20 entao
         soma <- soma - 5
         senao
              soma <- soma + 8
      fimse
      escreva(soma)
fimalgoritmo
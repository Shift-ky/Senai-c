//02. Escreva um algoritmo que leia dois números reais e escreva “iguais”
//se os números foremiguais e “diferentes” se os números forem diferentes.

algoritmo "numeros diferentes"

var
numero1, numero2: real
inicio

escreval("Digite o primeiro número: ")
leia(numero1)

escreval("Digite o segundo número: ")
leia(numero2)

se numero1 <> numero2 entao
   escreval("O numero ",numero1," é diferente do numero ", numero2)
senao
     escreval("O numero ",numero1," é igual ao numero ", numero2)
fimse
fimalgoritmo
//04. Faça um algoritmo que permita entrar com o nome, a idade e o sexo de 20 pessoas. 
//    O programa deve imprimir o nome da pessoa se ela for do sexo masculino e tiver mais de 21 anos.


algoritmo "semnome"
var
j,idade: inteiro
sexo, nome: caractere
inicio
      para j de 1 ate 20 faca
           escreva("Digite o nome da ",j," pessoa: ")
           leia(nome)
           escreva("Digite a idade: ")
           leia(idade)
           escreva("Digito o sexo [m/f]: ")
           leia(sexo)
           
           se (sexo = "m") e (idade >= 21) entao
              escreval("===========================================")
              escreval("= nome, é masculino e tem mais de 21 anos =")
              escreval("===========================================")

          fimse
      fimpara
fimalgoritmo
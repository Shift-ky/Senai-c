//Faça um algoritmo que leia um número inteiro entre 1 e 12 e escreva o mês
//correspondente. Caso o usuário digite um número fora desse intervalo, deverá
//aparecer uma mensagem informando que não existe mês com este número. Utilize
//o ESCOLHA para este problema.

algoritmo "semnome"
var
mes:inteiro
inicio
escreva("Digite um numero entre 1 e 12: ")
leia(mes)

escolha mes
    caso 1
        escreva("Janeiro")
    caso 2
        escreva("Fevereiro")    
    caso 3
        escreva("Marco")
    caso 4
        escreva("Abril")
    caso 5
        escreva("Maio")
    caso 6
        escreva("Junho")
    caso 7
        escreva("Julho")
    caso 8
        escreva("Agosto")
    caso 9
        escreva("Setembro")
    caso 10
        escreva("Outubro")
    caso 11
        escreva("Novembro")
    caso 12
        escreva("Dezembro")
fimescolha
fimalgoritmo
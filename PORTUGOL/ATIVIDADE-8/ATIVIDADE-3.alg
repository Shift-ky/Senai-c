//03. Uma pousada estipulou o preço para a diária em R$30,00 e mais uma taxa de serviços diários de: 
//• R$15,00, se o número de dias for menor que 10; 
//• R$8,00, se o número de dias for maior ou igual a 10; 
//Faça um algoritmo que imprima o nome, a conta e o número da conta de cada cliente e ao final o total
//faturado pela pousada. Observação: são 10 clientes e utilize o ENQUANTO.

algoritmo "semnome"
var
nome:caractere
   conta,diaria,i:inteiro
   valor,taxa,tot,total:real
nome: caractere
inicio
    escreval("====================================")
    escreval("========= POUSADA SEM NOME =========")
    escreval("====================================")
    enquanto i < 3 faca
        escreva("Digite o seu nome: ")
        leia(nome)
        escreva("Informe o numero da sua conta: ")
        leia(conta)
        escreva("Quantos dias na pousada? ")
        leia(diaria)

        valor <- diaria * 30

        se diaria < 10 entao
            taxa <- 15
            senao
                taxa <- 8
        fimse
        total <- valor + taxa
        tot <- tot + total

        escreval("===================================")
        escreval("Cliente       :",nome")
        escreval("Total a pagar :",total:5:2")
        escreval("Conta         :",conta")
        escreval("===================================")
        i <- i + 1
    fimenquanto
    escreval("Total faturado pela pousada: R$",tot:5:2)
    
               

fimalgoritmo
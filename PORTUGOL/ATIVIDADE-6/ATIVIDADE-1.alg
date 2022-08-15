//01. A prefeitura do Rio de Janeiro abriu uma linha de crédito para os funcionários 
//    estatutários. O valor máximo da prestação não poderá ultrapassar 30% do salário bruto.
//    Faça um programa em Portugol que permita entrar com o salário bruto e o valor da prestação
//    e informar se o empréstimo pode ou não ser concedido.
algoritmo "semnome"
var
valorCasa,salario,valorMaximoPrestacao,valorParcela: real
anos,messes: inteiro
inicio

    escreva("Digite o valor da casa a ser comprada R$ ")
    leia(valorCasa)
    escreva("Digite o valor do se salário mensal R$ ")
    leia(salario)
    escreva("Em quantos anos pretende pagar a casa: ")
    leia(anos)

    valorMaximoPrestacao <- salario*0.30

    messes <- anos * 12

    valorParcela <- valorCasa / messes

    se valorParcela > valorMaximoPrestacao entao
        escreval("EMPRESTIMO NEGADO")
        senao
        escreval("Empréstimo concebido ")
    fimse
    escreval("Obrigado pela preferência!")
fimalgoritmo
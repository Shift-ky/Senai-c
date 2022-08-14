Algoritmo "CALCULADORA"
// Disciplina   : [Linguagem e Lógica de Programção]
// Professor   : juci medeiros
// Descrição   : O programa pede o total de vendas e mostra a comissão
// Autor(a)    : Nome do(a) aluno(a) Robson Pinheiro da Costa Paiva
// Data atual  : 13/04/2022
Var
total_vendas, salario_total,salario_base,comissao: real

Inicio
escreva("Qual foi o valor da sua venda R$: ")
leia(total_vendas)

salario_base <- 1200
comissao <- total_vendas * 0.1
salario_total <- salario_base + comissao

escreval("Seu salario base e de: R$ ",salario_base)
escreval("Comissao ganho R$: ",comissao)
escreval("Total ganho R$ ",salario_total)
Fimalgoritmo
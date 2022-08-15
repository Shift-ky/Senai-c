//03. Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o valor da compra for 
//menor que R$20,00, caso contrário, o lucro será de 30%.Faça um algoritmo que leia o valor do produto 
//e imprima o valor da venda.

algoritmo "semnome"
var
produto,valor_vendas:real
inicio
      escreva("Informe o valor do produto comprado: ")
      leia(produto)
      
      se produto < 20 entao
         valor_vendas <- produto * 1.45
         senao
              valor_vendas <- produto * 1.30
      fimse
      escreva("O produto tem que ser vendido h� R$ ",valor_vendas:5:2)
      escreva("Para poder obter o lucro de 30%")
fimalgoritmo
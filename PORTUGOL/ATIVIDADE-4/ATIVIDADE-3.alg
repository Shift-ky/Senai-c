
//03. Faça um algoritmo que receba o cargo do colaborador(ADVOGADO ou AUDITOR),
//se for advogado o valor da hora de trabalho é R$ 23,00 e se for auditor é R$
//25,00, verifique a quantidade de horas trabalhadas e informe o valor do salário
//bruto, por fim o INSS é de 9% para o advogado e 11% para o auditor, mostre o
//salário líquido.

algoritmo "salario"
var
advogado_vhora,auditor_vhora, horas:real
salario_bruto, inss_advogado,inss_auditor, desconto,salario_final: real
profissional:inteiro
inicio
advogado_vhora <- 23.00
auditor_vhora <- 25.00
inss_advogado <- 0.09
inss_auditor <- 0.11

escreva("Digite a quantidade de horas trabalhada: ")
leia(horas)
escreval("Digite 1 para ADVOGADO")
escreval("Digite 2 para AUDITOR")
leia(profissional)

se profissional = 1 entao
   salario_bruto <- advogado_vhora*horas
   desconto <- salario_bruto * inss_advogado
   salario_final <- salario_bruto - desconto
senao
     se profissional = 2 entao
        salario_bruto <- auditor_vhora * horas
        desconto <- salario_bruto * inss_auditor
        salario_final <- salario_bruto - desconto
     fimse
fimse
escreval(" SALARIO BRUTO.............R$",salario_bruto:5:2)
escreval(" DESCONTO INSS.............R$",desconto:5:2)
escreval(" TOTAL A RECEBER...........R$",salario_final:5:2)

fimalgoritmo
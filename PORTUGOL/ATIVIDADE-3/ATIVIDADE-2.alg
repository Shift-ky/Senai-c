Algoritmo "CALCULADORA"
// Disciplina   : [Linguagem e Lógica de Programção]
// Professor   : juci medeiros
// Descrição   : Calculadora.
// Autor(a)    : Nome do(a) aluno(a) Robson Pinheiro da Costa Paiva
// Data atual  : 13/04/2022
Var
numero1, numero2,resultado: real
opc: caractere

Inicio
escreval("=======================")
escreval("===== CALCULADORA =====")
escreval("=======================")
escreval("Digite o primeiro numero: ")
leia(numero1)
escreval("Digite o segundo número: ")
leia(numero2)

escreval("[+] ADIÇÃO")
escreval("[-] SUBTRACAO")
escreval("[*] MULTIPLICACAO")
escreval("[/] DIVISAO")
leia(opc)

se opc = "+" entao
    resultado <- numero1 + numero2
senao
    se opc = "-" entao
        resultado <- numero1-numero2
    senao
        se resultado = "*" entao
            resultado <- numero1 * numero2
        senao
            se resultado = "/" entao
                     resultado <- numero1/numero2

            fimse
        fimse
    fimse
fimse
escreva(numero1," ",opc," ",numero2," = ",resultado)
Fimalgoritmo

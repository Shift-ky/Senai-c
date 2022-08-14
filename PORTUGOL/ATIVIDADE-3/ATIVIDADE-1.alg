Algoritmo "CALCULADORA"
// Disciplina   : [Linguagem e Lógica de Programção]
// Professor   : juci medeiros
// Descrição   : O programa mostra a média dos alunos, com o comando de decissão SE.
// Autor(a)    : Nome do(a) aluno(a) Robson Pinheiro da Costa Paiva
// Data atual  : 13/04/2022
Var
nota1, nota2,nota3, media: real

Inicio
escreva("Digite a primeira nota do aluno: ")
leia(nota1)

escreva("Digite a segunda nota do aluno: ")
leia(nota2)

escreva("Digite a terceira nota do aluno: ")
leia(nota3)

media <- (nota1+nota2+nota3)/3

se media >= 7 entao
    escreval("Sua média final foi: ",media)
    escreval("E voce está APROVADO")
senao
    se (media >= 5) e (media <= 7) entao
        escreval("Sua média final foi: ",media)
        escreval("E voce está de RECUPERACAO")
    senao
        escreval("Sua média final foi: ",media)
        escreval("E voce está REPROVADO")
    fimse
fimse        

Fimalgoritmo
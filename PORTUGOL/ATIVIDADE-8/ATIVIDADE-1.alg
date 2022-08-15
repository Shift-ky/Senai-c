//01. Crie um algoritmo que permita entrar com o nome, a nota da prova 1 e da prova
//2 de 15 alunos. Ao final, imprimir uma listagem, contendo: nome, nota da prova 1,
//nota da prova 2, e média das notas de cada aluno.

algoritmo "semnome"
var
  i: inteiro
    n1,n2, media:real 
inicio
   

  enquanto i < 3 faca
    escreva("Digite o nome do aluno: ")
    leia(nome)
    escreva("Informe a primeira nota: ")
    leia(n1)
    escreva("Digite a segunda nota: ")
    leia(n2)
               
    media(n1 + n2)/2
    escreval("=================================")
    escreval("O aluno ",nome)
    escreval("Com as notas ",n1," e ",n2)
    escreval("Ficou com a media ",media)
    escreval("=================================")
    i <- - + 1
  fimenquanto
fimalgoritmo
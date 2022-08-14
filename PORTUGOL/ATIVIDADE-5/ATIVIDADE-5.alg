//05. Faça um algoritmo que leia três números inteiros e imprima os três em ordem crescente;
  algoritmo "semnome"
  var
  n1,n2,n3:inteiro
  inicio
  escreva("Digite o pmrimeiro numero: ")
  leia(n1)
  
  escreva("Digite o segundo numero: ")
  leia(n2)
  
  escreva("Digite o terceiro numero: ")
  leia(n3)
  
  se (n1 < n2) e (n2<n3) entao
     escreval(n1,n2,n3)
  senao
       se (n3 < n2) e (n1<n3) entao
            escreval(n1,n3,n2)
            senao
               se (n2 < n1) e (n1<n3) entao
                  escreval(n2,n1,n3)
                  senao
                     se (n2 < n3) e (n3 < n1) entao
                        escreval(n2,n3,n1)
                        senao
                           se (n3 < n1) e (n1 < n2) entao
                              escreval(n3,n1,n2)
                              senao
                              se (n2 < n1) e (n3 < n2) entao
                                 escreval(n3, n2, n1)
                              fimse
                           fimse
                      fimse
                 fimse
            fimse
       fimse
  fimse

  fimalgoritmo
//01. Algoritmo operadores lógicos;
algoritmo "operadores logicos"
var
a,b: inteiro
r1,r2,r3,r4,r5,r6:logico
inicio
se a=b entao
r1 <- verdadeiro
escreva("r1",r1)
senao
     se a <> b entao
        r2 <- verdadeiro
        escreva("r2",r2)
     senao
          se a > b entao
          r3 <- verdadeiro
          escreval("r3",r3)
          senao
               se a < b entao
                  r4 <- verdadeiro
                  escreval("r4",r4)
               senao
                    se a >= b entao
                       r5 <- verdadeiro
                       escreval("r5",r5)
                    senao
                         se a <= b entao
                            r6 <- verdadeiro
                            escreval("r6",r6)
                         senao
                         fimse
                    fimse
               fimse
          fimse
     fimse
fimse

fimalgoritmo
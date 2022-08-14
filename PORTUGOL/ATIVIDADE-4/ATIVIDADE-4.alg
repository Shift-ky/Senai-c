//04. Crie um algoritmo que solicite o nome de um time de futebol ao usuário.
//Se o nome do time informado for "Flamengo", "Fluminense", "Vasco"ou "Botafogo",
//escreva "É um time carioca". Se o nome do time informado for "São Paulo", "Palmeiras",
//"Santos"ou "Corínthians", escreva "É um time paulista". Se o nome do time não for nenhum
//dos citados anteriormente, escreva "Time desconhecido".

algoritmo "time"
var
time: caractere

inicio
      escreval("Digite o nome do seu time: ")
      leia(time)

      se (time = "flamengo") ou (time = "fluminense") ou (time = "vasco") ou (time = "flamengo") ou (time = "botafogo") ou (time = "flamengo") entao
      escreval("� um time carioca")
      senao
           se (time = "Sao Paulo") ou (time = "Paumeiras") ou (time = "Santos") ou (time = "Corinthians") ou (time = "flamengo") entao
           escreva("� um time paulista"
           fimse
      fimse

fimalgoritmo
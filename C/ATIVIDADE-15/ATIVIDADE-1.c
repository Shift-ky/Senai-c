/*01. Faça um programa em C que armazene 15 números inteiros em um vetor e depois permita que o usuário digite um número inteiro para ser buscado no vetor, se for encontrado o programa deve imprimir a posição desse número no vetor, caso contrário, deve imprimir a mensagem: "Nao encontrado!".
*/

int vet[5],i,num,aux=0;
    //FOR para adicionar os valores ao vetor
    for(i=0;i<5;i++){
        printf("\nDigite os valores do vetor:\n");
        scanf("%i",&vet[i]);
    }
    //solicitar ao usuario o numero a procurar
    printf("\nDigite o valor que deseja procurar:\n");
    scanf("%i",&num);
    //FOR para procurar o valor no vetor
    for(i=0;i<5;i++){
        if(vet[i]==num){
            printf("\nNumero encontrado na posicao %i\n",i+1);
            aux=1;
            //break;
        }
   }
   if(aux==0){
      printf("\nValor nao encontrado!!\n");
   }
/*1. Dado o valor do produto e a forma de pagamento.
1= à vista;
2= à prazo.

Se o produto for pago à vista aplique um desconto de 10% antes de mostrar o valor final, senão informe o mesmo valor do produto.

*/
int main() {
    setlocale(LC_ALL,"Portuguese");

    float produto;
    int opc,par;

    printf("Informe o valor do produto: ");
    scanf("%f",&produto);

    printf("Informe a de pagamento\n[1] à vista \n[2] Crédito\n-> ");
    scanf("%d",&opc);

    switch (opc){
case 1:
    printf("O valor final do produto é: R$%.2f",produto * 0.90);
    break;
case 2:
    printf("Informe a quantidade de vezes: ");
    scanf("%d",&par);
    printf("Será %d parcelas de R$%.2f",par, produto/par);
    break;
    default: printf("opção inválida");
    }
}

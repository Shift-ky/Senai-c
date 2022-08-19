/*2. Uma loja fornece 10% de desconto para funcionários e 5% de desconto para clientes vips. Faça um programa que calcule o valor total a ser pago por uma pessoa. O programa deverá ler o valor total da compra efetuada e um código que identifique se o comprador é um cliente comum (1), funcionário (2) ou vip (3).*/

int main() {
    setlocale(LC_ALL,"Portuguese");

    float produto;
    int cliente;

    printf("Informe o cliente:\n\t[1] Cliente *VIP* \n\t[2] Funcionários \n\t[3] Cliente comun \n\t-> : ");
    scanf("%i5",&cliente);

    switch (cliente){
case 1:
    printf("Digite o valor do produto: ");
    scanf("%f",&produto);

    printf("*************************************\n");
    printf("************ CLIENTE VIP ************\n");
    printf("*************************************\n");
    printf("Valor total a pagar: R$%.2f",produto*0.95);
    break;
case 2:
    printf("Digite o valor do produto: ");
    scanf("%f",&produto);

    printf("*************************************\n");
    printf("************ FUNCIONARIO ************\n");
    printf("*************************************\n");
    printf("Valor total a pagar: R$%.2f",produto*0.90);
    break;
case 3:
    printf("Digite o valor do produto: ");
    scanf("%f",&produto);

    printf("***************************************\n");
    printf("*************** CLIENTE ***************\n");
    printf("***************************************\n");
    printf("Valor total a pagar: R$%.2f",produto);
    break;
    default: printf("opção inválida");
    }
}
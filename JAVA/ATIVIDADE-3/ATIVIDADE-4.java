/*04. Escreva um programa que leia o código de um determinado produto e mostre a sua classificação. Utilize a tabela abaixo como referência:
Código               Descrição
1                         Alimento não-perecível
2                         Alimento perecível
3                         Vestuário
4                         Limpeza
*/

import java.util.Scanner;

public class atividade4{
    public static void main(String[] args){
        int opc = 1;

        Scanner entrada = new Scanner(System.in);
        
        while(opc != 0){

            System.out.print("Digite um valor de 1 a 4 ou 0 para sair: ->");
            opc = entrada.nextInt();

            switch (opc) {
                case 0:
                    break;
                case 1:
                    System.out.print("Alimento não perecível");
                    break;
                case 2:
                    System.out.print("Alimento perecível");
                    break;
                case 3:
                    System.out.print("Vestuario");
                    break;
                case 4;
                    System.out.print("Limpeza");
        
                default:
                System.out.print("Opção inválida");
                    break;
            }
        }
        entrada.close();
    }
}
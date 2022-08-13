/**
 * Construa um algoritmo que calcule o peso de uma pessoa. Dados de entrada altura e sexo
 * fórmulas de cálculos do peso:
 * pesso ideal de Homens = (72,7 x altura) - 58
 * peso ideal de mulheres = (62,1 X altura) - 44,7
 */

public class pesoIdeal {
    public static void main(String[] args) {
        double altura,peso;
        char sexo = 'f';

        altura = 1.80;

        if(sexo == 'm')
        {
            System.out.println("PESO IDEAL PARA HOMENS: ");
            peso = (72.2 * altura) -58;
            System.out.printf("O peso ideal é %2f",peso);
        } else
        {
            System.out.println("PESO IDEAL PARA MULHERES");
            peso = (62.1 * altura) - 44.7;
            System.out.printf("O peso ideal é %.2f",peso);

        }

    }
}

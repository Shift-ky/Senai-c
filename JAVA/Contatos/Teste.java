import java.util.Scanner;

/**
 * @author robson Paiva
 */
public class Teste {
     

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        Agenda agenda = new Agenda();
        Contato[] contatos = new Contato[3];
        
        System.out.print("Digite o nome da agenda: ");
        String nome = entrada.nextLine();
        agenda.setNome(nome);
        
        
            for(int i = 0; i < contatos.length; i++){
                Contato contato = new Contato();

                System.out.printf("Digite o nome do %d contato: ",i+1);
                String nome1 = entrada.nextLine();
                contato.setNome(nome1);

                System.out.print("Digite seu email: ");
                String email = entrada.nextLine();
                contato.setEmail(email);

                System.out.println("Digite o número: ");
                String numero = entrada.nextLine();
                contato.setTelefone(numero);
                contatos[i] = contato;

            }
            agenda.setContato(contatos);
            
            System.out.println(agenda.getMostrarContatos());
            
       
        
        entrada.close();
    }
}
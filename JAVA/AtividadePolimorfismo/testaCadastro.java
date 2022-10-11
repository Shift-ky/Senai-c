import java.util.Scanner;

public class testaCadastro {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		CadastroPessoa cadastra = new CadastroPessoa();
		Cliente cliente = new Cliente();
		Funcionario funcionario = new Funcionario();
		Gerente gerente = new Gerente();
		
		boolean menuPrincipal = false;
		boolean menuCadastro;
		boolean menuVisualizar;
		boolean menuFuncionario;
		boolean menuCadastraFuncionario;
		
		
		while(menuPrincipal != true) {
			
			System.out.print(" [1] - CADASTRAR \n [2] - VISUALIZAR \n [3] - SAIR\n-> ");
			int opcaoMenu = Integer.parseInt(entrada.nextLine());
			
			switch (opcaoMenu) {
			case 1:
				menuCadastro = false;
				while(menuCadastro != true) {
					
					System.out.println(" [1] - CLIENTE \n [2] - FUNCIONARIO \n [3] - VOLTAR AO MENU ANTERIOR \n -> ");
					int opcaoCadastrar = Integer.parseInt(entrada.nextLine());
					
					switch (opcaoCadastrar) {
					case 1:

						System.out.print("Nome: ");
						String nomeCliente = entrada.nextLine();
						cliente.setNome(nomeCliente);
						
						System.out.print("Código do cliente: ");
						int codigo = Integer.parseInt(entrada.nextLine());
						cliente.setCodigo(codigo);
						
						System.out.print("Dia de Nascimento: ");
						int dia = Integer.parseInt(entrada.nextLine());
						
						System.out.print("Mês de Nascimento: ");
						int mes = Integer.parseInt(entrada.nextLine());
						
						System.out.print("Ano de Nascimento: ");
						int ano = Integer.parseInt(entrada.nextLine());
						
						Data data = new Data(dia,mes,ano);
						cliente.setData(data);
						
						cadastra.cadastraPessoa(cliente);
						
					break;
					case 2:
						
						menuCadastraFuncionario = false;
						while(menuCadastraFuncionario != true) {
							System.out.println("[1] - FUNCIONARIO \n[2] - GERENTE \n[3] - VOLTAR AO MENU ANTERIOR \n-> ");
							int opcaoCadastrarFuncionario = Integer.parseInt(entrada.nextLine());
							
							switch(opcaoCadastrarFuncionario) {
							case 1:
								System.out.println("Nome: ");
								String nomeFuncionario = entrada.nextLine();
								funcionario.setNome(nomeFuncionario);
								
								System.out.print("Dia de Nascimento: ");
								int diaF = Integer.parseInt(entrada.nextLine());
								
								System.out.print("Mês de Nascimento: ");
								int mesF = Integer.parseInt(entrada.nextLine());
								
								System.out.print("Ano de Nascimento: ");
								int anoF = Integer.parseInt(entrada.nextLine());
								
								Data dataF = new Data(diaF,mesF,anoF);
								funcionario.setData(dataF);
								
								System.out.println("Salario: ");
								float salarioF = Float.parseFloat(entrada.nextLine());
								funcionario.setSalario(salarioF);
								
								cadastra.cadastraPessoa(funcionario);
							break;
							case 2:
								
								System.out.println("Nome: ");
								String nomeGerente = entrada.nextLine();
								gerente.setNome(nomeGerente);
								
								System.out.print("Dia de Nascimento: ");
								int diaG = Integer.parseInt(entrada.nextLine());
								
								System.out.print("Mês de Nascimento: ");
								int mesG = Integer.parseInt(entrada.nextLine());
								
								System.out.print("Ano de Nascimento: ");
								int anoG = Integer.parseInt(entrada.nextLine());
								
								Data dataG = new Data(diaG,mesG,anoG);
								gerente.setData(dataG);
								
								System.out.println("Salario: ");
								float salarioG = Float.parseFloat(entrada.nextLine());
								gerente.setSalario(salarioG);
								
								System.out.println("AREA: ");
								String area = entrada.nextLine();
								gerente.setArea(area);
								cadastra.cadastraPessoa(gerente);
								
								
							break;
							case 3:
								menuCadastraFuncionario = true;
							break;
							default:
								System.out.println("OPÇÃO INVÁLIDA");
							}
						}
					break;
					case 3:
						menuCadastro = true;
						break;
					default:
						System.out.println("OPÇÃO INVÁLIDA");
					}
				}
				
		
			break;
			case 2:
				menuVisualizar = false;
				while(menuVisualizar != true) {
					
					System.out.println(" [1] - VISUALIZAR CLIENTE\n [2] - VISUALIZAR FUNCIOANRIOS\n [3] - TODAS AS PESSOAS\n [4] - VOLTAR AO MENU ANTERIOR \n-> ");
					int opcaoVisualizar = Integer.parseInt(entrada.nextLine());
					
					switch(opcaoVisualizar) {
					case 1:
						System.out.println(cliente.imprimeDados());
					break;
					
					case 2:
						menuFuncionario = false;
						while(menuFuncionario != true) {
							System.out.println(" [1] - FUNCIONARIO\n [2] - GERENTE\n  [3] - VOLTAR AO MENU ANTERIOR \n -> ");
							int opcaoFuncionario = Integer.parseInt(entrada.nextLine());
							
							switch(opcaoFuncionario) {
							case 1:
								System.out.println(funcionario.imprimeDados());
							break;
							case 2:
								System.out.println(gerente.imprimeDados());
							break;
						
							case 3:
								menuFuncionario = true;
							break;
							
							default:
								System.out.println("OPÇÃO INVÁLIDA");
							}
						}
					break;
					
					case 3:
						System.out.println(cadastra.imprimeCadastro());
					break;
					
					case 4:
						menuVisualizar = true;
					}
					
				}
				
				
			break;
			case 3:
				menuPrincipal = true;
			break;
			default:
				System.out.println("OPÇÃO INVÁLIDA");
			}
		}
		
		
		entrada.close();
		
	}

}

import java.util.Scanner;

import modelos.Usuario;
import repositorios.UsuarioRepositorio;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome;
		Integer idade;
		String cpf;
		
		//asasdasd
		UsuarioRepositorio usuarioRepositorio = new UsuarioRepositorio();
				
		System.out.println("Gerenciamento de Usuários");
		Integer opcao = 0;
		while(opcao != 9) {
			System.out.println("Escolha uma opcao");
			System.out.println("1. Cadastrar Usuário");
			System.out.println("2. Listar Usuários");
			System.out.println("9. Sair");
			
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			if(opcao == 1) {
				System.out.println("Cadastro de Usuário");
				System.out.println("Digite o nome do usuário");
				nome = scanner.nextLine();
				
				System.out.println("Digite a idade do usuário");
				idade = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("Digite o cpf do usuário");
				cpf = scanner.nextLine();
				
				Usuario usuario = new Usuario(nome, idade, cpf);
				usuarioRepositorio.adicionar(usuario);
								
			}
			
			if(opcao == 2) {
				System.out.println("Lista de Usuários");
				for(int i = 0; i < usuarioRepositorio.tamanho(); i++) {
					System.out.println(usuarioRepositorio.get(i).toString());
				}
			}
			
		}
				
	}
}

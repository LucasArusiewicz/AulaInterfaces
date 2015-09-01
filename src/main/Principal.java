package main;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	public static final ArrayList<Conta> listaConta = new ArrayList<Conta>();
	public static final ArrayList<Pessoa> listaCliente = new ArrayList<Pessoa>();

	public static final String[] menuPrincipal = {"1 - Escolher conta \n",
	"2 - Criar conta \n",
	"3 - Criar Cliente \n",
	"4 - Sair \n"};

	public static int menuPrincipal(){
		for(String menu: menuPrincipal){
			System.out.print(menu);
		}
		int alt = scan.nextInt();
		return alt;
	}
	
	public static int menuSub(){
		for(String menu: menuSub){
			System.out.print(menu);
		}
		int alt1 = scan.nextInt();
		return alt1;
	}

	public static final String[] menuSub = {"1 - Conta Corrente \n",
			"2 - Conta Poupanca \n",
	"3 - Voltar \n"};

	public static final String[] menuCc = {"1 - Depositar \n",
			"2 - Sacar \n",
			"3 - Saldo \n",
	"4 - Voltar \n"};
	public static int menuCc(){
		for(String menu: menuCc){
			System.out.print(menu);
		}
		int alt2 = scan.nextInt();
		return alt2;
	}
	public static int menuCp(){
		for(String menu: menuCc){
			System.out.print(menu);
		}
		int alt3 = scan.nextInt();
		return alt3;
	}

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean sair = false;
		while (!sair){
			boolean sair2 = false;
			boolean sair5 = false;
			switch (menuPrincipal()){
			case 1:
				while (!sair2){
					boolean sair3 = false;
					boolean sair4 = false;
					switch(menuSub()){
					case 1:
						while(!sair3){
							switch(menuCc()){
							case 1:
								System.out.println("Depositar: ");
								double a = scan.nextDouble(); 
								cc.depositar(a);
								break;
							case 2:
								System.out.println("Sacar: ");
								double b = scan.nextDouble();
								cc.sacar(b);
							case 3:
								System.out.println("Salto: "+cc.getSaldo());
								break;
							case 4:
								sair3 = true;
							}
						}
						break;
					case 2:
						
						while (!sair4){
							switch(menuCp()){
						case 1:
							System.out.println("Depositar: ");
							double a = scan.nextDouble(); 
							.depositar(a);
							break;
						case 2:
							System.out.println("Sacar: ");
							double b = scan.nextDouble();
							cp.sacar(b);
						case 3:
							System.out.println("Salto: "+cp.getSaldo());
							break;
						case 4:
							sair3 = true;
						}
						}
						break;
					case 3:
						sair2 = true;
						break;
					}
				}
				break;
			case 2:
				while(!sair5){
					switch(menuSub()){
					case 1:
						ContaCorrente cc = new ContaCorrente ();
						System.out.println("Dono: ");
						cc.setDonoConta(donoConta);
						break;
					case 2:
						ContaPoupanca cp = new ContaPoupanca ();
						break;
					case 3:
						sair5 = true;
						break;
					}
				}
				break;
			case 3:
				System.out.println("Nome: ");
				String nome = scan.nextLine();
				System.out.println("CPF: ");
				long cpf = scan.nextLong();
				Pessoa pp = new Pessoa (nome,cpf);
			case 4:
				sair = true;
				break;
			}
		}
	}

}

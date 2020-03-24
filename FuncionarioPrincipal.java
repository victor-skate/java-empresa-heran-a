package funcionario;

public class FuncionarioPrincipal {
	 static Funcionario[] lista = new Funcionario[10];
		
		public static void cadastrar(){
			String nome = Teclado.lerString("nome:");
			int matricula= Teclado.lerInt("numero de matricula:");
			Funcionario funcionario= null;
			int op = Teclado.lerInt("(1)horista (2)comissionado");
			switch (op){
			case 1:
				double horasTrabalhadas = Teclado.lerDouble("horas trabalhadas");
				funcionario = new FuncionarioHorista(nome,matricula,horasTrabalhadas);	
				break;
				
			case 2:
				double comissao = Teclado.lerDouble("porcentagem de comissao");
				funcionario = new FuncionarioComissionado(nome,matricula,comissao);
				break;
			}
			
			for (int i = 0; i < lista.length; i++){
				if(lista[i]==null){
					lista[i]=funcionario;
				break;
				}
			}
		System.out.println("cadastrado com sucesso");
		menu();
		}
		
		public static void excluir(){
			int matricula = Teclado.lerInt("digite o numero de matricula para excluir:");
			for (int i = 0; i < lista.length;i++){
				if(lista[i]!=null && lista[i].getMatricula()== matricula){
					lista[i]=null;
					break;
				}
			}
		System.out.println("excluido com sucesso");
		menu();
		}
		
		public static void consultar(){
			for (int i =0; i < lista.length; i++){
				if(lista[i]!=null){
					System.out.println(lista[i].toString());
				}
			}
		menu();
		}
		
		public static void calcularSalario(){
			int matricula = Teclado.lerInt("digite o numero de matricula para calcular salario");
				for (int i = 0; i < lista.length; i++){
					if(lista[i]!=null && lista[i].getMatricula()==matricula){
						lista[i].calcularSalario();
						break;
					}
				}
		menu();
		}
		
		public static void main (String[]args){
			menu();
		}
	

		private static void menu(){ 
			int op = Teclado.lerInt("(1)cadastrar (2)excluir (3)consultar (4)calcular salario (5)sair");
			switch (op){
			case 1:
				cadastrar();
				break;
			
			case 2:
				excluir();
				break;
				
			case 3:
				consultar();
				break;
				
			case 4:
				calcularSalario();
				break;
			
			case 5:
				System.exit(0);
				break;
			}
			
		}

}

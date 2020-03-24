package funcionario;
 	public class FuncionarioComissionado extends Funcionario{
 		protected double comissao;
		
 		public FuncionarioComissionado(String nome, int matricula,double comissao) {
			super(nome, matricula);
				this.comissao = comissao;
			// TODO Auto-generated constructor stub
		}
 			public double calcularSalario(){
 			salarioBase = salarioBase +(salarioBase/100)*comissao;
 				return salarioBase;
 				
 			}
 		
 	}
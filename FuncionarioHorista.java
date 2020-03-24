package funcionario;

public class FuncionarioHorista extends Funcionario{
		protected double horasTrabalhadas;
	
		public FuncionarioHorista(String nome, int matricula,double horasTrabalhadas) {
		super(nome, matricula);
		this.horasTrabalhadas=horasTrabalhadas;
		
	}

		
	public double calcularSalario(){
		salarioBase = salarioBase + (horasTrabalhadas*5); 
		return salarioBase;
	}
	
}

package funcionario;
	 public class Funcionario{
		 protected String nome;
		 protected int matricula;
		 protected double salarioBase;
		 
		public Funcionario(String nome, int matricula) {
			super();
			this.nome = nome;
			this.matricula = matricula;
			this.salarioBase = 1000;
		}

		@Override
		public String toString() {
			return "Funcionario [nome=" + nome + ", matricula=" + matricula
					+ ", salarioBase=" + salarioBase + "]";
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getMatricula() {
			return matricula;
		}

		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}

		public double getSalarioBase() {
			return salarioBase;
		}

		public void setSalarioBase(double salarioBase) {
			this.salarioBase = salarioBase;
		}
		 
		public double calcularSalario(){
			return salarioBase;
		}
		 
	 }
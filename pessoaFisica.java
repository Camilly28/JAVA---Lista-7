package Lista7Q1;
import javax.swing.JOptionPane;
public class pessoaFisica extends cliente
{
	//ATRIBUTOS 
		private String cpf;
		private int dtNascimento;
		
		//SET E GET
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public int getDtNascimento() {
			return dtNascimento;
		}
		public void setDtNascimento(int dtNascimento) {
			this.dtNascimento = dtNascimento;
		}
		
	//METODO CONSTRUTOR
		public pessoaFisica()
		{
			super();
			cpf = JOptionPane.showInputDialog("Informe o CPF: ");
			dtNascimento = Integer.parseInt(JOptionPane.showInputDialog("Informe a DATA DE NASCIMENTO: "));
			fazerPedido();
			imprimirFatura();
		}
	
}

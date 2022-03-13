package Lista7Q1;
import javax.swing.JOptionPane;
public class pessoaJuridica extends cliente
{
	//ATRIBUTOS 
		private String cnpj;
		
	//METODO SET E GET

		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}
		public String getCNPJ()
		{
			return  cnpj;
		}
	//METODO CONSTRUTOR
		super();
		public pessoaJuridica()
		{
			cnpj = JOptionPane.showInputDialog("Informe o CNPJ: ");
		}
	//OPERAÇÕES
		
}

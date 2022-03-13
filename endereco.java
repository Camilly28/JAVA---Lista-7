package Lista7Q1;
import javax.swing.JOptionPane;
public class endereco 
{
	//ATRIBUTOS 
		private String rua;
		private int numero;
		private String complemento;
		private String bairro;
		private String cidade;
		private String cep;
		private String estado;
		

		//SET E GET
		public String getRua() {
			return rua;
		}
		public void setRua(String rua) {
			this.rua = rua;
		}
		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
		public String getComplemento() {
			return complemento;
		}
		public void setComplemento(String complemento) {
			this.complemento = complemento;
		}
		public String getBairro() {
			return bairro;
		}
		public void setBairro(String bairro) {
			this.bairro = bairro;
		}
		public String getCidade() {
			return cidade;
		}
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
		public String getCep() {
			return cep;
		}
		public void setCep(String cep) {
			this.cep = cep;
		}
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}
		
		
	//METODO CONSTRUTOR
		public endereco()
		{
			 rua = JOptionPane.showInputDialog("Informe a rua: ");
			numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero: "));
			 complemento = JOptionPane.showInputDialog("Informe o completo: ");
			 bairro = JOptionPane.showInputDialog("Informe o bairro: ");
			 cidade = JOptionPane.showInputDialog("Informe a cidade: ");
			 cep = JOptionPane.showInputDialog("Informe o CEP: ");
			 estado = JOptionPane.showInputDialog("informe a UF: ");
		}
		
	//OPERAÇÕES
}

	
package Lista7Q1;
import javax.swing.JOptionPane;
public class produto 
{
	//ATRIBUTOS 
		private String codigo;
		private String nome;
		private int quantidade;
		private float precoUnitario;
		
	//METODO SET E GET

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}

		public float getPrecoUnitario() {
			return precoUnitario;
		}

		public void setPrecoUnitario(float precoUnitario) {
			this.precoUnitario = precoUnitario;
		}
		
		//METODO CONSRUTOR
		public produto()
		{
			codigo = JOptionPane.showInputDialog("Informe o código: ");
			nome = JOptionPane.showInputDialog("informe o NOME:");
			quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a QUANTIDADE:"));
			precoUnitario = Float.parseFloat(JOptionPane.showInputDialog("Informe o PRECO UNITARIO:"));
		}
		
		//OPERAÇÕES
}

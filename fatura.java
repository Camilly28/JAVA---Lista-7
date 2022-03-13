package Lista7Q1;
import javax.swing.JOptionPane;
public class fatura 
{
	//ATRIBUTOS 
		private int numeroFatura;
		private int dataVencimento;
		private float valorTotal;
		
		//METODO SET E GET
		public int getNumeroFatura() {
			return numeroFatura;
		}
		public void setNumeroFatura(int numeroFatura) {
			this.numeroFatura = numeroFatura;
		}
		public int getDataVencimento() {
			return dataVencimento;
		}
		public void setDataVencimento(int dataVencimento) {
			this.dataVencimento = dataVencimento;
		}
		public float getValorTotal() {
			return valorTotal;
		}
		public void setValorTotal(float valorTotal) {
			this.valorTotal = valorTotal;
		}
		
		
	//METODO CONSTRUTOR
		public fatura()
		{
			numeroFatura = Integer.parseInt(JOptionPane.showInputDialog("Informe o NUMERO DA FATURA: "));
			dataVencimento = Integer.parseInt(JOptionPane.showInputDialog("Informe a DATA DE VENCIMENTO: "));
			
		}
	//OPERAÇÕES
}

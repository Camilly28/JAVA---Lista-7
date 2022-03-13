package Lista7Q1;
import javax.swing.JOptionPane;
public class telefone 
{
	//atributos
		private int ddi;
		private int ddd;
		private int numero;
		private String tipo;
		private String operadora;
		
		//atributo de referência representando o relacionamento entre endereco e telefone
		private endereco atRefendereco;

		//metodos set e get
		public int getDdi() 
		{return ddi;}

		public void setDdi(int ddi) 
		{ this.ddi = ddi;}

		public int getDdd() 
		{	return ddd;}

		public void setDdd(int ddd)
		{	this.ddd = ddd;}

		public int getNumero() 
		{return numero;}

		public void setNumero(int numero) 
		{	this.numero = numero;}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo)
		{this.tipo = tipo;}

		public String getOperadora() 
		{	return operadora;}

		public void setOperadora(String operadora)
		{	this.operadora = operadora;}

		
		//metodo construtor
		public telefone()
		{
		ddi = Integer.parseInt(JOptionPane.showInputDialog("Informe o DDI: "));
		ddd = Integer.parseInt(JOptionPane.showInputDialog("Informe o DDD: "));
		numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o NUMERO: "));
		tipo = JOptionPane.showInputDialog("Informe o TIPO: ");
		operadora = JOptionPane.showInputDialog("Informe a OPERADORA: "); 
		}
		//operação
		
}

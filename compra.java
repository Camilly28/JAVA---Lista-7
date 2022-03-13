package Lista7Q1;
import javax.swing.JOptionPane;
public class compra 
{
	public static void main (String[]agrs)
	{
	String 	resposta = JOptionPane.showInputDialog("pessoa fisica ou pessoa juridica");
	if(resposta.equalsIgnoreCase("pessoa fisica"))
	{
		pessoaFisica objpessoaFisica = new pessoaFisica();
		objpessoaFisica.fazerPedido();
		objpessoaFisica.imprimirFatura();
	}
	else
	{
		pessoaJuridica  objpessoaJuridica = new pessoaJuridica();
		objpessoaJuridica.fazerPedido();
		objpessoaJuridica.imprimirFatura();
	}
	
	}
}

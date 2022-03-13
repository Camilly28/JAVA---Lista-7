package Lista7Q1;
import javax.swing.JOptionPane;
public class pedido 
{
//ATRIBUTOS 
	private int numeroPedido;
	private int quantidade;
	private int data;
	
	//atributo de referencia 
	protected cliente atRefcliente;
	protected produto atRefproduto;
	protected fatura atReffatura;
	
//GET E SET
	public int getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	
//METODO CONSTRUTOR
	public pedido()
	{
		numeroPedido = Integer.parseInt(JOptionPane.showInputDialog("Informe o NUMERO DO PEDIDO:" ));
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a QUANTIDADE: "));
		data = Integer.parseInt(JOptionPane.showInputDialog("Informe a DATA: "));
	}
	
//OPERAÇÕES
	public void gerarFatura()
	{
		//atRef de fatura
		+"/n Data de vencimento: "+atReffatura.getDataVencimento()
		+"/n Numero da fatura: "+atReffatura.getNumeroFatura()
		+"/n Valor total: "+atReffatura.getValorTotal()
		//atRef de cliente
		+atRefendereco.
		+"/n/nDADOS DO CLIENTE:"
		+"/nBAIRRO: "+atRefendereco.getBairro()
		+"/nCEP: "+atRefendereco.getCep()
		+"/nRUA: "+atRefendereco.getRua()
		+"/nCIDADE: " +atRefendereco.getCidade()
		+"/nESTADO: "+atRefendereco.getEstado()
		+"/nCOMPLEMENTO: "+atRefendereco.getComplemento()
		+"/nNUMERO: "+atRefendereco.getNumero()
		//atRef de produto
		+"/n/n DADOS DO PRODUTO:"
		+"/n"+atRefproduto.getCodigo()
		+"/n"+atRefproduto.getNome()
		+"/n"+atRefproduto.getPrecoUnitario()
		+"/n"+atRefproduto.getQuantidade()
		
		valorTotal = quantidade*precoUnitario;
	}
}

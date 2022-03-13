package Lista7Q1;
import javax.swing.JOptionPane;
public abstract class cliente 
{
	//ATRIBUTOS 
		protected String nome;
		
	//Atributos de referencia endereço,telefone,pedido e produto
		protected endereco atRefendereco;
		protected telefone atReftelefone;
		protected pedido atRefpedido;
		protected produto atRefproduto;
		
//metodo de acesso atributo referencia
		public endereco getAtRefendereco() {
			return atRefendereco;
		}
		public void setAtRefendereco(endereco atRefendereco) {
			this.atRefendereco = atRefendereco;
		}
		public telefone getAtReftelefone() {
			return atReftelefone;
		}
		public void setAtReftelefone(telefone atRtelefone) {
			this.atReftelefone = atRtelefone;
		}
		public pedido getAtRefpedido() {
			return atRefpedido;
		}
		public void setAtRefpedido(pedido atRpedido) {
			this.atRefpedido = atRpedido;
		}
		public produto getAtRefproduto() {
			return atRefproduto;
		}
		public void setAtRefproduto(produto atRproduto) {
			this.atRefproduto = atRproduto;
		}
		
	//METODO SET E GET
		public setNome(String n)
		{
			nome = n;
		} 
		
		public String getNome()
		{
			return nome;
		}
	//METODO CONSTRUTOR
		//preenchimento dos atributos comuns por leitura (usuário)
		public cliente()
		{
			nome = JOptionPane.showInputDialog("Informe o NOME: ");
		}
	//OPERAÇÕES
	public void fazerPedido()
	{
		pedido objpedido = new pedido();
		produto objproduto = new produto();
		atRefproduto = objproduto;
		atRefpedido = objpedido;
		atRefpedido.gerarFatura();;
	}
	public void imprimirFatura()
	{
		JOptionPane.showMessageDialog(null, "IMPRESSÃO DA FATURA. "
			+"/n DADOS DA FATURA:"
			+"/nNOME: "+nome
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
			//atRef de pedido
			+"/n/nDADOS DO PEDIDO:"
			+"/nDATA:"+atRefpedido.getData()
			+"/nNUMERO PEDIDO: "+atRefpedido.getNumeroPedido()
			+"/n QUANTIDADE:"+atRefpedido.getQuantidade()
			//atRef de produto
			+"/n/n DADOS DO PRODUTO:"
			+"/n"+atRefproduto.getCodigo()
			+"/n"+atRefproduto.getNome()
			+"/n"+atRefproduto.getPrecoUnitario()
			+"/n"+atRefproduto.getQuantidade()
				//CLIENTE PEDIDO PRODUTO FATURA);
	}
}

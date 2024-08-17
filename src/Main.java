
public class Main {
  //Back-end básico de uma lanchonete
	public static void main(String[] args) {
		
		Item item1 = new Item ("Porção de fritas", 12.99, 1);
		Item item2 = new Item ("Porção de carnes", 11.99, 2);
		Item item3 = new Item ("Salgados variados", 14.99, 3);
		Item item4 = new Item ("Coca-Cola", 7.99, 4);
		Item item5 = new Item ("Guaraná", 6.99, 5);
		
		Carrinho c = new Carrinho();
		
		c.adicionarItem(item1);
		c.adicionarItem(item2);
		c.adicionarItem(item4);
		c.adicionarItem(item5);
		
		c.removerItem(4);
		c.adicionarItem(item5);
		
		c.calcularpreco();

	}

}

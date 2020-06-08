package unicap.uber.view;

public class Test {

	public static void main(String[] args) {
		Cliente c1 = Cliente.euMesmo;
		Cliente c2 = Cliente.euMesmo;
		
		c1.setNome("Neto 1");
		c2.setNome("Neto 2");
		
		System.out.println(c1.getNome());
		System.out.println(c2.getNome());
	}
}

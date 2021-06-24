package Exercicios;

public abstract class exe2 implements InterfaceFuncional {

	public static void main(String[] args) {
		
		InterfaceFuncional texto = () -> {System.out.println("Mensagem");};
		texto.show();
		
		InterfaceFuncional texto2 = new InterfaceFuncional() {
			public void show() {
				System.out.println("Exibindo uma Mensagem usando InterfaceFuncional");
			}
		};
		texto2.show();

	}

}

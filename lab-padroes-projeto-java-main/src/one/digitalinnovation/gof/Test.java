package one.digitalinnovation.gof;

import one.digitalinnovation.gof.singleton.Login;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		Login login = Login.getInstance();
		
		
		login.setUsuario("Gabi");
		login.setSenha("123");
		
		System.out.println("Acessando o sitema");
		
		Test2 test2 = new Test2();
		Login login2 = test2.selectLogin();
		System.out.println(login.getUsuario());
		System.out.println(login2.getUsuario());
		
		
		
	}
}

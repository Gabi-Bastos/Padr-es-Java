package one.digitalinnovation.gof;

import one.digitalinnovation.gof.singleton.Login;

public class Test2 {

	public Login selectLogin()
	{
		Login login = Login.getInstance();
		return login;
	}
}

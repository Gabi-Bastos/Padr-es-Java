package one.digitalinnovation.gof.singleton;

public class Login {

	private static Login login = new Login();
	private String usuario;
	private String senha;

	private Login() {
	}

	public static Login getInstance() {
		if (login == null) {
			return new Login();
		} else {
			return login;
		}
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
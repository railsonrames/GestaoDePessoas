package gestaodepessoal;

import javax.swing.JOptionPane;;

public class Pessoa {
	protected int cpf;
	protected String nome;
	protected String email;
	protected String senha;
	protected int telefone;
	protected String localizacao;

	public Pessoa() {
		System.out.println("Método construtor da super classe pessoa.");
	}

	public Pessoa(int cpf, String nome, String email, String senha, int telefone, String localizacao) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.telefone = telefone;
		this.localizacao = localizacao;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public void solicitarCorrida() {
		String cdg = JOptionPane.showInputDialog(null, "Insira o c�digo do seu cadastro");
		int cdgInt = Integer.parseInt(cdg);
		Corrida c1 = new Corrida(Main.registroPessoa.get(cdgInt), null);
		Main.registroCorrida.add(c1);
		JOptionPane.showMessageDialog(null, "Aguarde seu motorista...");
	}

	public void cancelarCorrida() {
	}
}
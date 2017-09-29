package gestaodepessoal;

import javax.swing.JOptionPane;

public class Motorista extends Pessoa {
	private String categoriaCNH;
	private int numeroCNH;
	private String classificacao;

	public Motorista() {
		System.out.println("Método construtor da subclasse motorista.");
	}

	public Motorista(int cpf, String nome, String email, String senha, int telefone, String localizacao, String categoriaCNH, int numeroCNH, String classificacao) {
		super.cpf = cpf;
		super.nome = nome;
		super.email = email;
		super.senha = senha;
		super.telefone = telefone;
		super.localizacao = localizacao;
		this.categoriaCNH = categoriaCNH;
		this.numeroCNH = numeroCNH;
		this.classificacao = classificacao;
	}

	public String getCategoriaCNH() {
		return categoriaCNH;
	}

	public void setCategoriaCNH(String categoriaCNH) {
		this.categoriaCNH = categoriaCNH;
	}

	public int getNumeroCNH() {
		return numeroCNH;
	}

	public void setNumeroCNH(int numeroCNH) {
		this.numeroCNH = numeroCNH;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public void aceitarCorrida() {
		String cdg = JOptionPane.showInputDialog(null, "Insira o codigo do seu cadastro");
		int cdgInt = Integer.parseInt(cdg);
		Main.registroCorrida.get(cdgInt).setInfoMotorista(Main.registroMotorista.get(cdgInt));
		JOptionPane.showMessageDialog(null, "Va buscar seu cliente!");
	}

	public void recusarCorrida() {
	}
}
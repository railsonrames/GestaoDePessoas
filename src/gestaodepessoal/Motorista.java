package gestaodepessoal;

import javax.swing.JOptionPane;

public class Motorista extends Pessoa {
	private String categoriaCNH;
	private int numeroCNH;
	private double classificacao;

	public Motorista() {
	}

	public Motorista(int cpf, String nome, String email, String senha, int telefone, String localizacao, String categoriaCNH, int numeroCNH, double classificacao) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.telefone = telefone;
		this.localizacao = localizacao;
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

	public double getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(double classificacao) {
		this.classificacao = classificacao;
	}

	public void aceitarCorrida() {
		String cdg = JOptionPane.showInputDialog(null, "Insira o código do seu cadastro");
		int cdgInt = Integer.parseInt(cdg);
		Main.registroCorrida.get(cdgInt).setInfoMotorista(Main.registroMotorista.get(cdgInt));
		JOptionPane.showMessageDialog(null, "Vá buscar seu cliente!");
	}

	public void recusarCorrida() {
	}
}
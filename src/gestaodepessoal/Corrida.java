package gestaodepessoal;

public class Corrida {
	private Pessoa InfoPassageiro;
	private Motorista InfoMotorista;
	public Corrida() {
	}
	public Corrida(Pessoa infoPassageiro, Motorista infoMotorista) {
		InfoPassageiro = infoPassageiro;
		InfoMotorista = infoMotorista;
	}
	public Pessoa getInfoPassageiro() {
		return InfoPassageiro;
	}
	public void setInfoPassageiro(Pessoa infoPassageiro) {
		InfoPassageiro = infoPassageiro;
	}
	public Motorista getInfoMotorista() {
		return InfoMotorista;
	}
	public void setInfoMotorista(Motorista infoMotorista) {
		InfoMotorista = infoMotorista;
	}
}
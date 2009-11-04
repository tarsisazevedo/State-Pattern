import javax.naming.OperationNotSupportedException;

public class Aluno implements Estado{
	private String nome;
	private int matricula;
	
	private Estado emAberto;
	private Estado trancado;
	private Estado cancelado;
	private Estado estado;

	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
		emAberto = new EmAberto(this);
		trancado = new Trancado(this);
		cancelado = new Cancelado(this);
		estado = emAberto;
	}
	
	public void setState(Estado estado){
		this.estado = estado;
	}
	
	
	public Estado getEstadoEmAberto() {
		return emAberto;
	}

	public Estado getEstadoTrancado() {
		return trancado;
	}

	public Estado getEstadoCancelado() {
		return cancelado;
	}

	@Override
	public void cancelar() throws OperationNotSupportedException {
		estado.cancelar();
	}
	@Override
	public void reabrir() throws OperationNotSupportedException {
		estado.reabrir();
	}
	@Override
	public void trancar() throws OperationNotSupportedException {
		estado.trancar();
	}

	@Override
	public String getNomeEstado() {
		return estado.getNomeEstado();
	}

	@Override
	public void novo() throws OperationNotSupportedException {
		estado.novo();
	}
}
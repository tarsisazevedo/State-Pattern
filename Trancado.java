import javax.naming.OperationNotSupportedException;
import javax.swing.JOptionPane;

public class Trancado implements Estado{

	Aluno aluno;
	
	public Trancado (Aluno aluno){
		this.aluno = aluno;
	}
	
	@Override
	public void cancelar() {
		aluno.setState(aluno.getEstadoCancelado());
	}

	@Override
	public void reabrir() {
		aluno.setState(aluno.getEstadoEmAberto());
	}

	@Override
	public void trancar() throws OperationNotSupportedException {
		throw new OperationNotSupportedException();
	}

	@Override
	public String getNomeEstado() {
		return "Trancado";
	}

	@Override
	public void novo() {
				
	}


}

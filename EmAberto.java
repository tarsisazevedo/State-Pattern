import javax.naming.OperationNotSupportedException;
import javax.swing.JOptionPane;

public class EmAberto implements Estado{
	
	Aluno aluno;
	
	public EmAberto (Aluno aluno){
		this.aluno = aluno;
	}

	@Override
	public void cancelar() {
		aluno.setState(aluno.getEstadoCancelado());
	}

	@Override
	public void reabrir() throws OperationNotSupportedException {
		throw new OperationNotSupportedException();
	}

	@Override
	public void trancar() {
		aluno.setState(aluno.getEstadoTrancado());
	}

	public String getNomeEstado(){
		return "Em Aberto";
	}

	@Override
	public void novo() {
		
	}


}

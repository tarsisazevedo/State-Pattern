import javax.naming.OperationNotSupportedException;
import javax.swing.JOptionPane;

public class Cancelado implements Estado {

	Aluno aluno;
	
	public Cancelado (Aluno aluno){
		this.aluno = aluno;
	}
	
	@Override
	public void cancelar() throws OperationNotSupportedException {
		throw new OperationNotSupportedException();
	}

	@Override
	public void reabrir() throws OperationNotSupportedException {
		throw new OperationNotSupportedException();
	}

	@Override
	public void trancar() throws OperationNotSupportedException {
		throw new OperationNotSupportedException();
	}

	@Override
	public String getNomeEstado() {
		// TODO Auto-generated method stub
		return "Cancelado";
	}

	@Override
	public void novo() {
		
	}

}

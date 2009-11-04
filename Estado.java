import javax.naming.OperationNotSupportedException;

public interface Estado {
	public void trancar() throws OperationNotSupportedException;
	public void reabrir() throws OperationNotSupportedException;
    public void cancelar()throws OperationNotSupportedException;
    public void novo()throws OperationNotSupportedException;
    public String getNomeEstado();
}

package state;

public abstract class ClienteSituacao {
  public abstract String getSituacao();

  public boolean iniciarNovoCliente(Cliente cliente) {
    return false;
  }

  public boolean normalizar(Cliente cliente) {
    return false;
  }

  public boolean bloquear(Cliente cliente) {
    return false;
  }

  public boolean esperandoPagamento(Cliente cliente) {
    return false;
  }

  public boolean mensalidadeAtrasada(Cliente cliente) {
    return false;
  }

  public boolean promovePremium(Cliente cliente) {
    return false;
  }
}

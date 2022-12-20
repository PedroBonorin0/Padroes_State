package state;

public class ClienteSituacaoBloqueado extends ClienteSituacao{

  private ClienteSituacaoBloqueado() {};
  private static ClienteSituacaoBloqueado instance = new ClienteSituacaoBloqueado();
  public static ClienteSituacaoBloqueado getInstance() {
    return instance;
  }

  public String getSituacao() {
    return "Bloqueado";
  }

  public boolean bloquear(Cliente cliente) {
    cliente.setSituacao(ClienteSituacaoBloqueado.getInstance());
    return true;
  }

  public boolean normalizar(Cliente cliente) {
    cliente.setSituacao(ClienteSituacaoNormalizado.getInstance());
    return true;
  }
}

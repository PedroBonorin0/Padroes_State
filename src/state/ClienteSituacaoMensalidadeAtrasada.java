package state;

public class ClienteSituacaoMensalidadeAtrasada extends ClienteSituacao{

  private ClienteSituacaoMensalidadeAtrasada() {};
  private static ClienteSituacaoMensalidadeAtrasada instance = new ClienteSituacaoMensalidadeAtrasada();
  public static ClienteSituacaoMensalidadeAtrasada getInstance() {
    return instance;
  }

  public String getSituacao() {
    return "Mensalidade Atrasada";
  }

  public boolean normalizar(Cliente cliente) {
    cliente.setSituacao(ClienteSituacaoNormalizado.getInstance());
    return true;
  }

  public boolean bloquear(Cliente cliente) {
    cliente.setSituacao(ClienteSituacaoBloqueado.getInstance());
    return true;
  }
}

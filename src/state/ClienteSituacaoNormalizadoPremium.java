package state;

public class ClienteSituacaoNormalizadoPremium extends ClienteSituacao{

  private ClienteSituacaoNormalizadoPremium() {};
  private static ClienteSituacaoNormalizadoPremium instance = new ClienteSituacaoNormalizadoPremium();
  public static ClienteSituacaoNormalizadoPremium getInstance() {
    return instance;
  }

  public String getSituacao() {
    return "Normalizado Premium";
  }

  public boolean mensalidadeAtrasada(Cliente cliente) {
    cliente.setSituacao(ClienteSituacaoMensalidadeAtrasada.getInstance());
    return true;
  }
}

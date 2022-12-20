package state;

public class ClienteSituacaoNormalizado extends ClienteSituacao{

  private ClienteSituacaoNormalizado() {};
  private static ClienteSituacaoNormalizado instance = new ClienteSituacaoNormalizado();
  public static ClienteSituacaoNormalizado getInstance() {
    return instance;
  }

  public String getSituacao() {
    return "Normalizado";
  }

  public boolean esperandoPagamento(Cliente cliente) {
    cliente.setSituacao(ClienteSituacaoCompraEsperandoPagamento.getInstance());
    return true;
  }

  public boolean mensalidadeAtrasada(Cliente cliente) {
    cliente.setSituacao(ClienteSituacaoMensalidadeAtrasada.getInstance());
    return true;
  }

  public boolean promovePremium(Cliente cliente) {
    cliente.setSituacao(ClienteSituacaoNormalizadoPremium.getInstance());
    return true;
  }
}

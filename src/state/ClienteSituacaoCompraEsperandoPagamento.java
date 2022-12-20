package state;

public class ClienteSituacaoCompraEsperandoPagamento extends ClienteSituacao{

  private ClienteSituacaoCompraEsperandoPagamento() {};
  private static ClienteSituacaoCompraEsperandoPagamento instance = new ClienteSituacaoCompraEsperandoPagamento();
  public static ClienteSituacaoCompraEsperandoPagamento getInstance() {
    return instance;
  }

  public String getSituacao() {
    return "Compra Esperando Pagamento";
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

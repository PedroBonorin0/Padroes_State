package state;

public class Cliente {
  private String nome;
  private ClienteSituacao situacao;

  public ClienteSituacao getSituacao() {
     return situacao;
  }

  public Cliente () {
    this.situacao = ClienteSituacaoNormalizado.getInstance();
  }

  public void setSituacao(ClienteSituacao situacao) {
    this.situacao = situacao;
  }

  public boolean iniciarNovoCliente() {
    return situacao.iniciarNovoCliente(this);
  }

  public boolean normalizar() {
    return situacao.normalizar(this);
  }

  public boolean bloquear() {
    return situacao.bloquear(this);
  }

  public boolean esperandoPagamento() {
    return situacao.esperandoPagamento(this);
  }

  public boolean mensalidadeAtrasada() {
    return situacao.mensalidadeAtrasada(this);
  }

  public boolean promovePremium() {
    return situacao.promovePremium(this);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}

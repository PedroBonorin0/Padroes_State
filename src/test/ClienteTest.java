package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import state.*;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
  Cliente cliente;

  @BeforeEach
  public void setUp() {
    cliente = new Cliente();
  }

  @Test
  public void naoDeveCriarCliente() {
    cliente.setSituacao(ClienteSituacaoNormalizado.getInstance());
    assertFalse(cliente.iniciarNovoCliente());
  }

  @Test
  public void deveAtrasarPagamentoNormalizado() {
    cliente.setSituacao(ClienteSituacaoNormalizado.getInstance());
    assertTrue(cliente.mensalidadeAtrasada());
    assertEquals(ClienteSituacaoMensalidadeAtrasada.getInstance(), cliente.getSituacao());
  }

  @Test
  public void deveEsperarPagamentoCompraDeNormalizado() {
    cliente.setSituacao(ClienteSituacaoNormalizado.getInstance());
    assertTrue(cliente.esperandoPagamento());
    assertEquals(ClienteSituacaoCompraEsperandoPagamento.getInstance(), cliente.getSituacao());
  }

  @Test
  public void devePromoverPremiumNormalizado() {
    cliente.setSituacao(ClienteSituacaoNormalizado.getInstance());
    assertTrue(cliente.promovePremium());
    assertEquals(ClienteSituacaoNormalizadoPremium.getInstance(), cliente.getSituacao());
  }

  @Test
  public void deveAtrasarPagamentoNormalizadoPremium() {
    cliente.setSituacao(ClienteSituacaoNormalizadoPremium.getInstance());
    assertTrue(cliente.mensalidadeAtrasada());
    assertEquals(ClienteSituacaoMensalidadeAtrasada.getInstance(), cliente.getSituacao());
  }

  @Test
  public void deveNormalizarBloqueado() {
    cliente.setSituacao(ClienteSituacaoBloqueado.getInstance());
    assertTrue(cliente.normalizar());
    assertEquals(ClienteSituacaoNormalizado.getInstance(), cliente.getSituacao());
  }

  @Test
  public void deveNormalizarEsperandoPagamento() {
    cliente.setSituacao(ClienteSituacaoCompraEsperandoPagamento.getInstance());
    assertTrue(cliente.normalizar());
    assertEquals(ClienteSituacaoNormalizado.getInstance(), cliente.getSituacao());
  }

  @Test
  public void deveBloquearEsperandoPagamento() {
    cliente.setSituacao(ClienteSituacaoCompraEsperandoPagamento.getInstance());
    assertTrue(cliente.bloquear());
    assertEquals(ClienteSituacaoBloqueado.getInstance(), cliente.getSituacao());
  }

  @Test
  public void deveNormalizarMensalidadeAtrasada() {
    cliente.setSituacao(ClienteSituacaoMensalidadeAtrasada.getInstance());
    assertTrue(cliente.normalizar());
    assertEquals(ClienteSituacaoNormalizado.getInstance(), cliente.getSituacao());
  }

  @Test
  public void deveBloquearMensalidadeAtrasada() {
    cliente.setSituacao(ClienteSituacaoMensalidadeAtrasada.getInstance());
    assertTrue(cliente.bloquear());
    assertEquals(ClienteSituacaoBloqueado.getInstance(), cliente.getSituacao());
  }
}
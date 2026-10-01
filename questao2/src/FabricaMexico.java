public class FabricaMexico implements iFabricaAssinatura {

    @Override
    public iComprovanteFiscal criarComprovanteFiscal() {
        return new CfdiMexico();
    }

    @Override
    public iPagamento criarPagamento() {
        return new PagamentoSpei();
    }

    @Override
    public iTermoPrivacidade criarTermoPrivacidade() {
        return new TermoLfpdppp();
    }
}

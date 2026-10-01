public class FabricaBrasil implements iFabricaAssinatura {

    @Override
    public iComprovanteFiscal criarComprovanteFiscal() {
        return new NfseBrasil();
    }

    @Override
    public iPagamento criarPagamento() {
        return new PagamentoPix();
    }

    @Override
    public iTermoPrivacidade criarTermoPrivacidade() {
        return new TermoLgpd();
    }
}

public class ContratacaoRodoviaria extends ContratacaoFrete {

    public ContratacaoRodoviaria(String nomeCliente, double valorCarga) {
        super(nomeCliente, valorCarga);
    }

    @Override
    protected Frete criarFrete() {
        return new FreteRodoviario(this.nomeCliente, this.valorCarga);
    }
}

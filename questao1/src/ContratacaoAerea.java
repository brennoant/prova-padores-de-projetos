public class ContratacaoAerea extends ContratacaoFrete {

    public ContratacaoAerea(String nomeCliente, double valorCarga) {
        super(nomeCliente, valorCarga);
    }

    @Override
    protected Frete criarFrete() {
        return new FreteAereo(this.nomeCliente, this.valorCarga);
    }
}

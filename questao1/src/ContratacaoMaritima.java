public class ContratacaoMaritima extends ContratacaoFrete {

    public ContratacaoMaritima(String nomeCliente, double valorCarga) {
        super(nomeCliente, valorCarga);
    }

    @Override
    protected Frete criarFrete() {
        return new FreteMaritimo(this.nomeCliente, this.valorCarga);
    }
}

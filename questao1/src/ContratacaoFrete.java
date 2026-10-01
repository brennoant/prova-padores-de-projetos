public abstract class ContratacaoFrete {
    protected String nomeCliente;
    protected double valorCarga;

    public ContratacaoFrete(String nomeCliente, double valorCarga) {
        this.nomeCliente = nomeCliente;
        this.valorCarga = valorCarga;
    }

  
    protected abstract Frete criarFrete();

    public final void contratar() {
        Frete frete = criarFrete();     
        frete.calcularValor();
        frete.imprimirResumo();
    }
}

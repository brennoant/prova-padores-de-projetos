public abstract class Frete {
    protected String nomeCliente;
    protected double valorCarga;
    protected double valorFrete;

    public Frete(String nomeCliente, double valorCarga) {
        this.nomeCliente = nomeCliente;
        this.valorCarga = valorCarga;
    }

 
    public abstract double getPercentual();          
    public abstract String getModalidade();
    public abstract String listarDocumentos();

  
    public void calcularValor() {
        this.valorFrete = this.valorCarga * getPercentual();
    }

    //RF04: resumo padronizado
    public void imprimirResumo() {
        System.out.println("Modalidade: " + getModalidade());
        System.out.println("Cliente: " + this.nomeCliente);
        System.out.println("Valor do frete: R$ " + String.format("%.2f", this.valorFrete));
        System.out.println("Documentos exigidos: " + listarDocumentos());
    }
}

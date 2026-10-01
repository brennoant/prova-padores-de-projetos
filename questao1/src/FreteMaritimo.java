public class FreteMaritimo extends Frete {

    public FreteMaritimo(String nomeCliente, double valorCarga) {
        super(nomeCliente, valorCarga);
    }

    @Override
    public double getPercentual() {
        return 0.01;
    }

    @Override
    public String getModalidade() {
        return "Marítimo";
    }

    @Override
    public String listarDocumentos() {
        return "BL (Bill of Lading), fatura comercial";
    }
}

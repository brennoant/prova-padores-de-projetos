public class FreteAereo extends Frete {

    public FreteAereo(String nomeCliente, double valorCarga) {
        super(nomeCliente, valorCarga);
    }

    @Override
    public double getPercentual() {
        return 0.06;
    }

    @Override
    public String getModalidade() {
        return "Aéreo";
    }

    @Override
    public String listarDocumentos() {
        return "AWB (Air Waybill)";
    }
}

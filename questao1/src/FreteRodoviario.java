public class FreteRodoviario extends Frete {

    public FreteRodoviario(String nomeCliente, double valorCarga) {
        super(nomeCliente, valorCarga);
    }

    @Override
    public double getPercentual() {
        return 0.02;
    }

    @Override
    public String getModalidade() {
        return "Rodoviário";
    }

    @Override
    public String listarDocumentos() {
        return "CT-e, MDF-e";
    }
}

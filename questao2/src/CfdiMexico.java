public class CfdiMexico implements iComprovanteFiscal {

    @Override
    public String emitir(String cliente, double valor) {
        double iva = valor * 0.16;
        return "CFDI emitido para " + cliente + ", valor: " + String.format("%.2f", valor)
             + ", IVA 16%: " + String.format("%.2f", iva);
    }
}

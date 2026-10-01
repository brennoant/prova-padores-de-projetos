//PRODUTO CONCRETO (Brasil) - RF01: NFS-e com ISS de 5%
public class NfseBrasil implements iComprovanteFiscal {

    @Override
    public String emitir(String cliente, double valor) {
        double iss = valor * 0.05;
        return "NFS-e emitida para " + cliente + ", valor R$ " + String.format("%.2f", valor)
             + ", ISS 5%: R$ " + String.format("%.2f", iss);
    }
}

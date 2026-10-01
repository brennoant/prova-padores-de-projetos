//PRODUTO CONCRETO (Brasil) - RF01: pagamento via Pix
public class PagamentoPix implements iPagamento {

    @Override
    public String processar(String cliente, double valor) {
        return "Pagamento via Pix: R$ " + String.format("%.2f", valor) + " recebido de " + cliente;
    }
}

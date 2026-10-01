//PRODUTO CONCRETO (México) - RF02: pagamento via SPEI
public class PagamentoSpei implements iPagamento {

    @Override
    public String processar(String cliente, double valor) {
        return "Pagamento via SPEI: " + String.format("%.2f", valor) + " recebido de " + cliente;
    }
}


public class Assinatura {
    private iFabricaAssinatura fabrica;

    public Assinatura(iFabricaAssinatura fabrica) {
        this.fabrica = fabrica;
    }

    public void ativar(String cliente, double valorMensal) {
        iComprovanteFiscal comprovante = this.fabrica.criarComprovanteFiscal();
        iPagamento pagamento = this.fabrica.criarPagamento();
        iTermoPrivacidade termo = this.fabrica.criarTermoPrivacidade();

        System.out.println("Assinatura ativada: " + cliente);
        System.out.println("Comprovante: " + comprovante.emitir(cliente, valorMensal));
        System.out.println("Pagamento:   " + pagamento.processar(cliente, valorMensal));
        System.out.println("Privacidade: " + termo.gerar(cliente));
    }
}

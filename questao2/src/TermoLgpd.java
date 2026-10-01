//PRODUTO CONCRETO (Brasil) - RF01: termo conforme a LGPD
public class TermoLgpd implements iTermoPrivacidade {

    @Override
    public String gerar(String cliente) {
        return "Termo de privacidade conforme LGPD aceito por " + cliente;
    }
}

//PRODUTO CONCRETO (México) - RF02: termo conforme a LFPDPPP
public class TermoLfpdppp implements iTermoPrivacidade {

    @Override
    public String gerar(String cliente) {
        return "Termo de privacidade conforme LFPDPPP aceito por " + cliente;
    }
}

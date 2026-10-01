public class Main {

    public static void main(String[] args) {
        ContratacaoFrete[] contratacoes = {
            new ContratacaoRodoviaria("Ana Souza", 50000),
            new ContratacaoAerea("Bruno Lima", 20000),
            new ContratacaoMaritima("Carla Mendes", 300000)
        };

        for (ContratacaoFrete contratacao : contratacoes) {
            contratacao.contratar();
            System.out.println("----------------------------------------");
        }
    }
}

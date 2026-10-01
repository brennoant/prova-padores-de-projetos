public class Main {

    public static void main(String[] args) {
        iFabricaAssinatura fabricaBrasil = new FabricaBrasil();
        Assinatura assinaturaBR = new Assinatura(fabricaBrasil);
        assinaturaBR.ativar("Empresa (Brasil)", 1000.00);

        System.out.println();

        iFabricaAssinatura fabricaMexico = new FabricaMexico();
        Assinatura assinaturaMX = new Assinatura(fabricaMexico);
        assinaturaMX.ativar("Empresa (México)", 3500.00);
    }
}

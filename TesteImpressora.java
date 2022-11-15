public class TesteImpressora {
    public static void main(String[] args) {
        Impressora print = new Impressora();
        print.exibir(2.5F);
        print.exibir(7.5F, 3.9F);
        print.exibir(2.6F, "3");
        print.exibir("3", 5.6F);
        print.exibir("2", "3", "5");
        print.exibir(2, 2, "4");
    }
}
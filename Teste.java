public class Teste {

    public  static void main(String[] args) {
        Orientador orientador = new Orientador("João", 2);
        try {
            orientador.adicionarEstudante();
            orientador.adicionarEstudante();
            orientador.adicionarEstudante(); // Vai lançar uma exceção
        } catch (LimiteEstudanteException e) {
            System.out.println(e.getMessage());
        }
    }
}

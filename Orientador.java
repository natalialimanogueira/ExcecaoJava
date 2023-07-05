public class Orientador {
    private String nome;
    private int limiteEstudantes;

    private int estudantes;
    public Orientador(String nome, int limiteEstudantes) {

        this.nome = nome;
        this.limiteEstudantes = limiteEstudantes;
        this.estudantes = 0;
    }

    public void adicionarEstudante() throws LimiteEstudanteException {
        if (estudantes >= limiteEstudantes) {
            throw new LimiteEstudanteException();
        }

        estudantes++;
        System.out.println("Estudante adicionado com sucesso.");
    }

}

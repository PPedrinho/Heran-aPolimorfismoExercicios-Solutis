public class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emiteSom() {
        System.out.println("O cavalo "+ getNome() + " relincha");
    }

    @Override
    public void correr() {
        System.out.println("O cavalo "+ getNome() + " corre");
    }

}

public class Preguica extends Animal {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emiteSom() {
        System.out.println("A preguiça "+ getNome() + " emite som");
    }

    public void subirEmArvores() {
        System.out.println("A preguiça "+ getNome() + " subiu na arvore");
    }
}

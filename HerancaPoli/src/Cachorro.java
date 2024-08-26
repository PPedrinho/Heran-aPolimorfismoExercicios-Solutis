public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emiteSom() {
        System.out.println("O cachorro "+ getNome() + " late e faz au au");
    }

    @Override
    public void correr() {
        System.out.println("O cachorro "+ getNome() + " corre");
    }
}

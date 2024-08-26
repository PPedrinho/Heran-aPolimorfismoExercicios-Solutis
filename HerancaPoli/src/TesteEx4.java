public class TesteEx4 {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Pepito", 3);
        Preguica preguica = new Preguica("Carlos", 5);
        Cavalo cavalo = new Cavalo("Luiz", 2);

        Zoologico zoologico = new Zoologico(new Animal[]{cachorro, preguica, cavalo});
        zoologico.adicionarAnimal(cavalo);
        zoologico.adicionarAnimal(preguica);
        zoologico.adicionarAnimal(cachorro);

        zoologico.percorrerJaula();
    }
}

public class TesteEx2 {

    public static void main(String[] args) {

        Preguica preguica = new Preguica("Carlos", 5);
        Cachorro cachorro = new Cachorro("Pepito", 3);
        Cavalo cavalo = new Cavalo("Luiz", 2);

        preguica.emiteSom();
        preguica.subirEmArvores();
        cachorro.emiteSom();
        cachorro.correr();
        cavalo.emiteSom();
        cavalo.correr();
    }
}

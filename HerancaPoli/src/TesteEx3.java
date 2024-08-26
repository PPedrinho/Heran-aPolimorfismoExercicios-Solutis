public class TesteEx3 {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Pepito", 3);
        Preguica preguica = new Preguica("Carlos", 5);
        Cavalo cavalo = new Cavalo("Luiz", 2);
        Veterinario veterinario = new Veterinario("Joaquim");

        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);
    }
}

public class Veterinario {
    private String nome;

    public Veterinario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void examinar(Animal animal) {
        System.out.println("O animal "+ animal.getNome() + " foi examinado pelo "+ getNome());
        animal.emiteSom();
    }
}

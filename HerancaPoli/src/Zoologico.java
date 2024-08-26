public class Zoologico {
    private Animal[] jaula = new Animal[10];

    public Zoologico(Animal[] jaula) {
        this.jaula = jaula;
    }

    public Animal[] getJaula() {
        return jaula;
    }

    public void setJaula(Animal[] jaula) {
        this.jaula = jaula;
    }

    //metodos

    public void adicionarAnimal(Animal animal) {
        for (int i = 0; i < jaula.length; i++) {
            if (jaula[i] == null) {
                jaula[i] = animal;
                break;
            }
        }
    }


    public void percorrerJaula() {
        for (Animal animal : jaula) {
            animal.emiteSom();
            if(animal instanceof Cachorro){
                ((Cachorro) animal).correr();
            }

            if(animal instanceof Cavalo){
                ((Cavalo) animal).correr();
            }
        }
    }
}


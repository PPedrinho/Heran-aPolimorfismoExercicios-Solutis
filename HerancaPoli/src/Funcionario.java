public class Funcionario {
    private String nome;
    private int codigo;
    public double renda = 1000;

    public Funcionario(String nome, int codigo, double renda) {
        this.nome = nome;
        this.codigo = codigo;
        this.renda = 1000;
    }

    public Funcionario(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    //METODOS
    public double calcRenda(){
        return renda;
    }
}   


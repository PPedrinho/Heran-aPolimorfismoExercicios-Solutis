public class Funcionario {
    private String nome;
    private int codigo;
    public double renda = 1000;
    public Comissao comissao;
    private double bonus;

    public Funcionario(String nome, int codigo, Comissao comissao) {
        this.nome = nome;
        this.codigo = codigo;
        this.comissao = comissao;
    }

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

    public Comissao getComissao() {
        return comissao;
    }

    public void setComissao(Comissao comissao) {
        this.comissao = comissao;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //METODOS
    public void checarComissao(){

    }

    
    public double calcRenda(){
        return renda + comissao.getComissao();
    }

    
    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", codigo=" + codigo + ", comissao=" + comissao + ", bonus=" + bonus
                + ", salarioTotal=" + calcRenda() + "]";
    }
}   


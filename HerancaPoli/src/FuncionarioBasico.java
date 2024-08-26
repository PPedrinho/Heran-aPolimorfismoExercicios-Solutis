public class FuncionarioBasico extends Funcionario {
    private String escola;

    public FuncionarioBasico(String nome, int codigo, String escola, double renda) {
        super(nome, codigo, renda);
        this.escola = escola;
    }

    public FuncionarioBasico(String nome, int codigo, String escola) {
        super(nome, codigo);
        this.escola = escola;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    @Override
    public double calcRenda() {
        return renda + (renda * (0.1));
    }
}

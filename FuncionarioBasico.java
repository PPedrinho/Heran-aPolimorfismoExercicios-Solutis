public class FuncionarioBasico extends Funcionario {
    private String escola;
    private double bonus;

    public FuncionarioBasico(String nome, int codigo, String escola,  Comissao comissao) {
        super(nome, codigo, comissao);
        this.escola = escola;
    }

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
    public void checarComissao() {
        if (comissao == Comissao.GERENTE) {
            setBonus(1500);
            this.bonus = 1500;
        }
        else if (comissao == Comissao.SUPERVISOR) {
            setBonus(600);
            this.bonus = 600;
        }
        else if (comissao == Comissao.VENDEDOR) {
            setBonus(250);
            this.bonus = 250;  
        }
        }

    @Override
    public double calcRenda() {
        checarComissao();
        return renda + (renda * (0.1)) + this.bonus;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + super.getNome() + ", codigo=" + super.getCodigo() + ", comissao=" + comissao + ", bonus=" + bonus
                + ", salarioTotal=" + calcRenda() + "]";
    }
}

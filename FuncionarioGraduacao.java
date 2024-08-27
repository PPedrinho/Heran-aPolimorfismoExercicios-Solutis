public class FuncionarioGraduacao extends FuncionarioMedio {
//herda de funcionario medio, pois quem concluiu a graduacao, passou pelo ensino medio
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public FuncionarioGraduacao(String nome, int codigo, String escola, Comissao comissao) {
        super(nome, codigo, escola, comissao);
    }

    public FuncionarioGraduacao(String nome, int codigo, String escola, double renda) {
        super(nome, codigo, escola, renda);
    }

    public FuncionarioGraduacao(String nome, int codigo, String escola) {
        super(nome, codigo, escola);
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
        return super.calcRenda() + (renda * (1)) + this.bonus;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + getNome() + ", codigo=" + super.getCodigo() + ", comissao=" + super.getComissao() + ", bonus=" + getBonus()
                + ", salarioTotal=" + calcRenda() + "]";
    }
}
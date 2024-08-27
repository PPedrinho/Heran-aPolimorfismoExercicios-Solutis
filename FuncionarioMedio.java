public class FuncionarioMedio extends FuncionarioBasico{
//herda de funcionario basico, pois quem fez o ensino medio, passou pelo ensino basico
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public FuncionarioMedio(String nome, int codigo, String escola, Comissao comissao) {
        super(nome, codigo, escola, comissao);
    }

    public FuncionarioMedio(String nome, int codigo, String escola, double renda) {
        super(nome, codigo, escola, renda);
    }

    public FuncionarioMedio(String nome, int codigo, String escola) {
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
        return super.calcRenda() + (renda * (0.5)) + this.bonus;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + getNome() + ", codigo=" + super.getCodigo() + ", comissao=" + super.getComissao() + ", bonus=" + getBonus()
                + ", salarioTotal=" + calcRenda() + "]";
    }

}

public class FuncionarioGraduacao extends FuncionarioMedio {
//herda de funcionario medio, pois quem concluiu a graduacao, passou pelo ensino medio

    public FuncionarioGraduacao(String nome, int codigo, String escola, double renda) {
        super(nome, codigo, escola, renda);
    }

    public FuncionarioGraduacao(String nome, int codigo, String escola) {
        super(nome, codigo, escola);
    }

    @Override
    public double calcRenda() {
        return super.calcRenda() + (renda * (1));
    }
}

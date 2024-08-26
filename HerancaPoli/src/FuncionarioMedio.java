public class FuncionarioMedio extends FuncionarioBasico{
//herda de funcionario basico, pois quem fez o ensino medio, passou pelo ensino basico
    public FuncionarioMedio(String nome, int codigo, String escola, double renda) {
        super(nome, codigo, escola, renda);
    }

    public FuncionarioMedio(String nome, int codigo, String escola) {
        super(nome, codigo, escola);
    }

    @Override
    public double calcRenda() {
        return super.calcRenda() + (renda * (0.5));
    }


}

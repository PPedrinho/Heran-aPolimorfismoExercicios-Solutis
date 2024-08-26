public class TesteEmpresa {

    public static void main(String[] args) {
        //crie um array com 10 funcionarios

        Funcionario funcionario[] = new Funcionario[10];
        funcionario[0] = new FuncionarioBasico("Joaquim", 1, "EscolaCriar");
        funcionario[1] = new FuncionarioBasico("Paulo", 2, "EscolaCriar");
        funcionario[2] = new FuncionarioBasico("Joao", 3, "EscolaCriar");
        funcionario[3] = new FuncionarioBasico("Cris", 4, "EscolaCriar");
        funcionario[4] = new FuncionarioMedio("Pedro", 5, "EscolaInovar");
        funcionario[5] = new FuncionarioMedio("Carlos", 6, "EscolaInovar");
        funcionario[6] = new FuncionarioMedio("Lucas", 7, "EscolaInovar");
        funcionario[7] = new FuncionarioMedio("Bruno", 8, "EscolaInovar");
        funcionario[8] = new FuncionarioGraduacao("Rodrigo", 9, "UniversidadeFederal");
        funcionario[9] = new FuncionarioGraduacao("Rafael", 10, "UniversidadeFederal");

        double rendaAcumulada = 0.0;
        for (Funcionario f : funcionario) {
            rendaAcumulada += f.calcRenda();
        }
        System.out.println("Gasto total da empresa: " + rendaAcumulada);
        
    }
}

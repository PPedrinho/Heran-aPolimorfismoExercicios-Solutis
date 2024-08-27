public class TesteEx10Ex11 {

    public static void main(String[] args) {
    Funcionario funcionario[] = new Funcionario[10];
        funcionario[0] = new FuncionarioBasico("Joaquim", 1, "EscolaCriar", Comissao.GERENTE);
        funcionario[1] = new FuncionarioBasico("Paulo", 2, "EscolaCriar", Comissao.SUPERVISOR);
        funcionario[2] = new FuncionarioBasico("Joao", 3, "EscolaCriar", Comissao.SUPERVISOR);
        funcionario[3] = new FuncionarioBasico("Cris", 4, "EscolaCriar", Comissao.VENDEDOR);
        funcionario[4] = new FuncionarioMedio("Pedro", 5, "EscolaInovar", Comissao.VENDEDOR);
        funcionario[5] = new FuncionarioMedio("Carlos", 6, "EscolaInovar", Comissao.VENDEDOR);
        funcionario[6] = new FuncionarioMedio("Lucas", 7, "EscolaInovar", Comissao.VENDEDOR);
        funcionario[7] = new FuncionarioMedio("Bruno", 8, "EscolaInovar", Comissao.VENDEDOR);
        funcionario[8] = new FuncionarioGraduacao("Rodrigo", 9, "UniversidadeFederal", Comissao.VENDEDOR);
        funcionario[9] = new FuncionarioGraduacao("Rafael", 10, "UniversidadeFederal", Comissao.VENDEDOR);

           
            for(Funcionario f : funcionario) {
                f.checarComissao();
                f.calcRenda();
                System.out.println(f.toString());
            }
            //System.out.println(funcionario[1].toString());//funcionario[1].toString();

        double rendaAcumulada = 0.0;
        for (Funcionario f : funcionario) {
            rendaAcumulada += f.calcRenda();
        }
        System.out.println("Gasto total da empresa: " + rendaAcumulada);
        
    }
}


public class TesteFunc {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Joaquim", 1);
        FuncionarioBasico fb = new FuncionarioBasico("Joaquim", 1, "escola");
        FuncionarioMedio fm = new FuncionarioMedio("Joaquim", 1, "escola");
        FuncionarioGraduacao fg = new FuncionarioGraduacao("Joaquim", 1, "escola");

        System.out.println(fg.getRenda());
        System.out.println(fg.calcRenda());
        
    }
}

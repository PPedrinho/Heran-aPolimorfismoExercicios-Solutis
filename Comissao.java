public enum Comissao {
    GERENTE,
    SUPERVISOR,
    VENDEDOR;
    
    private double comissao;

    private Comissao() {
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

}   

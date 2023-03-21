public class ContaPJ extends Conta{
   private double saldoPJC;
   private double saldoPJI;
    public ContaPJ() {
    }

    public ContaPJ(double saldoPJC, double saldoPJI) {
        this.saldoPJC = saldoPJC;
        this.saldoPJI = saldoPJI;
    }

    public double getSaldoPJC() {
        return saldoPJC;
    }

    public void setSaldoPJC(double saldoPJC) {
        this.saldoPJC = saldoPJC;
    }

    public double getSaldoPJI() {
        return saldoPJI;
    }

    public void setSaldoPJI(double saldoPJI) {
        this.saldoPJI = saldoPJI;
    }

    @Override
    public void abrirConta() {

    }

    public void abrirConta(String nome, int agencia, int numero){
        super.setNome(nome);
        super.setAgencia(agencia);
        super.setNumero(numero);
        System.out.println("Criado conta PJ" );
    }

    @Override
    public double sacar(double valor) {
        if (this.saldoPJC >= valor) {
            this.saldoPJC -= valor + (valor * 0.05);
        }
        else{
            System.out.println("Saldo insuficiente");
        }
        return this.saldoPJC;
    }

    public double sacarInvestimento(double valor) {
        if (this.saldoPJI >= valor) {
            this.saldoPJI -= valor + (valor * 0.05);
        }
        else{
            System.out.println("Saldo insuficiente");
        }
        return this.saldoPJI;
    }

    @Override
    public double depositar(double valor) {
        this.saldoPJC += valor;
        return this.saldoPJC;

    }

    @Override
    public void transferir(double valor) {
        if(this.saldoPJC >= valor + (valor*0.05)){
            System.out.println("Transferido para saldo PJI");
            this.saldoPJC -= valor + (valor*0.05);
            this.saldoPJI += valor + (valor*0.02);
        }
    }

    public void transferirdaInvestimento(double valor) {
        if (this.saldoPJI >= valor + (valor * 0.05)) {
            System.out.println("Transferido para saldo PJC");
            this.saldoPJI -= valor + (valor * 0.05);
            this.saldoPJC += valor;
        }
    }
    @Override
    public double investir(double valor) {
        this.saldoPJI += valor+(valor*0.02);
        return this.saldoPJI;

    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo PJ Corrente é: " + this.saldoPJC);
        System.out.println("Seu saldo PJ Investimento é: " + this.saldoPJI);
    }

    @Override
    public String toString() {
        return "Conta PJ {" + "nome = " + super.getNome() +
                ", saldo PJC = " + saldoPJC +
                ", saldo PJI = " + saldoPJI +
                '}';
    }
}


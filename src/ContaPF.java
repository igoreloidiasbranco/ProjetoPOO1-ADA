import java.util.Scanner;
//Herança
public class ContaPF extends Conta implements Comparable {
    Scanner entrada = new Scanner(System.in);
  //Encapsulamento
    private double saldoCC;
    private double saldoCP;
    private double saldoCI;

    //Construtor vazio
    public ContaPF(){
    }

    //Construtor cheio
    public ContaPF(double saldoCC, double saldoCP, double saldoCI) {
        this.saldoCC = saldoCC;
        this.saldoCP = saldoCP;
        this.saldoCI = saldoCI;
    }

     public double getSaldoCC() {
        return saldoCC;
    }

    public void setSaldoCC(double saldoCC) {
        this.saldoCC = saldoCC;
    }

    public double getSaldoCP() {
        return saldoCP;
    }

    public void setSaldoCP(double saldoCP) {
        this.saldoCP = saldoCP;
    }

    public double getSaldoCI() {
        return saldoCI;
    }

    public void setSaldoCI(double saldoCI) {
        this.saldoCI = saldoCI;
    }

    // Sobrescrita
    @Override
    public void abrirConta() {
    }

    //Sobrecarga
    public void abrirConta(String nome, int agencia, int numero, double saldoCC, double saldoCP, double saldoCI){
        super.setNome(nome);
        super.setAgencia(agencia);
        super.setNumero(numero);
        this.setSaldoCC(saldoCC);
        this.setSaldoCP(saldoCP);
        this.setSaldoCI(saldoCI);
        System.out.println("Criado conta PF");
    }
    @Override
    public double sacar(double valor) {
        if (saldoCC >= valor) {
            this.saldoCC -= valor;
        }
        else{
            System.out.println("Saldo insuficiente");
        }
        return this.saldoCC;}
    public double sacarPoupanca(double valor) {
        if (this.saldoCP >= valor) {
            this.saldoCP -= valor;
        }
        else{
            System.out.println("Saldo insuficiente");
        }
        return this.saldoCP;
    }
    public double sacarInvestimento(double valor){
        if(this.saldoCI >= valor){
        this.saldoCI -= valor;}
        else{
            System.out.println("Saldo insuficiente");
        }
        return saldoCI;
    }
    @Override
    public double depositar(double valor) {
        this.saldoCC += valor;
        return this.saldoCC;
    }

    public double depositarPoupanca (double valor) {
        this.saldoCP += valor;
        return this.saldoCP;
    }

    public double depositarInvestimento (double valor) {
        this.saldoCI += valor;
        return this.saldoCI;
    }

    @Override
    public void transferir(double valor) {
        if (this.saldoCC >= valor){
        System.out.println("Transferir da CC para? (P) Poupanca ou (I) Investimento");
        String resposta = entrada.nextLine();
        if (resposta.equals("P")) {
            this.saldoCC -= valor;
            this.saldoCP += valor;
        } else if (resposta.equals("I")) {
            this.saldoCC -= valor;
            this.saldoCI += valor;
        }
            else{
            System.out.println("Digite valor válido ");
            transferir(valor);}}
        else{
                System.out.println("Saldo insuficiente");
            }
        }

        public void transferirdaPoupanca (double valor) {
            if(this.saldoCP >= valor){
            System.out.println("Transferir da CP para? (C) Corrente (I)Investimento");
            String resposta = entrada.nextLine();
            if (resposta.equals("C")) {
                this.saldoCP -= valor;
                this.saldoCC += valor;
            } else if (resposta.equals("I")) {
                this.saldoCP -= valor;
                this.saldoCI += valor;
            } else {
                System.out.println("Digite valor válido ");
                transferirdaPoupanca(valor);
            }}
            else{
                System.out.println("Saldo insuficiente");
            }
        }

            public void transferirdoInvestimento (double valor) {
              if(saldoCI >= valor){
                System.out.println("Transferir da CI para? (C) Corrente (P) Poupança");
                String resposta = entrada.nextLine();
                if(resposta.equals("C")){
                    this.saldoCI -= valor;
                    this.saldoCC += valor;
                }
                else if (resposta.equals("P")) {
                    this.saldoCI -= valor;
                    this.saldoCP += valor;
                }
                else{
                    System.out.println("Digite valor válido ");
                    transferirdoInvestimento(valor);
                }}
              else{
                  System.out.println("Saldo insuficiente");
              }
            }

    @Override
    public double investir(double valor) {
        this.saldoCI += valor;
        return this.saldoCI;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo corrente é: " + this.saldoCC);
        System.out.println("Seu saldo poupança é: " + this.saldoCP );
        System.out.println("Seu saldo investimento é: " + this.saldoCI);
    }

    @Override
    public String toString() {
        return "Conta PF {" + "nome = " + super.getNome() +
                ", saldo CC = " + saldoCC +
                ", saldo CP = " + saldoCP +
                ", saldo CI = " + saldoCI +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        ContaPF pf = (ContaPF) o;
        int comparar = super.getNome().compareTo(((ContaPF) o).getNome());
        if (comparar < 0){
            return -1;
        }
        if (comparar > 0 ){
            return 1;
        }
        return 0;
    }
}
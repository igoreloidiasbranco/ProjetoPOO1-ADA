//Classe Abstrata
public abstract class  Conta {
    private String nome;
    private int agencia;
    private int numero;


    public abstract void abrirConta();
    public abstract double sacar(double valor);
    public abstract double depositar(double valor);
    public abstract void transferir(double valor);
    public abstract double investir(double valor);
    public abstract void consultarSaldo();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
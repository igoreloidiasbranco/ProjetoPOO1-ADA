import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

// Exception: try, catch.

try {
    // Teste pessoa física
    ContaPF igor = new ContaPF();
    igor.abrirConta("Igor", 1234, 55667, 0, 0, 0);
    System.out.println(igor.toString());
    System.out.println();

    igor.depositar(50);
    igor.depositarPoupanca(60);
    igor.investir(80);
    System.out.println(igor.toString());
    System.out.println();

    igor.sacar(10);
    igor.sacarPoupanca(40);
    igor.sacarInvestimento(30);
    System.out.println(igor.toString());
    System.out.println();

    igor.transferir(5);
    System.out.println(igor.toString());
    System.out.println();

    igor.transferirdaPoupanca(2);
    System.out.println(igor.toString());
    System.out.println();

    igor.transferirdoInvestimento(1);
    igor.consultarSaldo();
    System.out.println();


// Teste pessoa juridica

    ContaPJ tais = new ContaPJ();
    tais.abrirConta();
    tais.setNome("Tais");
    tais.setAgencia(5678);
    tais.setNumero(88990);
    System.out.println(tais.toString());
    System.out.println();

    tais.depositar(100);
    tais.investir(200);
    tais.consultarSaldo();
    System.out.println();

    tais.sacar(20);
    tais.sacarInvestimento(10);
    System.out.println(tais.toString());
    System.out.println();

    tais.transferir(30);
    tais.transferirdaInvestimento(15);
    tais.consultarSaldo();
    System.out.println();

    // novas contas PFs

    ContaPF jose = new ContaPF();
    jose.abrirConta("José", 4567, 65874, 202.5, 540.25, 89.60);
    ContaPF carlos = new ContaPF();
    carlos.abrirConta("Carlos", 1012,354289,0,0,0);
    ContaPF andreia = new ContaPF();
    andreia.abrirConta("Andreia", 9872, 98246, 640.25,658.40, 1025.00);

    // Lista de contas PFs usando Array

    ArrayList<ContaPF> listaContaPF = new ArrayList<>();
    listaContaPF.add(igor);
    listaContaPF.add(jose);
    listaContaPF.add(carlos);
    listaContaPF.add(andreia);

    for (ContaPF lista : listaContaPF){
        System.out.println(lista);
    }

    System.out.println();

    // Lista ordenada

    Collections.sort(listaContaPF);

    for (ContaPF lista : listaContaPF){
        System.out.println(lista);
    }



}catch (Exception e){
    System.out.println("Aconteceu um erro: " + e.getMessage());
    System.out.println("Tente novamente");
    main(args);
}
    }


}
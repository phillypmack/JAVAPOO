package br.com.Ex_30_Set;

public class Embarcacao extends Veiculo {
    private int numeroVelas;


    public Embarcacao(String marca, String modelo, int ano, int numeroVelas) {
        super(marca, modelo, ano);
        this.numeroVelas = numeroVelas;

    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Velas: " + numeroVelas);

    }

    public void icarVelas() {
        System.out.println("Velas içadas!");
    }
}

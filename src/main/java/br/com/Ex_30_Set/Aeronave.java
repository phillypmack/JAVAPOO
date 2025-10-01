package br.com.Ex_30_Set;

public class Aeronave extends Veiculo {
    private int numeroTurbinas;
    private String companhiaAerea;

    public Aeronave(String marca, String modelo, int ano, int numeroTurbinas, String companhiaAerea) {
        super(marca, modelo, ano);
        this.numeroTurbinas = numeroTurbinas;
        this.companhiaAerea = companhiaAerea;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Turbinas: " + numeroTurbinas);
        System.out.println("Companhia Aérea: " + companhiaAerea);
    }

    public void decolar() {
        System.out.println("Aeronave decolando!");
    }
}

package br.com.Ex_30_Set;

public class TesteVeiculos {
    public static void main(String[] args) {
        Veiculo[] frota = {
                new Carro("Ford", "Fiesta", 2020, 4, true),
                new Moto("Honda", "CG 160", 2021, 160, true),
                new Carro("Volkswagen", "Golf", 2019, 4, true),
                new Carro("Chevrolet", "Onix", 2022, 4, true),
                new Moto("Yamaha", "Factor 150", 2023, 150, true),
                new Carro("Fiat", "Mobi", 2021, 4, false),
                new Aeronave("Boeing", "737", 2018, 2, "GOL"),
                new Embarcacao("Schaefer Yachts", "Phantom 375", 2021, 0)
        };

        for (Veiculo veiculo : frota) {
            veiculo.exibirInfo();
            veiculo.acelerar(60);
            System.out.println("---");
        }
    }
}

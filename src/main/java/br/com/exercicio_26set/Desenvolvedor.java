package br.com.exercicio_26set;

public class Desenvolvedor extends Funcionario{

    private int horasExtras;
    private Double valorHoraExtra;

    public Desenvolvedor(String nome,
                         String matricula,
                         Double salarioBase,
                         int horasExtras,
                         double  valorHoraExtra){
        super(nome, matricula, salarioBase);
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }


    @Override
    public double calcularSalario() {
        return salarioBase + (valorHoraExtra*horasExtras);
    }

    public void registrarHoraExtra(int horasExtras){
        this.horasExtras += horasExtras;
    }
}

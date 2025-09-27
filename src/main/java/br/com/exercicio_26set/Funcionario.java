package br.com.exercicio_26set;

public abstract class Funcionario {
    protected String nome;
    protected String matricula;
    protected Double salarioBase;

    public Funcionario(String nome, String matricula, Double salariobase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salariobase;

    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Double getSalariobase(){
        return salarioBase;
    }
    public void setSalariobase(Double salariobase) {
        this.salarioBase = salarioBase;
    }

    //método abstrato para ser implementado nas subclases.
    public abstract double calcularSalario();

    //
    public void exibirDados(){
        System.out.println("nome: "+nome);
        System.out.println("Matricula: "+ matricula);
        System.out.println("Salario Base: " + salarioBase);

    }

}

package model;

public class Cliente {
    private String nome;
    private String dados;
    private  int idade;

    private double altura;
    private double peso;

    public Cliente(String nome, String dados) {
        this.nome = nome;
        this.dados = dados;
    }

    public Cliente(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public Cliente(String nome, String dados, int idade, double altura, double peso) {
        this.nome = nome;
        this.dados = dados;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", dados='" + dados + '\'' +
                '}';
    }
}

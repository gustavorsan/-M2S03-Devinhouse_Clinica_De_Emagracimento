package model;

public class Cliente {
    private static int nextId = 1;
    private String nome;
    private String dados;
    private  int idade;
    private  int id = 1;
    private double altura;
    private double peso;

    public Cliente(String nome, String dados) {
        this.nome = nome;
        this.dados = dados;
        this.id = Cliente.nextId;
        Cliente.nextId++;
    }

    public Cliente(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
        this.id = Cliente.nextId;
        Cliente.nextId++;
    }

    public Cliente(String nome, String dados, int idade, double altura, double peso) {
        this.nome = nome;
        this.dados = dados;
        this.idade = idade;
        this.altura = altura;
        this.id = Cliente.nextId;
        Cliente.nextId++;
    }

    public int getId(){
        return this.id;
    }
    public void alterPeso(){
        this.peso -= 5;
    }

    public void alterPeso(double valor){
        this.peso -= valor;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", dados='" + dados + '\'' +
                ", idade=" + idade +
                ", id=" + id +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}

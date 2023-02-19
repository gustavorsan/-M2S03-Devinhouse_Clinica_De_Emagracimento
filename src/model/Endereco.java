package model;

public class Endereco {
    private String numero;
    private String logradouro;

    Endereco (String logradouro, String numero){
        this.logradouro = logradouro;
        this.numero = numero;
    }



    @Override
    public String toString() {
        return "{" +
                "numero='" + numero + '\'' +
                ", logradouro='" + logradouro + '\'' +
                '}';
    }
}

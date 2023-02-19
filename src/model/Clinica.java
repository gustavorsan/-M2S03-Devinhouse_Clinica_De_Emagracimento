package model;

public class Clinica {
    private String nomeDono;
    private String clinica;
    private Endereco endereco;
    private int codigo = 0;



    public Clinica(String nomeDono, String clinica, String logradouro, String numero) {
        this.nomeDono = nomeDono;
        this.clinica = clinica;
        this.endereco = new Endereco(logradouro,numero);
        this.codigo++;
    }

    @Override
    public String toString() {
        return "Clinica{" +
                "nomeDono='" + nomeDono + '\'' +
                ", clinica='" + clinica + '\'' +
                ", endereco=" + endereco.toString() +
                ", codigo=" + codigo +
                '}';
    }
}

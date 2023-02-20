package model;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Clinica {
    private String nomeDono;
    private String clinica;
    private Endereco endereco;
    private int codigo = 0;

    private ArrayList<Cliente> clientes;



    public Clinica(String nomeDono, String clinica, String logradouro, String numero) {
        this.nomeDono = nomeDono;
        this.clinica = clinica;
        this.endereco = new Endereco(logradouro,numero);
        this.codigo++;

        clientes = new ArrayList<Cliente>();
    }

    public Clinica(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public Clinica(String nomeDono, ArrayList<Cliente> clientes) {
        this.nomeDono = nomeDono;
        this.clientes = clientes;
    }

    public String calculaImc(double peso, double altura){
        double imc = peso / Math.pow(altura,2);
        String categoria = "Abaixo do peso normal";
        DecimalFormat df = new DecimalFormat("#.000");

        if (imc >= 18.5 && imc <= 24.9){
            categoria = "Peso normal";
        } else if (imc >= 25 && imc <= 29.9) {
            categoria = "Excesso de peso";
        } else if (imc >= 30 && imc <= 34.9) {
            categoria = "Obesidade classe I";
        } else if (imc >= 35 && imc <= 39.9) {
            categoria = "Obesidade classe II";
        }else{
            categoria = "Obesidade classe III";
        }


        return "IMC: "+df.format(imc)+" Categoria: "+categoria;
    }

    public void novoCliente(String nome,double peso,double altura){
        Cliente cliente = new Cliente( nome, this.calculaImc(peso,altura) );

        this.clientes.add(cliente);
    }

    public void listaClientes(){
        for (Cliente cliente : this.clientes){
            System.out.println(cliente.toString());
        }

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

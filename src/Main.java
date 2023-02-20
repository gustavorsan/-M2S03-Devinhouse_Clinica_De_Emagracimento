import model.Clinica;

public class Main {
    public static void main(String[] args) {
        Clinica clinica = new Clinica("Gustavo","D'Beleza","Rua Zero","SN");

        System.out.println(clinica.toString());


        clinica.novoCliente("João",68,1.75,30);
        clinica.novoCliente("Rafael",92,1.85,30);
        clinica.novoCliente("Maria",77,1.65,30);
        clinica.novoCliente("Julia",60,1.70,30);

        clinica.tratamento(3);

        clinica.listaClientes();

    }


}
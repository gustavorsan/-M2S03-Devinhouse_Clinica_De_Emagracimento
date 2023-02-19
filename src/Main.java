import model.Clinica;

public class Main {
    public static void main(String[] args) {
        Clinica clinica = new Clinica("Gustavo","D'Beleza","Rua Zero","SN");

        System.out.println(clinica.toString());

        System.out.println(clinica.calculaImc(68,1.75));
    }


}
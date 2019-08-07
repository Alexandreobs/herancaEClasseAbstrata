package br.digitalhouse.herancaClasseAbstrata;

public class principal {
    public static void main(String[] args) {

        Crianca bebe = new Crianca("maria", "feminino");
        System.out.println("Nome " + bebe.getNome() + " " + "Sexo " + bebe.getSexo());
        bebe.estudar(true);

        bebe.respirar(" Clóvis");


    }
}

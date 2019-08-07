package br.digitalhouse.herancaClasseAbstrata;

public abstract class Pessoa {
    private String nome;
    private String sobreNome;
    private int cpf;
    private String sexo;

    public Pessoa (String novoNome, String novoSexo){
        nome = novoNome;
        sexo = novoSexo;
    }

    public  abstract void   respirar(String nome);

    public void cadastroPessoa (String nome, String SobreNome){
        System.out.println("Dados da pessoa: " + nome + " " + sobreNome);
    }

    public void cadastroPessoa (String nome, String sobreNome, String sexo){
        System.out.println("Dados atualizados: " + nome + "é " + sexo);
    }

    public void cadastroPessoa (String nome, int cpf){
        System.out.println("Dados Simples: " + nome + " é " + cpf);
    }


    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public String getSexo() {
        return sexo;
    }

    public int getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    // metodo
    public boolean estudar (boolean status) {
        return false;
    }


}


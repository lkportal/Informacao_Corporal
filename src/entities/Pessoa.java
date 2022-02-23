package entities;

public class Pessoa {
    private Double altura, peso;
    private String nome;
    private Integer idade;
    private char sexo;


    public Pessoa(Double altura, Double peso, String nome, Integer idade, char sexo) {
        this.altura = altura;
        this.peso = peso;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}

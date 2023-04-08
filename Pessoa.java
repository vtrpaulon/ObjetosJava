package vitor.objetos;

//@author vitor

public class Pessoa {
    
    private String nome;
    private int telefone;
    private float altura;
    private float peso;

    public Pessoa(String nome, int telefone, float altura, float peso) {
        this.nome = nome;
        this.telefone = telefone;
        this.altura = altura;
        this.peso = peso;
    }
        
    public void impimirPessoa(){
        System.out.println("Descrevendo uma pessoa: "+nome+" tem o telefone "+telefone+" tem a altura de "+altura
        +" e pesa "+peso);
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getAltura() {
        return altura;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getPeso() {
        return peso;
    }
}

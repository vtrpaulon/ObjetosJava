package vitor.objetos;

//@author vitor

import java.util.Scanner;


public class Objetos {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Pessoa pessoa = new Pessoa("",0,0,0);
        
        System.out.println("Informe o nome da pessoa: ");
        pessoa.setNome(teclado.nextLine());
        System.out.println("Informe o numero de telefone: ");
        pessoa.setTelefone(teclado.nextInt());
        System.out.println("Informe a altura da pessoa: ");
        pessoa.setAltura(teclado.nextFloat());
        System.out.println("Informe o peso da pessoa: ");
        pessoa.setPeso(teclado.nextFloat());
        
        pessoa.impimirPessoa();       
    }
}

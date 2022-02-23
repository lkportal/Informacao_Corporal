package application;
import entities.InformacaoNutricional;

import java.util.Scanner;
public class application {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome");
        String nome=sc.next();
        System.out.println("Informe Idade: ");
        int idade=sc.nextInt();
        System.out.println("Informe sexo F ou M");
        char sexo =sc.next().charAt(0);
        System.out.println("Peso: ");
        double peso=sc.nextDouble();
        System.out.println("Altura: ");
        double altura=sc.nextDouble();
        InformacaoNutricional inf = new InformacaoNutricional(altura, peso, nome, idade, sexo);
        if(sexo == 'M') System.out.println(inf.toString());
        if(sexo == 'F') System.out.println(inf.toString());

    }
}

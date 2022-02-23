package entities;

public class InformacaoNutricional  extends Pessoa{

    TipoDePeso pessoa;


    public InformacaoNutricional(Double altura, Double peso, String nome, Integer idade, char sexo) {
        super(altura, peso, nome, idade, sexo);
    }

    public double IMC(double altura, double peso){

         return peso /(Math.pow(altura,2 ));

    }

    public double BTMMasculino(double altura, double peso, int idade){
        return 66 +(13.8 * peso) + (5 * (int)altura) -(6.8 * idade);
    }

    public double BTMfeminino(double altura, double peso,int idade) {
        return 665 + (9.6 * peso) + (1.8 * (int) altura) - (4.7 * idade);
    }

    public double getIMC(){
        return IMC(getAltura(), getPeso());
    }
    public String tipoPeso(){
        if(getIMC() < 18.5) return "Abaixo do peso normal";
        if(getIMC() > 18.5 && getIMC() <25) return "Seu peso esta normal";
        if(getIMC() > 25 && getIMC() <29.9) return "Você está acima do peso";
        if(getIMC() >30 && getIMC() <35) return "Atenção Obesidade Nivel I";
        if(getIMC() >35 && getIMC() <39.9) return "Atenção Obesidade Nivel II";
        else return "Obesidade-Morbida ";

    }
    public double finalBTM(){
        if(getSexo() == 'M') return BTMMasculino(getAltura(), getPeso(), getIdade());
        if(getSexo() == 'F') return BTMfeminino(getAltura(), getPeso(), getIdade());
        return 0;
    }

    public String toString(){
        return "Seu nome  "
                + getNome()
                + "\n"
                + getSexo()
                + "\n"
                + "Seu peso: "
                + getPeso()
                + "\n"
                + "Sua Altura: "
                + getAltura()
                + "\n"
                + "Seu IMC ou BMI(Indice de Massa Corporal) é: "
                + String.format("%.2f",IMC(getAltura(), getPeso()))
                + "\n"
                + "Sua situação: "
                + tipoPeso()
                + "\n"
                + "Seu gasto calórico é: "
                + String.format("%.2f",finalBTM());

    }
}

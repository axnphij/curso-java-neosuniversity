package com.neosuniversity.condiciones;

public class AumentoSalarial {

    /*
    Los trabajadores de una empresa recibirán un incremento salarial dependiendo de los años
    trabajados, se aplicarán los siguientes criterios.

Si lleva más de 20 años se aplicará un incremento del 20%
Si lleva entre 10 y 20 años se aplicacrá un incremento de 10%
Si lleva menos de 10 años se aplicará un incremento de 5%

Muestre en pantalla el incremento que se aplicó y el salario final.

    * */

    public static void main(String[] args) {

        double salario = 3500; // pesos mx
        int anios = 15;
        double incremento;

        if ( anios > 20 ){
            incremento = salario * .2;
        } else if ( anios >=10 && anios <= 20 ){
            incremento = salario * .1;
        } else {
            incremento = salario * .05;
        }

        System.out.println(" Incremento = " + incremento);
        salario = salario + incremento;
        System.out.println("salario nuevo = " +salario);


    }

}

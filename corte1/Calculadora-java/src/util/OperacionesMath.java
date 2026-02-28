package util;

public class OperacionesMath {
    public double suma(double... numeros) {
       double suma = 0;
       for (double num : numeros) {
           suma += num;
       }
       return suma; 
    }

    public double resta(double... numeros) {
        double resta = numeros[0];
        for(int i = 1; i<numeros.length; i++){
            resta -= numeros[i];
        }
        return resta;
    }

    public double multiplicacion(double... numeros) {
        double multiplicacion = 1;
        for  (double num : numeros) {
            multiplicacion *= num;
        }
        return multiplicacion;
    }

    public double division(double... numeros) {
        if(numeros.length == 2){
            if (numeros[1] == 0) {
                System.out.println("No se puede dividir por cero");
                return 0;
            }else{
                double division = numeros[0];
                for(int i = 1; i<numeros.length; i++){
                    division /= numeros[i];
                }
                return division;
            }
        }
        if (numeros[1] == 0 || numeros[2] == 0) {
            System.out.println("No se puede dividir por cero");
            return 0;
        }else{
            double division = numeros[0];
            for(int i = 1; i<numeros.length; i++){
                division /= numeros[i];
            }
            return division;
        }
    }
}

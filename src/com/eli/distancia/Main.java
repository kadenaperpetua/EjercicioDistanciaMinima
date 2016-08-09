package com.eli.distancia;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] prueba= {4,8,6,1,2,9,4};
        obtenerIndiceDeLaDistanciaMinima(prueba);


    }

    public static int obtenerIndiceDeLaDistanciaMinima(int[] entrada){

        if(entrada.length>=2){
            int indiceMenorDistancia= 0;
            int menorDistancia= Math.abs(entrada[0]-entrada[1]);

            for(int i=1;i<entrada.length-2;i++){

                int distanciaIterada= Math.abs(entrada[i]-entrada[i+1]);

                if (distanciaIterada<menorDistancia){
                    indiceMenorDistancia=i;
                    menorDistancia = distanciaIterada;
                }
            }
        }
        System.out.println(indiceMenorDistancia);
        return indiceMenorDistancia;


    }
}

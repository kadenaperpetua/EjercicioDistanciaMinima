package com.eli.distancia;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] prueba= {4,8,6,1,2,9,4};
        //int[] prueba= {4,8};
        //int[] prueba= {4};

        obtenerIndiceDeLaDistanciaMinima(prueba);


    }

    public static int obtenerIndiceDeLaDistanciaMinima(int[] entrada){

        if(entrada.length>2){
            int indiceMenorDistancia= 0;
            int menorDistancia= Math.abs(entrada[0]-entrada[1]);
            //System.out.println("entrada = " + entrada.length);

            for(int i=1;i<entrada.length-1;i++){

                int distanciaIterada= Math.abs(entrada[i]-entrada[i+1]);
                //System.out.println("i = " + i);
                //System.out.println("distanciaIterada = " + distanciaIterada);


                if (distanciaIterada<menorDistancia){
                    indiceMenorDistancia=i;
                    menorDistancia = distanciaIterada;
                }
            }

            //System.out.println(indiceMenorDistancia);
            System.out.println("El indice de la menor distancia es: " + indiceMenorDistancia);
            return indiceMenorDistancia;

        }else{
            System.out.println("El arreglo debe contener mas de dos elementos");
            return 0;
        }

    }
}

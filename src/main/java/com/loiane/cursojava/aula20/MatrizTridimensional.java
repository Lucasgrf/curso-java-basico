package com.loiane.cursojava.aula20;

public class MatrizTridimensional {
    public static void main(String[] args) {
        int[][][] matrizTridimensional = new int[3][3][3];

        //O vetor vai ser a soma dos seus índices.
        for(int i=0;i < matrizTridimensional.length;i++){
            for(int j=0;j < matrizTridimensional[i].length;j++){
                for(int k=0;k < matrizTridimensional[i][j].length;k++){
                    matrizTridimensional[i][j][k] = i + j + k;
                }
            }
        }
        //Soma das matrízes.
        int soma = 0;
        int somaPares = 0;
        int somaImpares = 0;

        for(int i=0;i < matrizTridimensional.length;i++){
            for(int j=0;j < matrizTridimensional[i].length;j++){
                for(int k=0;k < matrizTridimensional[i][j].length;k++){
                    soma += matrizTridimensional[i][j][k];

                    if(matrizTridimensional[i][j][k] % 2 == 0){
                        somaPares += matrizTridimensional[i][j][k];
                    }else {
                        somaImpares += matrizTridimensional[i][j][k];
                    }
                }
            }
        }

        System.out.println("Soma total: " + soma);
        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);
    }
}

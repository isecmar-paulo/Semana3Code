package po.leit;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    int[] notas;
	    notas = new int[32];
        Random rand = new Random();

	    for (int i=0; i < notas.length; i++) {
            int randomNum = rand.nextInt(20) + 1;
            notas[i] = randomNum;
        }
        }

        // calcular a media de notas
        // utilizar o for each

        // calcular a nota maxima e a nota minima


    }


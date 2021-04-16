package po.leit;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Digite total crianças: ");
        int totalCriancas = kb.nextInt();
        System.out.println("Tamanho dos grupos: ");
        int tamanhoGrupo = kb.nextInt();

        mostraGrupos(totalCriancas,tamanhoGrupo);
    }
    public static void mostraGrupos(int total, int tgrupo) {
        int numeroGrupos = total / tgrupo;
        int resto = total % tgrupo;
        System.out.println("Número de grupos = " + numeroGrupos);
        if (resto > 0)
            System.out.println("Ficam sem grupo = " + resto);
    }
}

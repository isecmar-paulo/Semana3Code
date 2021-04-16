package po.leit;

public class Main {

    public static void main(String[] args) {
	    String nome = "Lenice Fonseca";

	    boolean res = nome.equals("paulo silva");

	    res = nome.equalsIgnoreCase("paulo silva");

        System.out.println("ultima letra = " + nome.charAt(nome.length() - 1));
		res = nome.startsWith("A");
		if (res)
			System.out.println("Nome começa pela letra A ... ");

		String[] aux = nome.split(" ");
		System.out.println("aux[0] = " + aux[0]);
		System.out.println("aux[0] = " + aux[1]);

		char primeira = aux[0].charAt(0);
		char ultima = aux[1].charAt(0);

		System.out.println("Inicias do nome:  = " + primeira + ultima);




		int turma = 33;
		int[] idade;
		idade = new int[turma];

		String[] nomesLeit = new String[turma];
		nomesLeit[0] = "Lenice Fonseca";
		nomesLeit[1] = "Kleiton ";
		nomesLeit[2] = "Wendy";
		nomesLeit[10] = "Paulo";

		idade[0] = 19;
		idade[1] = 20;


/*		for (String aluno : nomesLeit) {
			if (aluno != null)
				System.out.println("aluno = " + aluno);
		}*/
    }
}

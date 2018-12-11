import java.util.Random;

public class SubSum {

    public SubSum() {}

    private boolean escolhe(int[] v, int i, int n, int k) {

        int[] Isorteados = new int[v.length];
        int[] Nsorteados = new int[v.length];
        Random random = new Random();

        while (i < n) {

            int x = random.nextInt(v.length);

            if (Nsorteados.length == 0) {
                Nsorteados[i] = v[x];
                Isorteados[i] = x;
                i++;
            } else {
                for (int j = 0; j < Nsorteados.length; j++) {
                    if (Isorteados[j] == x) {
                        break;
                    } else {
                        Isorteados[i] = x;
                        Nsorteados[i] = v[x];
                        i++;
                        break;
                    }
                }
            }
        }

        int soma = 0;

        for (int j = 0; j < Nsorteados.length; j++) {
            soma += Nsorteados[j];
        }

        if (soma == k)
            return true;
        else
            return false;
    }

    public void VerfSol(int[] v, int n, int k) {

        boolean existe = escolhe(v, 0, n, k);

        if (existe == true) {
            System.out.println("Sucesso!");
        } else {
            System.out.println("Fracasso!");
        }
    }
}

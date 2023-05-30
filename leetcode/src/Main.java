
import java.util.*;

public class Main {
    public static void main(String[] args) {

        int [] values = {2,3,5,3};

        System.out.println(secondDuplicateSolucao(values));

    }

    public static int firstDuplicateSolucao(int[] v) {
        int menor_second_index = -1;

        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] == v[j]) {
                    if (menor_second_index == -1 || j < menor_second_index) {
                        menor_second_index = j;
                    }

                }
            }
        }
        if (menor_second_index == -1) {
            return -1;
        } else {
            return (int) v[menor_second_index];

        }

    }
    public static int secondDuplicateSolucao(int[] v) {
        final ArrayList<Integer> exist = new ArrayList<Integer>();

        for (int i = 0; i < v.length; i++) {
            if (exist.contains(v[i])) {
                return v[i];

                }
            exist.add(v[i]);
    }
        return -1;
}
}
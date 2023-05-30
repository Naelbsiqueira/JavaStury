import java.util.HashMap;
import java.util.Map;

public class SubArray {
    public static void main(String[] args) {
        int[] values = {3,2,3};
        twoSum(values, 6);
    }


        public static int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int soma=nums[i];
                int x = target-soma;
                if (map.containsKey(x)) {
                    return new int []{map.get(x), i};
                        }
                        map.put(soma, i);

                }
            return null;
        }



    public static int [] secondfind(int[] v, int S) {
        int soma_atual;
        for (int i = 0; i < v.length; i++) {
            soma_atual = 0;
            for (int j = i; j < v.length; j++) {
                    soma_atual += v[j];
                    if (soma_atual == S) {
                        System.out.println((i + 1) + " " + (j + 1));
                        return new int []{i,j} ;
                }

            }
        }
        System.out.println("-1");
        return new int [] {-1};
    }
    public static boolean thirtFind(int[] v, int S) {
        int soma_atual;
        for (int i = 0; i < v.length; i++) {
            soma_atual = 0;
            for (int j = i; j < v.length; j++) {
                soma_atual += v[j];
                if (soma_atual == S) {
                    System.out.println((i + 1) + " " + (j + 1));
                    return true;
                }

            }
        }
        System.out.println("-1");
        return false;
    }

}

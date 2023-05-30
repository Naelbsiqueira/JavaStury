public class GasStation {
    public static int value(int[] k, int[] l){
        int ret =0,tanque=0, total=0 ;

        for (int i = 0; i < k.length; i++) {
                tanque+=k[i]-l[i];
                if (tanque < 0){
                    tanque = 0;
                    ret=i+1;
                }
                total+=k[i]-l[i];
            }
        return total < 0 ? -1:ret;
    }







    public static void main(String[] args) {

        int []gas = {1,2,3,4,5};
        int []custo = {3,4,5,1,2};

        System.out.println(value(gas,custo));


    }
}

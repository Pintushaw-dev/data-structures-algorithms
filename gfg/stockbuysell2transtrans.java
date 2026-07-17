 public class stockbuysell2transtrans {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int lmin=prices[0];
        int lmax=prices[0];
        int res=0;

        int i=0;
        while(i<n-1){
            while(i<n-1 && prices[i] >= prices[i+1]){
                i++;
            }
            lmin=prices[i];
            while(i<n-1 && prices[i] <= prices[i+1]){
                i++;
            }
            lmax=prices[i];

            res+=(lmax-lmin);
        }
        return res;
    }
    public static void main(String args[]){
        int[] arr={20,30,60,10,50,100};
        stockbuysell2transtrans obj=new stockbuysell2transtrans();
        int result=obj.maxProfit(arr);
        System.out.println(result);


    }
}
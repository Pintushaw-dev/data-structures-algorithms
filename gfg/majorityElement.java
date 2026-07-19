public class majorityElement {
    public static void main(String[] args) {
        int [] arr={1,2,1,3,2,2,2};
       int result=  majority(arr);
        System.out.println(result);
    }

    private static int majority(int[] arr) {
        int candidate=0;
        int count=0;
        for(int i=0;i< arr.length;i++){
            if(count==0)
                candidate=arr[i];
            if(candidate==arr[i])
                count++;
            else count--;
        }
        count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==candidate)
                count++;
            if(count>arr.length/2)
                return candidate;
        }
        return -1;
    }
}

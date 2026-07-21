public class singleAmongSortedArray {
           public static int single(int[] ans) {
                int n = ans.length;
                for (int i = 0; i < n - 1; i += 2) {
                    if (ans[i] != ans[i + 1]) {
                        return ans[i];
                    }
                }

                return ans[n - 1];
            }

            public static void main(String[] args) {
                int[] arr = {1, 1, 2, 2, 3, 4, 4};
                System.out.println(single(arr));
            }
}
//class GfG {
//
//    static int single(int[] arr) {
//        int lo = 0, hi = arr.length - 1;
//
//        while (lo < hi) {
//            int mid = lo + (hi - lo) / 2;
//
//            // Ensure mid is odd
//            if (mid % 2 == 1)
//                mid--;
//
//            // If repeating element is at even position,
//            // then single element must be on the right side
//            if (arr[mid] == arr[mid + 1]) {
//                lo = mid + 2;
//            }
//
//            // Else single element must be on the left
//            else {
//                hi = mid;
//            }
//        }
//
//        return arr[lo];
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1, 1, 2, 2, 3, 4, 4};
//        System.out.println(single(arr));
//    }
//}
package PackAge;

/**
 * @Author 墨宣
 * @Date 2021/11/25 19:05
 * 目的：
 */
import java.util.Scanner;
public class ClassName {
    public static void main(String[] args) {
        ClassName className=new ClassName();
        Scanner scanner = new Scanner(System.in);
        int m,n;
        m= scanner.nextInt();
        n=scanner.nextInt();
        int []nums1=new int[m];
        int []nums2=new int[n];
        for (int i=0;i<m;i++){
            nums1[i]=scanner.nextInt();
        }
        for (int i=0;i<n;i++){
            nums2[i]=scanner.nextInt();
        }
        System.out.println(className.resolve(nums1,nums2));
    }
    public double resolve(int []nums1,int []nums2){
        int m = nums1.length;
        int n = nums2.length;
        int left = (m + n + 1) / 2;
        int right = (m + n + 2) / 2;
        return (findKth(nums1, 0, nums2, 0, left) + findKth(nums1, 0, nums2, 0, right));
    }
    public int findKth(int[] nums1, int i, int[] nums2, int j, int k){
        if( i >= nums1.length) {
            return nums2[j + k - 1];//nums1为空数组
        }
        if( j >= nums2.length) {
            return nums1[i + k - 1];//nums2为空数组
        }
        if(k == 1){
            return Math.min(nums1[i], nums2[j]);
        }
        int midVal1 = (i + k / 2 - 1 < nums1.length) ? nums1[i + k / 2 - 1] : Integer.MAX_VALUE;
        int midVal2 = (j + k / 2 - 1 < nums2.length) ? nums2[j + k / 2 - 1] : Integer.MAX_VALUE;
        if(midVal1 < midVal2){
            return findKth(nums1, i + k / 2, nums2, j , k - k / 2);
        }else{
            return findKth(nums1, i, nums2, j + k / 2 , k - k / 2);
        }
    }
}

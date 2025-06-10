package rippling;

/*
* Question:
* Given two sorted arrays nums1 and nums2 of size m and n respectively,
* return the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
* Examples:
*
* Input: nums1 = [1,3], nums2 = [2] Output: 2.00000
* Explanation: merged array = [1,2,3] and median is 2.
*
* Input: nums1 = [1,2], nums2 = [3,4] Output: 2.50000
* Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
* Constraints:
* nums1.length == m
* nums2.length == n
* 0 <= m <= 1000
* 0 <= n <= 1000
* 1 <= m + n <= 2000
* -106 <= nums1[i], nums2[i] <= 106
* */
public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays_BruteForce(int[] nums1, int[] nums2) {
        /*
        * Intent:
        * Merge two sorted arrays
        * Find median
        * */

        int[] finalArray = new int[nums1.length + nums2.length];
        int i=0, j=0, k=0;
        while(i < nums1.length || j < nums2.length) {
            if(i < nums1.length && j < nums2.length) {
                if(nums1[i] < nums2[j])
                    finalArray[k++] = nums1[i++];
                else
                    finalArray[k++] = nums2[j++];
            } else if(i < nums1.length) {
                finalArray[k++] = nums1[i++];
            } else {
                finalArray[k++] = nums2[j++];
            }
        }

        int mid = finalArray.length/2;
        if(finalArray.length%2 == 0) {
            return (finalArray[mid-1]+finalArray[mid])/2.0;
        }
        return finalArray[mid];
        /*
        * Time Complexity = o(m+n)
        * Space Complexity = o(m+n)
        * */
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        /*
         * Intent:
         * Can we find median without actually merging two arrays as two arrays are sorted?
         * */

        int finalLength = nums1.length + nums2.length;
        int i=0, j=0, m1=0, m2=0;
        for(int count=0; count<=finalLength/2; count++) {
            m1 = m2;
            if(i<nums1.length && j<nums2.length) {
                if(nums1[i] < nums2[j])
                    m2 = nums1[i++];
                else
                    m2 = nums2[j++];
            } else if(i<nums1.length)
                m2 = nums1[i++];
            else
                m2 = nums2[j++];
        }

        if(finalLength%2 == 0) {
            return (m1+m2)/2.0;
        }
        return m2;
        /*
         * Time Complexity = o(log(m+n))
         * Space Complexity = o(1)
         * */
    }

    public static void main(String[] args) {
        //Brute Force Solution - o(m+n)
        int[] a = new int[]{1,3};
        int[] b = new int[]{2};
        System.out.println("Median of two sorted arrays: "+findMedianSortedArrays_BruteForce(a,b));

        a = new int[]{1,3};
        b = new int[]{2,4,5,8};
        System.out.println("Median of two sorted arrays: "+findMedianSortedArrays_BruteForce(a,b));

        //Optimised Solution - o(log(m+n))
        a = new int[]{1,3};
        b = new int[]{2};
        System.out.println("Median of two sorted arrays: "+findMedianSortedArrays(a,b));

        a = new int[]{1,3};
        b = new int[]{2,4,5,8};
        System.out.println("Median of two sorted arrays: "+findMedianSortedArrays(a,b));
    }
}

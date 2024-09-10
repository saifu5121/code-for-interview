package com.studyopedia.interview;

public class largest_subarray {
    public static void main(String[] args) {
        int a[]={5,-4,-2,6,-1};
        int max=Integer.MIN_VALUE;
        int min=0;
        for(int i=0;i<a.length;i++){
            min=min+a[i];
            if(max<min){
                max=min;
            }
            if(min < 0){
                min=0;
            }
        }
        System.out.println(max);
    }
}
/*If the array is A: {5, -4, -2, 6, -1}

When i=0;

A[0] = 5

min = min + A[0]
= 0+5 = 5

Since min > max, i.e., 5 > 0, so

max = 5
When i = 1;

A[1] = -4

min = min + A[1]

= 5 - 4 = 1

Since min < max, so maxi!= min

When i = 2;

A[2] = -2

min = min + A[2]

= 1 - 2 = -1
Since min < max, so max is not equal to min. The value of min is negative, so min is equal to 0.

When i = 3;

A[3] = 6

min = min +A[3]

= 0 + 6 = 6

In this case, min is greater than max, i.e., (6>5), so max is equal to min, i.e., 6.

When i = 4;

A[4] = -1

min= min + A[4]

= 6 - 1 = 5

Since min<max, so max is not equal to min.

Therefore, the max of the contiguous array is 6.
 */
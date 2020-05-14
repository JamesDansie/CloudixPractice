package cloudix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// from; https://www.geeksforgeeks.org/merge-sort/
// with minor changes
public class Sort {
    // refresh on sorts
    // start with merge sort

    public void sort(int[] arr, int left, int right){
        if(left < right){
            int mid = (left+right)/2;

            // this recursive call breaks the array into smaller pieces
            // until left == right, when the array is just one element.
            sort(arr, left, mid);
            sort(arr, mid+1, right);

            merge(arr, left, mid, right);
        }
    }

    public void merge(int[] arr, int left, int mid, int right){
        // length of tmp arrays
        int length1 = mid - left + 1;
        int legnth2 = right - mid;

        // tmp arrays
        int L[] = new int[length1];
        int[] R = new int[legnth2];

        for(int i = 0; i < length1; i++){
            L[i] = arr[left + i];
        }
        for(int j = 0; j < legnth2; j++){
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;

        int k = left;
        while(i < length1 && j < legnth2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // copy any remaining elements
        while(i < length1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j < legnth2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args){
        int[] input = new int[]{10, 2, 3, 6, 8, 12, -4, 123123};

        Sort sort = new Sort();
        sort.sort(input, 0, input.length - 1);

        // built in method

//        Arrays.sort(input);

        System.out.println(Arrays.toString(input));

        // another built in method

//        ArrayList<Integer> blah = new ArrayList<>();
//        for(int num: input){
//            blah.add(num);
//        }
//
//        Collections.sort(blah);
//
//        System.out.println(blah);
    }
}

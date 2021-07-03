import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class ClassWork {
    static void  selectionSort(){
        int[] arr = {3,2,5,1,8,4,2};
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            int min = i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[min])
                    min=j;
            }
            int x =arr[i];
            arr[i] = arr[min];
            arr[min] =  x;
        }

        System.out.println(Arrays.toString(arr));
    }
    static void merge(int [] a, int l, int m, int r){
        int [] b = new int[100];
        int i = l, j = m+1, k = l;
        while(i<=m && j<=r){
            if(a[i]<a[j])
                b[k++]=a[i++];
            else
                b[k++]=a[j++];
        }

        while(i<=m)
            b[k++] = a[i++];
        while(j<=r)
            b[k++] = a[j++];
        int x = l;
        while(x<=r){
            a[x]=b[x];
            x++;
        }

    }
    static void mergeSort(int[] a, int l, int r)
    {
        if(l<r) {
            int m;
            m = (l + r) / 2;
            mergeSort(a, l, m);
            mergeSort(a, m+1, r);
            merge(a, l, m, r);
        }
    }

    static float convert(float cel){
        return (cel*1.8f)+32;
    }
    public static void main(String[] args) {
        System.out.println(convert(36.66f));

}
}

//Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).
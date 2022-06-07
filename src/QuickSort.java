public class QuickSort {
    private int arr[];
    private int length;
    void sort(int array[])
    { if(array==null | array.length==0)
    {
        return;
    }
        this.arr=array;
        this.length= array.length;
        sorting(0,length-1);
    }

    private void sorting(int minIndex, int maxIndex) {
        int i=minIndex;
        int j=maxIndex;
        int pivot=arr[minIndex+(maxIndex-minIndex)/2];
        while(i<=j)
        {
            while(arr[i]<pivot){
                i++;
            }
            while(arr[j]>pivot)
            {
                j--;
            }
            if(i<=j)
            {
                exchange(i,j);
                i++;j--;
            }
            if(i<maxIndex)
                sorting(i,maxIndex);
            if(j>minIndex)
                sorting(minIndex,j);
            }
    }

    private void exchange(int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String args[]){
        int array[]={2,4,3,1,5,6,7};
        System.out.println("Array before sorting........");
        for(var j:array)
        {
            System.out.print(j+" ");
        }
        System.out.println("\nArray after sorting....");
        QuickSort quickSort=new QuickSort();
        quickSort.sort(array);
        for(var i : array)
        {
            System.out.print(i+" ");
        }
    }

}//end quicksort


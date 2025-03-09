package Rajat-Repository;

public class secondfile {
    public static void main(String arg[])
    {
        int arr[] = {1,2,3,4,5};
        // int res[] = Reverse(arr,0,3);
        // for(int i=0;i<res.length;i++)
        // {
        //     System.out.print(res[i]+" ");
        // }
        int res[] = Reverse(arr, 2);
        for(int i=0;i<res.length;i++)
        {
            System.out.println(res[i]+" ");
        }
    }
    public static int[] Reverse(int arr[], int d)
    {
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
        }
        return arr;
    }
    //             arr[j]=arr[j-1];
    //         }
    //         arr[0]=temp;
    //     }
    //     return arr;
    // }
}

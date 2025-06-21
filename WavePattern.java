public class WavePattern {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for (int i = 0; i < arr[0].length; i++) {
                if(i%2==0)
                {
                    for (int j2 = 0; j2 < arr.length; j2++) {
                        System.out.print(arr[j2][i]+" ");
                    }
                }
                else{
                     for (int j2 = arr.length-1; j2 >=0; j2--) {
                        System.out.print(arr[j2][i]+" ");
                    }
                }
                System.out.println();
        }

    }
}

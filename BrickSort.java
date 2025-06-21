import java.util.Arrays;

public class BrickSort {
    public static void main(String[] args) {
        // int a[]={2,5,3,1,6,4};
        int a[]={9,8,7,6,5,4,33,2,1};
        int n=a.length-1;
      int lpe=-1,lpo=-1;
      if(n%2==0){
        lpe=n;lpo=-n-1;
      }
      else{
        lpe=n-1;lpo=n;
      }
 

        for (int i = 0; i <=a.length/2; i++) {
           

          for (int j = 0; j <lpe; j=j+2) {
            if(a[j]>a[j+2]){
                int t=a[j];a[j]=a[j+2];a[j+2]=t;
            }
             
          }
        }
        
        for (int i = 0; i <=a.length/2; i++) {
           

          for (int j = 1; j <=lpo; j=j+2) {
                       
            if(a[j]>a[j+2]){
                int t=a[j];a[j]=a[j+2];a[j+2]=t;
            }

          }
        }
        System.out.println(Arrays.toString(a));
        }
    }

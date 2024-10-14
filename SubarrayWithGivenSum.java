public class SubarrayWithGivenSum{
    public static void main(String[] args) {
        int a[]={10,15,-5,15,-10,5};

        
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=a[k];
                    if(sum==5){
                        System.out.println(i);
                        System.out.println(j);
                    }
                }
            }
        }
        
    }
}
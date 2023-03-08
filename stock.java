

public class stock{
    
    public static void main(String args[]){
        
        int arr[]={3,1,4,8,7,2,5};
        int min=arr[0],max=0,index=0;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
                index=i+1;
            }
            if(i>index){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
        }
        if(min>max){
            System.out.println("There is no profit for buying the Stock");
        }
        else{
        System.out.println("Best time to buy Stock is: "+min);
        System.out.println("Best time to sell Stock is: "+max);
        System.out.println("Profit is : "+(max-min));
        }
    }
}
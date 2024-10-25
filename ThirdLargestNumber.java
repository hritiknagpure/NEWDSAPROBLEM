public class Main
{
	public static void main(String[] args) {
		int arr[]={12, 35, 1, 10, 34, 1};
		int firstL=Integer.MIN_VALUE;
		int secondL=Integer.MIN_VALUE;
		int thirdL=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
		    if(arr[i]>firstL){
		        secondL=firstL;
		        thirdL=secondL;
		        firstL=arr[i];
		    }
		    else if(arr[i]>secondL && arr[i]!=firstL){
		        thirdL=secondL;
		        secondL=arr[i];
		    }
		    else if(arr[i]>thirdL && arr[i]!=thirdL){
		        thirdL=arr[i];
		    }
		    
		}
		    System.out.print(thirdL);
	}
}

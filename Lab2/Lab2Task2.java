import java.util.Arrays;

class Lab2Task2{
   
    public static void main(String[] args){
    int arr1[]={2,4,6,8,10};
    int arr2[]={1,3,5,7,9};
    int arr3[]={1,2,3,4};
   
   if(Arrays.equals(arr2,arr3)==true){
   System.out.println("Arrays are equals");
 }  
  else{
  System.out.println("Arrays are not equals");
    }
   
   if(Arrays.equals(arr3,arr1)==true){
   System.out.println("Arrays are equals");
 }  
  else{
  System.out.println("Arrays are not equals");
    }

  }
}
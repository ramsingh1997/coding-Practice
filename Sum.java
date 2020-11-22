public class Sum{
public static void main(String []args){
    // Implement in Java
    // find the sum of all elements in an array
    // output = 155
 int[] arr = { 20, 30, 40, 50, 10, 5};

int sum=0;
for(int i=0;i<arr.length;i++)
{
    sum=sum+arr[i];
}
System.out.println(sum);
     }
}
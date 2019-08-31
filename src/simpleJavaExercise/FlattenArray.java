package simpleJavaExercise;

public class FlattenArray {
    public static void main(String[] args) {
        int arr = add(new int[]{1,2,3,4,5,6,8});
        System.out.println("The value of the array is:" +arr );
    }
    public static int add(int [] arry){
        int sum=0;
        for (int i=0;i<arry.length;i++){
           sum+=arry[i];
        }
        return sum;
    }
}
public class ArrayMath{

    public static int sum(int a[]){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }

    public static int multiply(int a[]){
        int product = 0;
        for(int i = 0; i < a.length; i++){
            product *= a[i];
        }
        return product;
    }

}


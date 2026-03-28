public class sub{
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sub = a - b;
        System.out.println("The difference of a and b is: " + sub);
        if(sub < 0){
            System.out.println("The result is negative.");
        } else if (sub > 0){
            System.out.println("The result is positive.");
        } else {
            System.out.println("The result is zero.");
        }
    }
}   

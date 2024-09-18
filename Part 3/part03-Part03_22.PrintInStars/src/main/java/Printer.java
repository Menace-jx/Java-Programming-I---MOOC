
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for (int i = 0; i<array.length; i++){
            stars(array[i]);
            System.out.println("");
        }
    }
    //printing stars
    public static void stars(int star){       
        for (int i = 0; i< star ; i++){
            System.out.print("*");  
        }
    }

}

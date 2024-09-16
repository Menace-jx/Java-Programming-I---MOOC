
public class StarSign {

    public static void main(String[] args) {

        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // first part of the exercise
        //for  loop
        for (int i = 1; i <= number; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSquare(int size) {
        // second part of the exercise
        //while loop practice
        int rows = 1;
        while (rows <= size){
            printStars(size);
            rows++;
        }
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        // for loop practice
        for (int i =1; i <= height; i++ ){
            printStars(width);
 
        }
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        // for loop practice
        for (int i = 1; i <= size; i++){
            printStars(i);
        }
    }
}


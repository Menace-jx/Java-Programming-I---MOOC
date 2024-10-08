
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 1; i<=number; i++){
            System.out.print("*");
        }
        System.out.println("");       
    }
  
    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i<number; i++){
            System.out.print(" ");
        }
    }
  
    public static void printTriangle(int size) {
        // part 2 of the exercise
        int space = size - 1;
        int stars = 1;
  
        while (true){
            if (space>0){
                printSpaces(space);
                space--;
            }
            if (stars<=size){
                printStars(stars);
                stars++;
            } else {
                break;
            }
        }
    }
  
    public static void christmasTree(int height) {
        // part 3 of the exercise
        int space = height - 1;
        int stars = 1;
        int numOfStars = height*2-1;
        for (int i = 1; i<= height; i++){
            if (space>0){
                printSpaces(space);
                space --;
            } 
            
            if (stars <= numOfStars){
                printStars(stars);
                stars += 2;
            }
        }
        for(int i = 0; i< 2;i++){
            printSpaces(height-2);
            printStars(3);
        }
       
    }
  
    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
  
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
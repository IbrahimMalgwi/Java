package dietel.Chapter5;
// Program to print pattern of triangles
public class Ex5_15 {
    public static void main(String[] args) {
        System.out.println("Pattern A");
        for (int row =1; row <=10; row++) {
            for(int c = 1; c <= row; c++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern B");
        for (int row = 10; row >=1; row--){
            for(int c = 1; c <=row; c++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern C");
        for (int row = 10; row >=1; row--){
            for (int space = 10; space > row; space--)
                System.out.print(" ");
            for(int c = 1; c <=row; c++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern D");
        for (int row =10; row >=1; row--) {
            for (int s = 1; s < row; s++)
                System.out.print(" ");
            for (int c = 10; c >= row; c--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

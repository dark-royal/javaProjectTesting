package turtleGraphics;

public class SketchPad {

    private int[][] floor;
     static int[][] sketchboard = new int[20][20];
    public static int[][] getFloor() {
        return sketchboard;
    }

public void displayBoard(){
    for (int row = 0; row < 20; row++) {
        for (int column = 0; column < 20; column++) {
            if(sketchboard[row][column] == 1){
                System.out.println("*");
            }
                if(sketchboard[row][column] == 0){
                    System.out.println("*");
            }


        }
        System.out.println();

    }
}



    }


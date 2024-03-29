package turtleGraphics;

public class Position {
    private  int row;
    private  int column;


    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getColumn() {
        return column;

    }

    @Override
    public String toString() {
        return "Position{" +
                "row=" + row +
                ", column=" + column +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Position position){
            return row == position.row && column == position.column;
        }
        return false;

    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getRow() {
        return row;
    }
}

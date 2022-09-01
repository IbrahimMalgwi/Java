package turtleChubozo;

public class Position {
    private int row = 0;
    private int column = 0;



    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int newRow) {
        row = newRow;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int newColumn) {
        column = newColumn;
    }



    @Override
    public boolean equals(Object obj){
        boolean isEqual = false;
        Position comparedPosition = (Position) obj;
        boolean rowsAreEquals = comparedPosition.row == this.row;
        boolean colmnsAreEqual =  comparedPosition.column == this.column;
        return rowsAreEquals && colmnsAreEqual;
    }

    @Override
    public String toString() {
        return "Position{" +
                "row=" + row +
                ", column=" + column +
                '}';
    }
}

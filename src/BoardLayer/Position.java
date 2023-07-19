package BoardLayer;


public class Position {
    private int row;
    private int column;
    public void setValues(int row, int column) {
        this.row = row;
        this.column = column;
    }


    public Position() {
    }


    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }


    public int getRow() {
        return row;
    }


    public void setRow(int row) {
        this.row = row;
    }


    public int getColumn() {
        return column;
    }


    public void setColumn(int column) {
        this.column = column;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Linha(row):").append(row);
        sb.append("\n");
        sb.append("Coluna(column):").append(column);
        return sb.toString();
    }
}

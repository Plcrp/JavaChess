package BoardLayer;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        position = null;
        this.board = board;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    protected Board getBoard() {
        return board;
    }
}

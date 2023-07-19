import BoardLayer.Board;
import BoardLayer.Position;
import ChessLayer.ChessMatch;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ChessMatch chessmatch = new ChessMatch();
        UI.printBoard(chessmatch.getPiece());

        sc.close();
    }
}

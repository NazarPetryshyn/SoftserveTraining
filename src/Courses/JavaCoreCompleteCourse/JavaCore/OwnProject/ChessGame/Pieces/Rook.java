package Courses.JavaCoreCompleteCourse.JavaCore.OwnProject.ChessGame.Pieces;

import Courses.JavaCoreCompleteCourse.JavaCore.OwnProject.ChessGame.Piece;
import Courses.JavaCoreCompleteCourse.JavaCore.OwnProject.ChessGame.Position;

public class Rook extends Piece {
    public Rook(String figure, Position position, String color) {
        super(figure, position, color);
    }

    @Override
    public boolean canMove(Position position1, Position position2) {
        return true;
    }
}

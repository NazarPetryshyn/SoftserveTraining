package Courses.JavaCoreCompleteCourse.JavaCore.OwnProject.ChessGame.Pieces;


import Courses.JavaCoreCompleteCourse.JavaCore.OwnProject.ChessGame.Piece;
import Courses.JavaCoreCompleteCourse.JavaCore.OwnProject.ChessGame.Position;

public class Edge extends Piece {
    public Edge(String figure, int xPos, int yPos, String color) {
        super(figure, xPos, yPos, color);
    }

    @Override
    public boolean canMove(Position position1, Position position2) {
        return true;
    }
}

package Chess;


public class Rook extends ChessPiece {
    public Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int startLine, int startColumn, int endLine, int endColumn) {
        if (checkPos(startLine) && checkPos(startColumn)) {



            if (!chessBoard.nowPlayerColor().equals(board[startLine][startColumn].getColor())) return false;

            if (board[startLine][startColumn].canMoveToPosition(chessBoard, startLine, startColumn, endLine, endColumn)) {
                board[endLine][endColumn] = board[startLine][startColumn]; // if piece can move, we moved a piece
                board[startLine][startColumn] = null; // set null to previous cell
                chessBoard.nowPlayer = chessBoard.nowPlayerColor().equals("White") ? "Black" : "White";

                return true;
            } else return false;
        } else return false;

    }

    @Override
    public String getSymbol() {
        return "R";
    }
    private boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }
}

package Chess;



public class Bishop extends ChessPiece {
    public Bishop(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int startLine, int startColumn, int endLine, int endColumn) {
        if (checkPos(startLine) && checkPos(startColumn) && checkPos(endLine) && checkPos(endColumn)) {

            if (startLine != endLine && startColumn != endColumn &&(chessBoard.board[endLine][endColumn] == null ||
                    !chessBoard.board[endLine][endColumn].color.equals(this.color)) && chessBoard.board[startLine][startColumn] != null){

                if (!chessBoard.board[startLine][startColumn].equals(this.color)){
                    return false;
                }
                int [][] positions = new int[][]{
                        {st}
                };
            }


        } else return false;
return false;
    }

    @Override
    public String getSymbol() {
        return "B";
    }

    private boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }
}


package Chess;




public class Horse extends ChessPiece {
    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int startLine, int startColumn, int endLine, int endColumn) {
        if (checkPos(startLine) && checkPos(startColumn) && checkPos(endLine) && checkPos(endColumn)){

            if (startLine != endLine && startColumn != endColumn && (chessBoard.board[endLine][endColumn] == null ||
                    !chessBoard.board[endLine][endColumn].color.equals(this.color)) && chessBoard.board[startLine][startColumn] != null) {

                if (!chessBoard.board[startLine][startColumn].equals(this)) {
                    return false;
                }

                int[][] positions = new int[][]{
                        {startLine - 2, startColumn - 1}, {startLine - 2, startColumn + 1},
                        {startLine + 2, startColumn - 1}, {startLine + 2, startColumn + 1},
                        {startLine - 1, startColumn - 2}, {startLine - 1, startColumn + 2},
                        {startLine + 1, startColumn - 2}, {startLine + 1, startColumn + 2}};

                for (int i = 0; i < positions.length; i++) {
                    if (positions[i][0] == endLine && positions[i][1] == endColumn)
                        return true;

                }
            }


        }else return false;
        return false;
    }

    @Override
    public String getSymbol() {
        return "H";
    }

    private boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }
}

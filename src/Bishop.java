class Bishop extends Piece {
    Bishop(Position position) {
        super(position);
    }

    @Override
    boolean isValidMove(Position newPosition) {
        if (!super.isValidMove(newPosition)) return false;

        // Le Fou se déplace en diagonale : |deltaRow| == |deltaCol|
        int deltaRow = Math.abs(newPosition.row    - this.position.row);
        int deltaCol = Math.abs(newPosition.column - this.position.column);
        return deltaRow == deltaCol;
    }
}

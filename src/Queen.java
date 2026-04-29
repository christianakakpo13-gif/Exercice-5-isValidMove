class Queen extends Piece {

    Queen(Position position) {
        super(position);
    }

    @Override
    boolean isValidMove(Position newPosition) {
        // Vérifier les limites du plateau via la classe parente
        if (!super.isValidMove(newPosition)) return false;

        int deltaRow = Math.abs(newPosition.row    - this.position.row);
        int deltaCol = Math.abs(newPosition.column - this.position.column);

        boolean horizontal = (newPosition.row    == this.position.row);
        boolean vertical   = (newPosition.column == this.position.column);
        boolean diagonal   = (deltaRow == deltaCol);

        return horizontal || vertical || diagonal;
    }
}
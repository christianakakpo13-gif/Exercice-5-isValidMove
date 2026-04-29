class Rock extends Piece {
    Rock(Position position) {
        super(position);
    }

    @Override
    boolean isValidMove(Position newPosition) {
        // 1. Vérifier les limites du plateau via la classe parente
        if (!super.isValidMove(newPosition)) return false;

        // 2. La Tour se déplace en ligne droite (même ligne OU même colonne)
        return (newPosition.row    == this.position.row)
                || (newPosition.column == this.position.column);
    }
}
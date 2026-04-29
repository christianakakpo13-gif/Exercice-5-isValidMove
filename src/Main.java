@Override
public boolean isValidMove(int startX, int startY, int endX, int endY) {
    // Déplacement horizontal
    if (startY == endY && startX != endX) {
        return true;
    }
    // Déplacement vertical
    if (startX == endX && startY != endY) {
        return true;
    }
    // Déplacement diagonal
    if (Math.abs(endX - startX) == Math.abs(endY - startY)) {
        return true;
    }
    // Sinon, déplacement invalide
    return false;
}

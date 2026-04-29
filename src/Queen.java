class Main {
    public static void main(String[] args) {
        // Reine placée en (4, 4)
        Queen queen = new Queen(new Position(4, 4));

        // Tests
        System.out.println(queen.isValidMove(new Position(4, 7))); // true  — horizontal
        System.out.println(queen.isValidMove(new Position(1, 4))); // true  — vertical
        System.out.println(queen.isValidMove(new Position(7, 7))); // true  — diagonal
        System.out.println(queen.isValidMove(new Position(5, 7))); // false — mouvement invalide
        System.out.println(queen.isValidMove(new Position(3,10))); // false — hors plateau
    }
}
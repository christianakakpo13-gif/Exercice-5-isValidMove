
# Exercice 5 : isValidMove 🏆

## Description

Ce projet Java implémente un système de validation des mouvements des pièces d'échecs. L'objectif est de déterminer si un mouvement d'une pièce vers une nouvelle position est valide, en tenant compte des règles spécifiques de chaque pièce et des limites du plateau.

## Structure du Projet

Le projet utilise l'**héritage** et le **polymorphisme** pour implémenter les différentes pièces d'échecs :

### Classes Principales

| Classe | Description |
|--------|-------------|
| **Position** | Représente une position sur l'échiquier (ligne et colonne de 1 à 8) |
| **Piece** | Classe mère définissant le comportement général des pièces |
| **Bishop** | Fou - se déplace en diagonale |
| **Rock** | Tour - se déplace en ligne droite (horizontalement ou verticalement) |
| **Queen** | Reine - combine les mouvements de la tour et du fou |
| **Main** | Classe de test avec des exemples d'utilisation |

## Implémentation

### Classe `Position`
Représente une case de l'échiquier avec ses coordonnées :
- `row` : ligne (1 à 8)
- `column` : colonne (1 à 8)

### Classe `Piece` (classe parente)
Vérifie que la destination est **valide sur le plateau** (entre 1 et 8).

### Classe `Bishop` (Fou)
- Hérite de `Piece`
- ✅ **Mouvements autorisés** : en diagonale
- Condition : `|deltaRow| == |deltaCol|`

### Classe `Rock` (Tour)
- Hérite de `Piece`
- ✅ **Mouvements autorisés** : horizontalement ou verticalement
- Condition : même ligne OU même colonne

### Classe `Queen` (Reine)
- Hérite de `Piece`
- ✅ **Mouvements autorisés** : horizontalement, verticalement ou en diagonale
- Combine les règles de la tour et du fou

## Exemples d'Utilisation

```java
// Créer une reine en position (4, 4)
Queen queen = new Queen(new Position(4, 4));

// Tester les mouvements
queen.isValidMove(new Position(4, 7));  // true  → mouvement horizontal
queen.isValidMove(new Position(1, 4));  // true  → mouvement vertical
queen.isValidMove(new Position(7, 7));  // true  → mouvement diagonal
queen.isValidMove(new Position(5, 7));  // false → mouvement invalide
queen.isValidMove(new Position(3, 10)); // false → hors du plateau

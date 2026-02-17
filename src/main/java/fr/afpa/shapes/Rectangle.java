package fr.afpa.shapes;

// TODO implémenter la classe Rectangle
// se référer au diagramme UML contenu dans le sous-dossier "doc" pour retrouver les informations concernant ses attributs

public class Rectangle implements Shape {

    private double length;
    private double width;

    // Constructeur
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getters
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

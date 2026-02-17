package fr.afpa.shapes;

import java.util.ArrayList;

class GeometricShapeMain
{
	public static void main(String[] args) 
	{

	// Création des objets
        Rectangle rect1 = new Rectangle(5, 3);
        Rectangle rect2 = new Rectangle(10, 4);

        Circle circle1 = new Circle(2);
        Circle circle2 = new Circle(6);

        // Création de la liste de formes
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(rect1);
        shapes.add(rect2);
        shapes.add(circle1);
        shapes.add(circle2);

        // Boucle pour afficher les résultats
        for (Shape shape : shapes) {
            System.out.println("Périmètre : " + shape.calculatePerimeter());
            System.out.println("Aire : " + shape.calculateArea());
            System.out.println("----------------------");
        }
    }
}
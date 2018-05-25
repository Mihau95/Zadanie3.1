class ShapeTest{
    public static void main(String[] args){

        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(5,3);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(4,5,6);


        ShapeCalculator shapeCalculator = new ShapeCalculator();
        double squareArea = shapeCalculator.squareArea(square);
        double circleArea = shapeCalculator.circleArea(circle);
        double trianglePerimeter = shapeCalculator.trianglePerimeter(triangle);
        double rectPerimeter = shapeCalculator.rectPerimeter(rectangle);

        System.out.println("Pole kwadratu: " + squareArea + ", pole kola: " + circleArea + ", obwod trojkąta: " + trianglePerimeter + ", obwod prostokata: " + rectPerimeter);


        double squArea = square.calculateArea();
        double squPeri = square.calculatePerimeter();
        System.out.println("Kwadrat: " + squArea + " " + squPeri);

        double rectArea = rectangle.calculateArea();
        double rectPeri = rectangle.calculatePerimeter();
        System.out.println("Prostokat: "+ rectArea + " " + rectPeri);

        double cirArea = circle.calculateArea();
        double cirPeri = circle.calculatePerimeter();
        System.out.println("Kolo: " + cirArea + " " + cirPeri);

        double triPeri = triangle.calculatePerimeter();
        System.out.println("Trojkąt: " + triPeri);
    }
}
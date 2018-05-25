class ShapeCalculator{

    double squareArea(Square square){
        return square.a * square.a;
    }

    double circleArea(Circle circle){
        return 3.14 * (circle.r*circle.r);
    }

    double trianglePerimeter(Triangle triangle){
        return triangle.a + triangle.b + triangle.c;
    }

    double rectPerimeter(Rectangle rectangle){
        return 2*(rectangle.a + rectangle.b);
    }

}
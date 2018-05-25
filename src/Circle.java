class Circle{
    double r;

    Circle(double r){
        this.r = r;
    }

    double calculateArea(){
        return 3.14 * (r*r);
    }

    double calculatePerimeter(){
        return 2 * 3.14 * r;
    }

}
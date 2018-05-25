class Square{
    double a;

    Square (double a){
        this.a = a;
    }
    double calculateArea(){
        return a * a;
    }
    double calculatePerimeter(){
        return 4 * a;
    }
}
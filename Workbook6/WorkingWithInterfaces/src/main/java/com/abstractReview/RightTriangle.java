package com.abstractReview;

public class RightTriangle extends Shape{
    private float base;
    private float height;
    private float hypotenuse;

    @Override
    public float calcArea() {
        return (this.base * this.height) / 2;
    }

    @Override
    public float calcPerimeter() {
//        Math.exp(Math.pow(this.base,2)+Math.pow(this.height,2))

        double baseSquared = Math.pow(this.base, 2);
        double heightSquared = Math.pow(this.height, 2);
        double sideAdded = (float)(baseSquared + heightSquared);
        float sqrt = (float)Math.sqrt(sideAdded);

        return this.base + this.height + sqrt;
    }
}

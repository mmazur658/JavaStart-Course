package pl.mazurmarcin.javastart.lecture10.homework.shapes;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

	@Override
	public double ballVolume(Ball ball) {
		return ball.calculate();
	}

	@Override
	public double cubeVolume(Cube cube) {
		return cube.calculate();
	}

	@Override
	public double circleArea(Circle circle) {
		return circle.calculate();
	}

	@Override
	public double rectangeArea(Rectangle rectangle) {
		return rectangle.calculate();
	}

	@Override
	public double shapeArea(GeometricShape shape) {
		return shape.calculate();
	}

	@Override
	public double volume(Shape3D shape) {
		return shape.calculate();
	}

}

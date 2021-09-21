package softwareDeveloperTestAltair.arraySort.polygon;

public class Circle extends Polygon {

	private static double PI = Math.PI;
	private float radius;

	public Circle(String name, float radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public float getArea() {
		return (float) (PI * Math.pow(radius, 2));
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

}

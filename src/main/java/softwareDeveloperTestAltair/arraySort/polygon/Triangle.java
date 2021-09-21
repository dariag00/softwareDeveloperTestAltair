package softwareDeveloperTestAltair.arraySort.polygon;

/**
 * For the shake of simplicity, we'll consider all triangles to be rectangles :)
 */
public class Triangle extends Polygon {
	private float base;
	private float heigth;

	public Triangle(String name, float base, float height) {
		super(name);
		this.base = base;
		this.heigth = height;
	}

	@Override
	public float getArea() {
		return base * heigth / 2;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getHeigth() {
		return heigth;
	}

	public void setHeigth(float heigth) {
		this.heigth = heigth;
	}
}

package softwareDeveloperTestAltair.arraySort.polygon;

public class Rectangle extends Polygon {
	
	private float base;
	private float heigth;

	public Rectangle(String name, float base, float height) {
		super(name);
		this.base = base;
		this.heigth = height;
	}

	@Override
	public float getArea() {
		return base * heigth;
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

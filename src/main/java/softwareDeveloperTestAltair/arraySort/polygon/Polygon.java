package softwareDeveloperTestAltair.arraySort.polygon;

public abstract class Polygon {

    private String name;

    public Polygon(String name) {
        this.name = name;
    }

    public abstract float getArea();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

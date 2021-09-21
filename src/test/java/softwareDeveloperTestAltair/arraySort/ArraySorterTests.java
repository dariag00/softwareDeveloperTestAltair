package softwareDeveloperTestAltair.arraySort;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import softwareDeveloperTestAltair.arraySort.polygon.Circle;
import softwareDeveloperTestAltair.arraySort.polygon.Polygon;
import softwareDeveloperTestAltair.arraySort.polygon.Rectangle;
import softwareDeveloperTestAltair.arraySort.polygon.Triangle;
import softwareDeveloperTestAltair.arraySort.sortingCriteria.SortingCriteriaEnum;

public class ArraySorterTests {
	
	@Test
	public void testAscendingSorting() {
		Circle circle = new Circle("circle-1", 3);
		Triangle triangle = new Triangle("triangle-1", 3, 5);
		Rectangle rectangle = new Rectangle("rectangle-1", 3, 5);
		Polygon[] polygonArray = {circle, triangle, rectangle};
		ArraySorter sorter = new ArraySorter(polygonArray) ;

		Polygon[] sortedPolygons = sorter.sort(SortingCriteriaEnum.ASCENDING);
		
		assertEquals(sortedPolygons[0], triangle);
		assertEquals(sortedPolygons[1], rectangle);
		assertEquals(sortedPolygons[2], circle);
	}
	
	//... Whatever you want to add.
	@Test
	public void testDescendingSorting(){
		Circle circle = new Circle("circle-1", 3);
		Triangle triangle = new Triangle("triangle-1", 3, 5);
		Rectangle rectangle = new Rectangle("rectangle-1", 3, 5);
		Polygon[] polygonArray = {circle, triangle, rectangle};
		ArraySorter sorter = new ArraySorter(polygonArray) ;

		Polygon[] sortedPolygons = sorter.sort(SortingCriteriaEnum.DESCENDING);
		assertEquals(sortedPolygons[0], circle);
		assertEquals(sortedPolygons[1], rectangle);
		assertEquals(sortedPolygons[2], triangle);
	}


}

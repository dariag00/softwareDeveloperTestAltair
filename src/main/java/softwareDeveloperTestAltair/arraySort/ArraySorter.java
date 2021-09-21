package softwareDeveloperTestAltair.arraySort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

import softwareDeveloperTestAltair.arraySort.polygon.Polygon;
import softwareDeveloperTestAltair.arraySort.sortingCriteria.SortingCriteriaEnum;

public class ArraySorter {

	
	
	private Polygon[] polygons = {};
	
	public ArraySorter(Polygon[] polygons) {
		this.polygons = polygons;
	}
	
	public Polygon[] sort(SortingCriteriaEnum criteria) {
		if(criteria == SortingCriteriaEnum.ASCENDING)
			Arrays.sort(polygons, Comparator.comparing(Polygon::getArea));
		else
			Arrays.sort(polygons, Comparator.comparing(Polygon::getArea, Collections.reverseOrder()));
		printSortedPolygons(polygons);
		return polygons;
	}
	
	public void printSortedPolygons(Polygon[] sortedPolygons) {
		Stream.of(sortedPolygons).forEachOrdered(x->System.out.println(x.toString()));
	}
	
	public static void main(String...args) {
		// Here you can play with your implementation, but please don't forget tests.
	}
}

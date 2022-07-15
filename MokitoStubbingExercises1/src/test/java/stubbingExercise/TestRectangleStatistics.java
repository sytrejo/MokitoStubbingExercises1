+package stubbingExercise;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TestRectangleStatistics {

	@Test
	void test() {
		RectangleStatistics stats1 = new RectangleStatistics();
		Rectangle rectangle1 = mock(Rectangle.class);
	}
	
	@Test
	void test_calculateArea_returns20_whenRectangleWithWidth4AndLength5PassedIn(){
		Rectangle rectangle1 = mock(Rectangle.class);
		when(rectangle1.getWidth()).thenReturn(4);
		
		when(rectangle1.getLength()).thenReturn(5);
		RectangleStatistics stats1 = new RectangleStatistics();
		int area = stats1.calculateArea(rectangle1);
		
		assertEquals(20,area);
	}
	
	@Test
	void test_calculateArea_returns35_whenRectangleWithWidth5AndLength7PassedIn(){
		Rectangle rectangle1 = mock(Rectangle.class);
		when(rectangle1.getWidth()).thenReturn(5);
		when(rectangle1.getLength()).thenReturn(7);
		
		RectangleStatistics stats1 = new RectangleStatistics();
		int area = stats1.calculateArea(rectangle1);
		
		assertEquals(35,area);
	}
	
	@Test
	void test_calculateCircumference_returns22_whenRectangleWithWidth3AndLength8PassedIn() {
		Rectangle rectangle1 = mock(Rectangle.class);
		when(rectangle1.getWidth()).thenReturn(3);
		when(rectangle1.getLength()).thenReturn(8);
		
		RectangleStatistics stats1 = new RectangleStatistics();
		int circumference = stats1.calculateCircumference(rectangle1);
		
		assertEquals(22, circumference);   
		
	}
	
	@Test
	void test_calculateCircumference_returns60_whenRectangleWithWidth10AndLength20PassedIn() {
		Rectangle rectangle1 = mock(Rectangle.class);
		when(rectangle1.getWidth()).thenReturn(10);
		when(rectangle1.getLength()).thenReturn(20);
		
		RectangleStatistics stats1 = new RectangleStatistics();
		int circumference = stats1.calculateCircumference(rectangle1);
		
		assertEquals(60, circumference);   
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}

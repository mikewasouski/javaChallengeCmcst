import static org.junit.Assert.*;

import java.awt.Rectangle;

import org.junit.Test;

import com.comcast.csv.interview.problems.PojoAlgProblem;

public class PojoAlgProblemTest {
	
	Rectangle inner = new Rectangle(100, 100, 80, 40);
    Rectangle outer = new Rectangle(100, 100, 100, 60);

	@Test
	public void bottomRightTest() {
		
	    PojoAlgProblem shapePos = new PojoAlgProblem();
	    shapePos.bottomRight(inner, outer);
	    
	    assertEquals(120, inner.x);
	}
	
	@Test
	public void middleCenterTest() {
		
	    PojoAlgProblem shapePos = new PojoAlgProblem();
	    shapePos.middleCenter(inner, outer);
	    
	    assertEquals(110, inner.x);
	}

}

import static org.junit.Assert.*;

import org.junit.Test;
import com.comcast.csv.interview.problems.StringParsingProblem;

public class StringParsingProblemTest {
	String[] validAdresses = {
			 "25w873 Apple St.",
			 "3n17 Special Ave.",
			 "0e34800 Main St."};

	@Test
	public void isAddressValidTest() {
		//fail("Not yet implemented");
		StringParsingProblem service = new StringParsingProblem();
		
		for(String adress : validAdresses){
			assertEquals(true, service.isAddressValid(adress));
		}
	}
	
	@Test
	public void isAddressNotValidTest() {
		//fail("Not yet implemented");
		StringParsingProblem service = new StringParsingProblem();
		String[] adresses = {
		 "25w873 Apple St",
		 "w873 Apple St.",
		 "25w873 AppleSt.",
		 "3h17 Special Ave.",
		 "0eABCMain St."};
		for(String adress : adresses){
			assertEquals(false, service.isAddressValid(adress));
		}
	}
	
	@Test
	public void getDistanceFromCityCenterTest() {
		//fail("Not yet implemented");
		StringParsingProblem service = new StringParsingProblem();

		assertEquals(25, service.getDistanceFromCityCenter(validAdresses[0]));
		assertEquals(3, service.getDistanceFromCityCenter(validAdresses[1]));
		assertEquals(0, service.getDistanceFromCityCenter(validAdresses[2]));
		
	}

}

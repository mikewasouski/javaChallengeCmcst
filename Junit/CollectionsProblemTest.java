import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import org.junit.Test;

import com.comcast.csv.interview.problems.CollectionsProblemImpl;
import com.comcast.csv.meme.Meme;

public class CollectionsProblemTest {

	@Test
	public void test() {
		List<Meme> memeTestColl = new ArrayList<Meme>();
		Random rand = new Random();
		
		for(int i=10; i>= 0; i--){
			String[] tags = {"Hola","world"};
			
			int  year = rand.nextInt(2000) + 1;
			
			Meme test = new Meme();
			test.setName("name"+i);
			test.setYear(year);
			test.setTags(tags);
			
			memeTestColl.add(test);
		}
		
		for(Meme memeTest : memeTestColl){
			System.out.println(memeTest.getYear());
		}
		
		System.out.println("--------------------------------");

		CollectionsProblemImpl problemTest = new CollectionsProblemImpl();
		problemTest.sort(memeTestColl, true);
		
		for(Meme memeTest : memeTestColl){
			System.out.println(memeTest.getYear());
		}
		
	}

}

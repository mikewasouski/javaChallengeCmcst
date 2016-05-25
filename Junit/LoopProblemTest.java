import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Test;

import com.comcast.csv.meme.Meme;

public class LoopProblemTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	public List<Meme> getMemeList(){
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
		return memeTestColl;
	}

}

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.junit.Test;

import com.comcast.csv.interview.problems.CollectionsProblemImpl;
import com.comcast.csv.meme.Meme;

public class CollectionsProblemTest {
	CollectionsProblemImpl problemTest = new CollectionsProblemImpl();
	
	@Test
	public void CollectionsProblemImplAscendingTest() {
		List<Meme> memeTestColl = new ArrayList<Meme>();
		Random rand = new Random();
		
		int i=9;
		for(; i>= 0; i--){
			String[] tags = {"Hola","world"};
			
			int  year = rand.nextInt(2000) + 10;
			
			Meme test = new Meme();
			test.setName("name"+i);
			test.setYear(year);
			test.setTags(tags);
			
			memeTestColl.add(test);
		}
		
		Meme test = new Meme();
		test.setName("last"+i);
		test.setYear(1);
		memeTestColl.add(test);
	
		problemTest.sort(memeTestColl, true);
		assertEquals(1, memeTestColl.get(0).getYear());
		for(Meme meme : memeTestColl){
			assertTrue(memeTestColl.get(0).getYear() <= meme.getYear());
		}
	}
	
	@Test
	public void CollectionsProblemImplDescendingTest() {
		List<Meme> memeTestColl = getMemeList();
		
		Meme test = new Meme();
		test.setName("last"+12);
		test.setYear(3000);
		memeTestColl.add(test);

	
		problemTest.sort(memeTestColl, false);
		for(Meme meme : memeTestColl){
			//System.out.println(meme.getYear());
			assertTrue(memeTestColl.get(0).getYear() >= meme.getYear());
		}
	}
	
	@Test
	public void addTagTest() { 
		List<Meme> memeList = getMemeList();
		problemTest.addTag(memeList, "newTag");
		
		for(Meme memeTest : memeList){
			//System.out.println(memeTest.getTags()[2]);
			assertTrue(memeTest.getTags()[2].equals("newTag")  );
		}
	}
	
	public List<Meme> getMemeList(){
		List<Meme> memeTestColl = new ArrayList<Meme>();
		Random rand = new Random();
		
		for(int i=0; i<= 10; i++){
			String[] tags = {"Hola","world"};
			int  year = rand.nextInt(2000) + 1;
			//System.out.println(year);
			Meme test = new Meme();
			test.setName("name"+i);
			test.setYear(year);
			test.setTags(tags);
			
			memeTestColl.add(test);
		}
		return memeTestColl;
	}

}

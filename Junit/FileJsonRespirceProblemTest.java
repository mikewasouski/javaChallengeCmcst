import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.comcast.csv.interview.problems.FileJsonResourceProblem;
import com.comcast.csv.meme.Meme;
import com.comcast.csv.meme.YoureDoingItWrongException;

public class FileJsonRespirceProblemTest {

	@Test
	public void test() {
		List<Meme> memes = new ArrayList<Meme>();
		Meme meme = new Meme();
		meme.setName("Miguel Angel R");
		meme.setYear(2005);
		meme.setTags(new String[] {"One","Two","Three","Four","Mike"});
		memes.add(meme);
		
		Meme meme1 = new Meme();
		meme1.setName("Elizabeth Graham");
		meme1.setYear(2007);
		meme1.setTags(new String[] {"uno","dos","tres","cuatro","algo"});
		memes.add(meme1);
		
		Meme meme2 = new Meme();
		meme2.setName("reiko nakamura");
		meme2.setYear(2005);
		meme2.setTags(new String[] {"ein","zwei","drei","vier","prost"});
		memes.add(meme2);
		
		List<Meme> memesFile = new ArrayList<Meme>();
		FileJsonResourceProblem fileProblem = new FileJsonResourceProblem();
		try {
			memesFile = fileProblem.readFromClasspath("D:\\info.json");
		} catch (YoureDoingItWrongException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Meme memeAux : memes){
			assertTrue(memesFile.contains(memeAux));
		}
		
	}

}

package com.comcast.csv.interview.problems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

import com.comcast.csv.meme.Meme;

/**
 * Using all forms of loops and recursions to iterate over a {@link List} of {@link Meme}s and log it's name and year.
 * Format of the log message isn't important.
 */
public class LoopProblem {
	
	public static final Logger logger = Logger.getLogger("Log INFO");
	//private static Logger logger = Logger.getLogger(LoopProblem.class.getName());
	public static void main(String[] args) {
		List<Meme> memeList = getMemeList();
		
		usingFor(memeList);
		usingEnhacedFor(memeList);
		usingWhile(memeList);
		usingWhileSize(memeList);
	}
	
	private static void usingWhileSize(List<Meme> memeList) {
		int i = 0;
		while (i < memeList.size()) {
			logger.info("While with size for"+memeList.get(i).getName()+" "+memeList.get(i).getYear());
			i++;
		}
		
	}

	private static void usingWhile(List<Meme> memeList) {
		Iterator<Meme> itMemeList = memeList.iterator();
		
		while (itMemeList.hasNext()) {
			Meme meme = itMemeList.next();
			logger.info("While iterator"+meme.getName()+" "+meme.getYear());
		}
	}

	private static void usingEnhacedFor(List<Meme> memeList) {
		for ( Meme item : memeList) {
			logger.info("Enhaced for"+item.getName()+" "+item.getYear());
		}
	}


	private static void usingFor(List<Meme> memeList) {
		
		for (Iterator iterator = memeList.iterator(); iterator.hasNext();) {
			
			Meme meme = (Meme) iterator.next();
			logger.info(meme.getName()+" "+meme.getYear());
		}
		
	}

	public static List<Meme> getMemeList(){
		List<Meme> memeTestColl = new ArrayList<Meme>();
		Random rand = new Random();
		
		for(int i=4; i>= 0; i--){
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

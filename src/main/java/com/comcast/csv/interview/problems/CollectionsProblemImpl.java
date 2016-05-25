package com.comcast.csv.interview.problems;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.comcast.csv.meme.Meme;

/**
 * Implement the specified interface.
 */
public class CollectionsProblemImpl implements CollectionsProblem {

	@SuppressWarnings("unchecked")
	public void sort(Collection<Meme> memes, boolean ascending) {
		
		List< Meme > list = (List) memes ;
		if(ascending){
			System.out.println("before sort");
			Collections.sort(list, new CustomComparator() );
		}else{
			Collections.sort(list, new CustomComparatorDesc() );
		}	
	}
	

	/**
	 * Adds a tag to all meme's that contain another tag
	 * 
	 * @param memes
	 *            The collection of memes to mutate
	 * @param tag
	 *            The tag that is to be added
	 */
	public void addTag(Collection<Meme> memes, String tag) {
		
		for(Meme meme : memes){
			String[] tmp = meme.getTags();
			String[] fsetTags = new String[tmp.length+1];
			
			int i=0;
			for(; i< tmp.length; i++){
				fsetTags[i]=tmp[i];
			}
			fsetTags[i] =tag; 
			
			meme.setTags(fsetTags);
		}

	}

	private static class CustomComparator implements Comparator {

		public int compare(Object o1, Object o2){
			Meme d1 = (Meme) o1;
			Meme d2 = (Meme) o2;
			
			if(d1.getYear() == d2.getYear())  
				return 0;  
			else if(d1.getYear() > d2.getYear())  
				return 1;  
			else  
				return -1;  
				
		   }

	}
	
	private static class CustomComparatorDesc implements Comparator {

		public int compare(Object o1, Object o2){
			Meme d1 = (Meme) o1;
			Meme d2 = (Meme) o2;
			
			if(d1.getYear() == d2.getYear())  
				return 0;  
			else if(d1.getYear() < d2.getYear())  
				return 1;  
			else  
				return -1;  
				
		   }

	}


}

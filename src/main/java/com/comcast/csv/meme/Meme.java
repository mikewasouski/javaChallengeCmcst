package com.comcast.csv.meme;

import java.util.Arrays;

/**
 * Simple class used by various tests.
 */
public class Meme {

    private String name;
    private int year;
    private String[] tags;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the tags
     */
    public String[] getTags() {
        return tags;
    }

    /**
     * @param tags the tags to set
     */
    public void setTags(String[] tags) {
        this.tags = tags;
    }
    
    @Override
    public int hashCode() {
        int result = 0;
        result = (int) (year / 7) + tags.length+ name.length();
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
    	boolean result = false;
    	
    	if(obj instanceof Meme){
    		Meme memeAux = (Meme) obj;
    		
    		
    		if(this.name.equals(memeAux.getName()) && this.year == memeAux.getYear() && this.tags.length == tags.length){
    			for(String tag : memeAux.getTags()){
    				if(!Arrays.asList(this.tags).contains(tag)){
    					return false;
    				}
    			}
    			result = true;
    		}
    	}

    	return result;
    }

}

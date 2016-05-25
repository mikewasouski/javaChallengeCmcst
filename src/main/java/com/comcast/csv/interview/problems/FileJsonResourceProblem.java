package com.comcast.csv.interview.problems;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.comcast.csv.meme.Meme;
import com.comcast.csv.meme.YoureDoingItWrongException;

/**
 * Read a list of {@link Meme}s from a JSON source file that might be on the classpath or file system.
 */
public class FileJsonResourceProblem {


    /**
     * Read a list of memes from a JSON file stored on the filesystem
     * 
     * @param file the file to read
     * @return the list of memes read
     */
    public List<Meme> readFromFile(File file) throws YoureDoingItWrongException {
    	FileJsonResourceProblem problem = new FileJsonResourceProblem();
    	return problem.readJson(file.getPath());
    	
    }

    /**
     * Read a list of memes from a JSON file stored on the classpath
     * 
     * @param path the path to the resource   algo.json
     * @return the list of memes read
     */
    public List<Meme> readFromClasspath(String path) throws YoureDoingItWrongException {
    	FileJsonResourceProblem problem = new FileJsonResourceProblem();
    	return problem.readJson(path);
    }
    
    public List<Meme> readJson(String path){
    	List<Meme> memeList = new ArrayList<Meme>();
    	JSONParser parser = new JSONParser();
   	 
        try {
 
        	JSONArray a = (JSONArray) parser.parse(new FileReader(path));        	  
        	for (Object o : a){				
        		Meme meme = new Meme();
				JSONObject memeJson = (JSONObject) o;
				
				String name = (String) memeJson.get("name");
				meme.setName(name);
				
				Long year = (Long) memeJson.get("year");
				meme.setYear(year.intValue());
				
				JSONArray tags = (JSONArray) memeJson.get("tags");
				int length = tags.size();
				
				String[] tagList = new String[length];
				for(int i=0; i<length; i++){
					tagList[i] = tags.get(i).toString();
				}
				meme.setTags(tagList);
				memeList.add(meme);
        	}
        } catch (Exception e) {
            new YoureDoingItWrongException("Fail while reading the file");
        }
    	
    	return memeList;
    }

}

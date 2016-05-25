package com.comcast.csv.interview.problems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The following methods operate on street addresses in a particular format. The format contains the following components:
 * 
 *  1. Number of miles from the center of the city
 *  2. Primary direction from the city as a single lower-case letter
 *  3. Street number
 *  4. Street name (always a single word)
 *  5. An abbreviation for either a Street or Avenue with a period
 * 
 * </h2>Example Valid Addresses</h2>
 * 25w873 Apple St.
 * 3n17 Special Ave.
 * 0e34800 Main St.
 */
public class StringParsingProblem {

    /**
     * Returns true if the address is valid, otherwise false.
     * 
     * @param address the address to validate
     * @return true if the address is valid
     */
    public boolean isAddressValid(String address) {
    	Pattern checkRegex = Pattern.compile("[0-9]+[wnes]+[0-9]+\\s[a-zA-Z]+\\s\\b(St|Ave)+\\.+");
    	Matcher regexMatcher = checkRegex.matcher(address);
    	
    	if(regexMatcher.matches())
    		return true;
    	else
    		return false;
    }
    
    /**
     * Get the distance in miles from the center of the city from the given address.
     * 
     * @param address the address
     * @return the distance
     */
    public int getDistanceFromCityCenter(String address) {
    	Pattern checkRegex = Pattern.compile("[0-9]+");
    	Matcher regexMatcher = checkRegex.matcher(address);
    	int distance = 0;
    	if(regexMatcher.find()){
    		System.out.println(" Found1: " + regexMatcher.group(0));
    		distance = Integer.valueOf( regexMatcher.group(0));
    	}


        return distance;
    }
    
    
}

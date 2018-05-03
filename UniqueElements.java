package com.life;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueElements {
	
	public static Integer sumOfIndividualDigits(String number)
	{
		Integer finalSum=0;
		
		Map<String,Integer> sticksData=new HashMap<>();
		sticksData.put("zero", 6);
		sticksData.put("one", 2);
		sticksData.put("two", 5);
		sticksData.put("three", 5);
		sticksData.put("four", 4);
		sticksData.put("five", 5);
		sticksData.put("six", 6);
		sticksData.put("seven", 3);
		sticksData.put("eight", 7);
		sticksData.put("nine", 6);
		
		for(int i=0;i<=number.length()-1;i++)
		{
			char c=number.charAt(i);
			if(c=='0')
			{
				finalSum=finalSum+sticksData.get("zero");
				continue;
			}
			else if (c=='1') {
				finalSum=finalSum+sticksData.get("one");
				continue;
			}
			else if (c=='2') {
				finalSum=finalSum+sticksData.get("two");
				continue;
			}
			else if (c=='3') {
				finalSum=finalSum+sticksData.get("three");
				continue;
			}else if (c=='4') {
				finalSum=finalSum+sticksData.get("four");
				continue;
			}else if (c=='5') {
				finalSum=finalSum+sticksData.get("five");
				continue;
			}else if (c=='6') {
				finalSum=finalSum+sticksData.get("six");
				continue;
			}else if (c=='7') {
				finalSum=finalSum+sticksData.get("seven");
				continue;
			}
			else if (c=='8') {
				finalSum=finalSum+sticksData.get("eight");
				continue;
			}
			else if (c=='9') {
				finalSum=finalSum+sticksData.get("nine");
				continue;
			}
		}
		
		return finalSum;
	}
	
	public static Map<List<String>,Integer> getUniqueFriends(String friends,String required)
	{
		String[] friendsList=friends.split(";");  
		
		Map<List<String>,Integer> unique=new HashMap<>();
		
		Map<List<String>,Integer> duplicate=new HashMap<>();
		
		for(String human:friendsList)
		{
			List<String> individual=new ArrayList<>();
			
			String[] humans=human.split(":");
			
			for(String member:humans)
			{
				individual.add(member);
			}
			
			Collections.sort(individual);
			
			if(unique.containsKey(individual))
			{
				duplicate.put(individual,unique.get(individual)+1);
			}
			else {
				unique.put(individual, 1);
			}
		}
		return "unique".equalsIgnoreCase(required)?unique:duplicate;
	}	
	
	public static void main(String[] args) {
		
		String friends="u1:u2;u2:u1;u1:u3;u3:u2;u2:u4;u1:u2;u3:u1";
		/*below we are passing two input params, 
		one is string which has to be sort and second param indicates what type of data we need from string i.e duplicate or unique*/
		System.out.println(getUniqueFriends(friends,"unique"));
		
		//System.out.println(getUniqueFriends(friends,"duplicate"));
		
		System.out.println(sumOfIndividualDigits("123"));
	}

}

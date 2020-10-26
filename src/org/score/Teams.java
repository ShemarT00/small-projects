/**
 * 
 */
package org.score;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.lang.Comparable;

/**
 * @author Shemar
 *
 */
public class Teams{
	private int points;
	private String name = "";
	
	public Teams (String name, int points) {
		super();
		this.name = name;
		this.points = points;
	}
	
	public static class RankPoints implements Comparator<Teams> {

		@Override
		public int compare(Teams a, Teams b) {
			// TODO Auto-generated method stub
			return b.points - a.points;
		}
		
	}
public static void main(String[] args) {
	ArrayList<Teams> teams = new ArrayList<Teams>() {{
		add(new Teams("Arsenal", 70));
		add(new Teams("Chelsea", 83));
		add(new Teams("Everton", 57));
		add(new Teams("West Ham", 40));
		add(new Teams("Liverpool", 90));
		add(new Teams("Tottenham", 60));
		add(new Teams("Brighton",43));
		add(new Teams("Man Utd", 77));
		
	
	}};
	
		Collections.sort(teams, new RankPoints()); 
		teams.forEach(team -> {
			System.out.println("Team: " + team.name + " " + "Points: " + team.points);
		});
		
	}

public int getPoints() {
	return this.points;
}
	
	

	
	
}

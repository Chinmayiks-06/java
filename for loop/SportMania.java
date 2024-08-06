class SportMania{
	
		
	static String iplTeamNames[] = {"RCB","Chennai Super Kings","Delhi Capitals","Gujarat Titans","Kolkata Knight Riders","Lucknow Super Giants","Mumbai Indians","Punjab Kings",
		                         "Rajasthan Royals"};
	static String topTenBatsmen[] = {"Virat Kohli","Kane Williamson","Joe Root","Steve Smith","Babar Azam","Rohit Sharma","David Warner)","Quinton de Kock)","Marnus Labuschagne","Ben Stokes"};
    static String topTenBowlers[] = {"Pat Cummins (Australia)","Jasprit Bumrah (India)","Trent Boult (New Zealand)","Kagiso Rabada (South Africa)","Shaheen Afridi (Pakistan)",
                                 "Josh Hazlewood (Australia)","Rashid Khan (Afghanistan)","Ravichandran Ashwin (India)","Mitchell Starc (Australia)",
		                        "Mohammed Shami (India)"};
    static String topTenIccTeams[] = {"England","India","New Zealand","Australia","Pakistan","South Africa","West Indies","Bangladesh","Sri Lanka","Afghanistan"};
		
	public static void main(String sports[]){
			
	    System.out.println("The IPL Teams are: ");
        for(int index=0;index <= iplTeamNames.length-1;index++){
        System.out.println(iplTeamNames[index]);
		}
		
		System.out.println("The Top 10 Batsmen are: ");
        for(int index=0;index <= topTenBatsmen.length-1;index++){
        System.out.println(topTenBatsmen[index]);
		}
		
		System.out.println("The Top 10 Bowlers are: ");
        for(int index=0;index <= topTenBowlers.length-1;index++){
        System.out.println(topTenBowlers[index]);
		}
		
		
		System.out.println("The Top 10 ICC Teams are: ");
        for(int index=0;index <= topTenIccTeams.length-1;index++){
        System.out.println(topTenIccTeams[index]);
		}
		
	
	}
}
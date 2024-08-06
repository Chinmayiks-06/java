class Netflix{
	

	static	String topTenMovies[] ={"Hit Man","Four Brothers","Mission: Impossible - Dead Reckoning","Mysteries of the Terracotta Warriors","Home","Safe House","Ultraman:Rising","How to Rob a Bank","Atlas"};	
	static	String englishMovies[] ={"The Irishman","Marriage Story","Bird Box","Enola Holmes","The Trial of the Chicago","The Old Guard","Extraction",
		                         "The Devil All the Time","The Midnight Sky","Mank","Da Bloods,The Prom","Pieces of a Woman","Rebecca","Hillbilly Elegy","Malcolm & Marie",
		                         "To All the Boys I've Loved Before","I Care a Lot","The Kissing Booth","Eurovision Song Contest: The Story of Fire Saga",
		                        "The Two Popes","The Dig","Project Power","The Half of It","El Camino: A Breaking Bad Movie"};
    static  String hindiMovies[] = {"Ludo","The White Tiger","Raat Akeli Hai","Bulbbul","Gunjan Saxena: The Kargil Girl","Serious Men","Choked: Paisa Bolta Hai",
		                       "Class of '83","AK vs AK","Ginny Weds Sunny","Tribhanga - Tedhi Medhi Crazy","Mrs. Serial Killer","Maska","Guilty","Ghost Stories","Drive","Chopsticks",
		                       "Kaali Khuhi","Raat Baaki Hai","What Are the Odds?","Haseen Dillruba","Bombay Rose","Pagglait","AK vs AK","She"};
    static  String hindiSeries[] = {"Sacred Games","Delhi Crime","Jamtara - Sabka Number Ayega","Bard of Blood","She","Selection Day","Little Things","Betaal","Typewriter",
		                         "Masaba Masaba","Taj Mahal 1989","Bombay Begums","Mismatched","Bhaag Beanie Bhaag","Ray","Mai","Hasmukh","Hush Hush","Leila","A Suitable Boy","Feels Like Ishq", 
		                        "Yeh Kaali Kaali Ankhein","Dhamaka","Decoupled","Ray"};
    static  String koreanSeries[] = {"Crash Landing on You","Kingdom","It's Okay to Not Be Okay","Vincenzo","Start-Up","Sweet Home","My Name","Squid Game","Love Alarm",
		                        "Hospital Playlist","My First First Love","Move to Heaven","Navillera, Nevertheless","The Uncanny Counter","The Sound of Your Heart","Hellbound","D.P", 
	                             "All of Us Are Dead","Hometown Cha-Cha-Cha"};
		
	  public static void main(String movies[]){
		
	  	  System.out.println(" Top 10 Movies in Netflix are: ");
        for(int index=0;index <= topTenMovies.length-1;index++){
        System.out.println(topTenMovies[index]);
		}
		
		System.out.println("English Movies are: ");
        for(int index=0;index <= englishMovies.length-1;index++){
        System.out.println(englishMovies[index]);
		}
		
		System.out.println("Hindi Series: ");
        for(int index=0;index <= hindiSeries.length-1;index++){
        System.out.println(hindiSeries[index]);
		}
		
		System.out.println("Hindi Movies are: ");
        for(int index=0;index <= hindiMovies.length-1;index++){
        System.out.println(hindiMovies[index]);
		}
		
		System.out.println("Korean Series are: ");
        for(int index=0;index <= koreanSeries.length-1;index++){
        System.out.println(koreanSeries[index]);
		}
	 
	
	}
	
}
	
	
	
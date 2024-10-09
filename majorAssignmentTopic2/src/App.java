public class App {
    public static void main(String[] args) throws Exception {
        //creating the artists 
        Artist BrunoMars = new Artist("Bruno Mars", true); // Bruno Mars is a solo artist
        //artist1.printArtistDetails(); 
        
        Artist ImagineDragons = new Artist("Imagine Dragons", false); // Imagine Dragons is a band
        //artist2.printArtistDetails(); 
        
        //creating the songs
        Song CountOnMe = new Song("Count On Me", BrunoMars, "Doo-Wops & Hooligans", "Folk Music"); 
        //song1.printSongDetails();

        Song BadLiar = new Song("Bad Liar", ImagineDragons, "N/A", "Alternative/Indie");
        //song2.printSongDetails();

        //creating the artists 
        Artist MichaelJackson = new Artist("Michael Jackson", true); // Bruno Mars is a solo artist
        //artist1.printArtistDetails(); 
        
        Artist JeffersonAirplane = new Artist("Jefferson Airplane", false); // Imagine Dragons is a band
        //artist2.printArtistDetails(); 
        
        //creating the songs
        Song Bad = new Song("Bad", MichaelJackson, "Bad", "Pop/RnB"); 
        //song1.printSongDetails();

        Song WhiteRabbit = new Song("White Rabbit", JeffersonAirplane, "Suurealistic Pillow", "Rock");
        //song2.printSongDetails();

        //creating the artists 
        Artist KendrickLamar = new Artist("Kendrick Lamar", true); // Kendrick Lamar is a solo artist
        //artist1.printArtistDetails(); 
        
        Artist TameImpala = new Artist("Tame Impala", false); // Tame Impala is a band
        //artist2.printArtistDetails(); 
        
        //creating the songs
        Song MortalMan = new Song("Mortal Man", KendrickLamar, "To Pimp A Butterfly", "Hip Hop/Rap"); 
        //song1.printSongDetails();

        Song LetItHappen = new Song("Let It Happen", TameImpala, "Currents", "Psychedelic Rock");
        //song2.printSongDetails();

         //creating the artists 
         Artist SZA = new Artist("SZA", true); // SZA is a solo artist
         //artist1.printArtistDetails(); 
         
         Artist ACDC = new Artist("AC/DC", false); // AC/DC is a band
         //artist2.printArtistDetails(); 
         
         //creating the songs
         Song GoodDays = new Song("Good Days", SZA, "SOS", "Pop/RnB"); 
         //song1.printSongDetails();
 
         Song Thunderstruck = new Song("Thunderstruck", ACDC, "The Razors Edge", "Rock");
         //song2.printSongDetails();

        //creating the artists 
        Artist FrankOcean = new Artist("Frank Ocean", true); // Frank Ocean is a solo artist
        //artist1.printArtistDetails(); 
        
        Artist TheRollingStones = new Artist("The Rollig Stones", false); // The Rolling Stones is a band
        //artist2.printArtistDetails(); 
        
        //creating the songs
        Song Ivy = new Song("Ivy", FrankOcean, "Blonde", "RNB"); 
        //song1.printSongDetails();

        Song PaintItBlack = new Song("Paint It, Black", TheRollingStones, "Aftermath", "Rock");
        //song2.printSongDetails();

        //creating the artists 
        Artist Weeknd = new Artist("Weeknd", true); // Weeknd is a solo artist
        //artist1.printArtistDetails(); 
        
        Artist Aha = new Artist("A-ha", false); //  is a band
        //artist2.printArtistDetails(); 
        
        //creating the songs
        Song StarBoy = new Song("Star Boy", Weeknd, "Star Boy", "RNB/Rap"); 
        //song1.printSongDetails();

        Song TakeOnMe = new Song("Take On Me", Aha, "Hunting High and Low", "Pop Rock");
        //song2.printSongDetails();

        //library
        Library library = new Library(); // Create a Library instance
        library.addSong(CountOnMe); // Add songs to the library
        library.addSong(BadLiar);
        library.addSong(Bad);
        library.addSong(WhiteRabbit);
        library.addSong(MortalMan);
        library.addSong(LetItHappen);
        library.addSong(GoodDays);
        library.addSong(Thunderstruck);
        library.addSong(Ivy);
        library.addSong(PaintItBlack);
        library.addSong(StarBoy);
        library.addSong(TakeOnMe);
        library.displayAllSongs(); // Display all songs in the library
    }
}

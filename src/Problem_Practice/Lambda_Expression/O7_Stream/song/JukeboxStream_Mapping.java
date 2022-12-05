package Problem_Practice.Lambda_Expression.O7_Stream.song;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Song Class
class Song1{
    private final String title;
    private final String artist;
    private final String genre;
    private final int year;
    private final int timePlayed;

    public Song1(String title, String artist, String genre, int year, int timePlayed){
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
        this.timePlayed = timePlayed;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public int getTimePlayed() {
        return timePlayed;
    }

    @Override
    public String toString() {
        return "{Title : " + title + ", Artist : " + artist + ", Genre : " + genre + ", Year : " + year + ", Time Played : " + timePlayed +".}\n";
    }
}

//Class MockSongs
// List<String> = List.of() --> java 9
class MockSongs1{
    public static List<Song1> getSongs(){
        return Arrays.asList(
                new Song1("Alone", "Alan Walker", "Rock", 2014, 134),
                new Song1("Sorry", "Justin Bieber", "Rock", 2015, 287),
                new Song1("Love me like you do", "Ellie Goulding", "Soft Rock", 2017, 290),
                new Song1("Let me down slowly", "Alex Benzamin", "Melody", 2021, 346),
                new Song1("Hundred years", "Cristrina Perry", "Soft Rock", 2019, 218),
                new Song1("Baby", "Justin Bieber", "Rock", 2014, 456),
                new Song1("Hundred years", "Charlie Puth", "Melody", 2020, 186),
                new Song1("Faded", "Alan Walker", "Soft Rock", 2017, 379),
                new Song1("Hundred years", "Kia", "Melody", 2020, 186)
        );
    }
}

//Driver Class
public class JukeboxStream_Mapping {
    public static void main(String[] args) {
        new JukeboxStream_Mapping().go();
    }

    public void go(){
        //Creating a new List of all the genres
        List<String> genres = MockSongs1.getSongs().stream()
                .map(song-> song.getGenre()) //mapping genres into a new List
                .collect(Collectors.toList());
        System.out.println("All genres are:"+ genres);
        System.out.println();

        //Creating a new List of distinct genre
        List<String> genre = MockSongs1.getSongs().stream()
                .map(song-> song.getGenre()) //mapping genres into a new List
                .distinct() //takes only distinct genre
                .collect(Collectors.toList());
        System.out.println("Distinct genres are: "+genre);
        System.out.println();

        //Counting Songs with distinct title
        Long count = MockSongs1.getSongs().stream()
                .map(song-> song.getTitle())
                .distinct()
                .count();
        System.out.println("Number of distinct song titles are: "+count);
        System.out.println();

        //Creating a new List - artist of Hundred years, except Kia
        String title = "Hundred years";
        List<String> artistofHundredYears = MockSongs1.getSongs().stream()
                .filter(song-> song.getTitle().equals(title)) //Filtering songs by Hundred years title
                .map(song-> song.getArtist()) //Mapping then into a new List
                .filter(artist-> !artist.equals("Kia")) //Takes artist except Kia
                .collect(Collectors.toList());
        System.out.println("Artists of 'Hundred years' except Kia are: "+artistofHundredYears);
        System.out.println();
    }
}
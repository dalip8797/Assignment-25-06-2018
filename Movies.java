
package movies;
import java.util.*;


public class Movies  implements Comparable <object> {
     int year;
    int rating;
    String movie_name;
    Movies(int year ,int rating, String movie_name)
    {
        this.year=year;
        this.rating=rating;
        this.movie = movie_name;
        
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) { 
        this.year = year;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    /**
     *
     * @param t
     * @return
     */
    @Override
    public int compareTo(object t) {
        return this.year-t.year();
        
    }
    
    

    
    public static void main(String[] args, Movies obj) {
        ArrayList<Movies>list= new ArrayList <Movies> ();
        list.add(new Movies("Aventure",8,2018));
       
     
    
    }
    for(Movie movie:list)
    {
        System.out.println(movie.getrating()+""+movie.getname()+""+movie.getyear());
    }
        
    


   
        
    }
    
 

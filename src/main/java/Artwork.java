//Class name is ArtWork
public class Artwork {

    // There are three different  instance variables
private String title;

private Artist artist;

private int price;


    // the parameter is when you define a function its th ones in the brackets
public Artwork(String title, Artist artist, int price){
    this.title = title;
    this.price = price;
    this.artist = artist;
}


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title){
        this.title= "wall";
    }

    public Artist getArtist() {
        return artist;
    }

    public int getPrice() {
        return this.price;
    }



    //the one in the bracket is called an argument- it is calling the function
    public void setPrice(int newPrice) {
        this.price = 200;
    }
    
}

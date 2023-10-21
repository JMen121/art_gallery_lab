import java.util.ArrayList;

public class Customer {


    private String name;
    private int wallet;
    private ArrayList<Artwork> artCollection;

    public Customer(String name, int wallet){
        this.name = name;
        this.wallet = wallet;
        this.artCollection = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }


    public int getWallet(){
        return this.wallet;
    }

    public void setWallet(int newWalletAmount) {
        this.wallet = newWalletAmount;
    }

    public void payItem(int itemPrice){
        this.wallet -= itemPrice;
    }

    public int getArtCollectionCount(){
        return this.artCollection.size();
    }
    public ArrayList<Artwork> getArtCollection() {
        return artCollection;
    }

    public void addArtCollection(Artwork newArtwork){
        this.artCollection.add(newArtwork);
    }

    //boolean if customer has more amount than the art work price then return
    public boolean hasEnoughMoney(Artwork artwork) {
        if (artwork.getPrice() > this.wallet){
            System.out.println("Sorry, you do not have sufficient funds!");
            return false;
        } else {
            System.out.println("You have sufficient funds, you'll be able to buy this artwork");
            return true;
        }
    }

   public void setArtCollection(ArrayList<Artwork> artCollection) {
        this.artCollection = artCollection;
    }


//   My process behind the code
//   customer buys artwork for specific price if they have enough money
//   check that wallet > artwork price
//   if yes wallet - artwork price and till + artwork price

  }


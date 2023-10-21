
public class Artist {

    //Every variable should be private
    //private string is called an instance variable
    //Class acts like the  blueprint idea (the concept)
    private String name;

    //the
    public Artist(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    /*this.name is what the attribute is
        and the name is the value of attribute*/
    }
}

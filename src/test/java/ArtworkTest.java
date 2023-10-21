import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {
//Putting line 8 and 9 is intilsiing it for the whole file
    Artwork wall;
    Artist john;

    //If you need to create multiple artist work, it would be better to give generic names
    /*Everything written there has zero implication on the other files
     as the curly brackets mean that it is only encapsulated in this file*/

    //Line 16 & 19 is extansication
    @BeforeEach
    public void setUp(){
        john = new Artist("john");
        wall = new Artwork("wall",john, 100);
    }

    @Test
    public void canGetTitle(){
        assertThat(wall.getTitle()).isEqualTo("wall");
    }

    @Test
    public void canSetTitle(){
        wall.setTitle("portrait");
        assertThat(wall.getTitle()).isEqualTo("portrait");
    }

    @Test
    public void canGetArtist(){
        assertThat(wall.getArtist()).isEqualTo(john);
    }

    @Test
    public void canGetPrice(){
        assertThat(wall.getPrice()).isEqualTo(100);
    }

    @Test
    public void canSetPrice(){
    wall.setPrice(130);
    assertThat(wall.getPrice()).isEqualTo(130);
    }
}



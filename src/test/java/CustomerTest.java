import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer greg;
    Artwork wall;
    Artist daScary;

    @BeforeEach
    public void setup() {
        greg = new Customer("greg", 20);
        wall = new Artwork("Sunflower",daScary, 2000);
        daScary = new Artist("daScary");

    }

    @Test
    public void canGetName(){
        assertThat(greg.getName()).isEqualTo("greg");
    }

    @Test
    public void canGetWallet(){
    assertThat(greg.getWallet()).isEqualTo(500);
    }

    @Test
    public void canSetWallet(){
        greg.setWallet(20);
        assertThat(greg.getWallet()).isEqualTo(20);
    }

    @Test
    public void canPayItem(){
        greg.payItem(50);
        assertThat(greg.getWallet()).isEqualTo(450);
    }

    @Test
    public void canGetArtCollection(){
        assertThat(greg.getArtCollection().size()).isEqualTo(greg.getArtCollectionCount());
    }

    @Test
    public void canGetArtCollectionCount(){
        assertThat(greg.getArtCollectionCount()).isEqualTo(0);
    }

    @Test
    public void canAddArtCollection(){
        Artist steve = new Artist("steve");
        Artwork sunrise = new Artwork("sunrise",steve,200);
        greg.addArtCollection(sunrise);
        assertThat(greg.getArtCollectionCount()).isEqualTo(1);
    }


    @Test
    public void doesNotEnoughMoney(){
        greg.setWallet(20);
        assertThat(greg.hasEnoughMoney(wall)).isFalse();
    }


   @Test
    public void hasEnoughMoney(){
       greg.setWallet(50000);
        assertThat(greg.hasEnoughMoney(wall)).isTrue();
   }


}

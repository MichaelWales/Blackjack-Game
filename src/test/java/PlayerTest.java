import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card;

    @Before
    public void before(){
        player = new Player("Michael");
        card = new Card(SuitType.DIAMONDS, CardRank.JACK);
    }

    @Test
    public void playerHasName(){
        assertEquals("Michael", player.getName());
    }

    @Test
    public void playerStartsEmptyHanded(){
        assertEquals(0, player.cardCount());
    }

    @Test
    public void playerCanTakeCard(){
        player.takeCard(card);
        assertEquals(1, player.cardCount());
    }

    @Test
    public void playerHasHandTotal(){
        player.takeCard(card);
        assertEquals(10, player.handTotal());
    }

    @Test
    public void playerCanShowCard(){
        player.takeCard(card);
        assertEquals("JACK of DIAMONDS", player.showCard(0));
    }

}


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before() {
        card = new Card(SuitType.DIAMONDS, CardRank.JACK);
    }

    @Test
    public void cardHasSuitType() {
        assertEquals(SuitType.DIAMONDS, card.getSuitType());
    }

    @Test
    public void cardHasRank() {
        assertEquals(CardRank.JACK, card.getCardRank());
    }

    @Test
    public void cardHasValue() {
        assertEquals(10, card.getValue());
    }

    @Test
    public void cardShowsName(){
        assertEquals("JACK of DIAMONDS", card.cardName());
    }

}

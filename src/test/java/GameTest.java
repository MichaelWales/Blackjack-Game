import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GameTest {

    Player player1;
    Player player2;
    Deck deck;
    Game game;
    Card highCard;
    Card lowCard;

    @Before
    public void setup(){
        player1 = new Player("Michael");
        player2 = new Player("Kim");
        deck = new Deck();
        game = new Game(deck);
        game.newPlayer(player1);
        game.newPlayer(player2);

        highCard = new Card(SuitType.DIAMONDS, CardRank.JACK);
        lowCard = new Card(SuitType.CLUBS, CardRank.SIX);
    }


    @Test
    public void gameHasPlayers(){
        assertEquals(2, game.numberOfPlayers());
    }

    @Test
    public void gameCanStart(){
        game.start(1);
        assertEquals(1, player1.cardCount());
        assertEquals(1, player2.cardCount());
    }

    @Test
    public void gameCanDealMultipleCards(){
        game.start(20);
        assertEquals(20, player1.cardCount());
        assertEquals(20, player2.cardCount());
    }

    @Test
    public void gameCanCheckDraw(){
        player1.takeCard(highCard);
        player2.takeCard(highCard);
        assertTrue(game.checkDraw());
    }

    @Test
    public void gameCanCheckWinner(){
        player1.takeCard(highCard);
        player2.takeCard(lowCard);
        assertEquals(player1, game.checkWinner());
    }

}

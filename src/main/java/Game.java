import java.util.ArrayList;

public class Game {

    ArrayList<Player> players;
    Deck deck;

    public Game(Deck deck) {
        this.players = new ArrayList<Player>();
        this.deck = deck;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public int numberOfPlayers() {
        return this.players.size();
    }

    public void newPlayer(Player player) {
        this.players.add(player);
    }

    public void start(int amountOfCards){
        for(Player player:this.players){
            for (int i = 0; i < amountOfCards; i ++){
                Card card = deck.deal();
                player.takeCard(card);
            }
        }
    }

    public boolean checkDraw(){
        boolean drawgame = true;
        int handTotal = this.players.get(0).handTotal();
        for(Player player: this.players){
            if(player.handTotal() != handTotal){
                drawgame = false;
            }
        }
        return drawgame;
    }

    public Player checkWinner(){
        int highest = 0;
        Player winner = null;
        for(Player player:this.players){
            if(player.handTotal() > highest){
                highest = player.handTotal();
                winner = player;
            }
        }
        return winner;
    }

}

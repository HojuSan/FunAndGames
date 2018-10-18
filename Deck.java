import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

public class Deck
{
    private final List<Card> deck;
    private int cardsNum;
    //constructor
    public Deck()
    {

        deck = new LinkedList<Card>();

        cardsNum = 24;

        for(int i = 1; i<=24; i++)
        {
            Card diamond = new Card(i,"Diamond");
            Card clover = new Card(i,"Clover");
            Card heart = new Card(i,"Heart");
            Card spade = new Card(i,"Spade");

            deck.add(diamond);
            deck.add(clover);
            deck.add(heart);
            deck.add(spade);
        }
        
        for(int j = 0; j<52; j++)
        {
            System.out.println(deck.get(j).getValue() + " of "+ deck.get(j).getShape());
        }

    }

}
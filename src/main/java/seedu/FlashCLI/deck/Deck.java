package FlashCLI.deck;
import java.util.ArrayList;
import FlashCLI.deck.Card;

public class Deck {
    private String deckName;
    private int size = 0;
    private ArrayList<Card> cardList = new ArrayList();

    public Deck(String deckName){
        this.deckName = deckName;
    }

    public String getDeckName(){
        return deckName;
    }

    public int getSize(){
        return size;
    }
    
    // takes in the card question and answer, creates a new Card object 
    // and adds it to the cardList
    public void addCard(String question, String answer){
        Card newcard = new Card(question, answer);
        cardList.add(newcard);
        size++; 
        System.out.println("Card added!");
    }

    //prints out the index and question of every question in the deck
    public void listCards(){
        final String LISTLINE = "%d. %s";
        int count = 1;
        for (Card card: cardList){
            System.out.println(String.format(LISTLINE,count,card.getQuestion()));
            count++;
        }
    }
    
    //deletes the card at the index specified by the user
    public void deleteCard(int cardIndex){
        cardList.remove(cardIndex);
        size--;
        System.out.println("Card deleted!");
    }

    //returns the Card object at the specified index of the cardList
    public Card getCard(int cardIndex){
        Card card = cardList.get(cardIndex);
        return card;
    }
}

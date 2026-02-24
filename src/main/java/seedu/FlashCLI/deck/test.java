// temporary file to test the Deck and Card classes and methods
import FlashCLI.deck.Deck;
import FlashCLI.deck.Card;

public class test {
    public static void main(String[] args) {
        Deck testdeck = new Deck("test deck");
        testdeck.addCard("question 1", "answer 1");
        testdeck.addCard("question 2", "answer 2");
        testdeck.addCard("question 3", "answer 3");
        testdeck.listCards();
        // delete question 1
        testdeck.deleteCard(0);
        testdeck.listCards();
        //should return "question 2"
        Card card = testdeck.getCard(0);
        System.out.println(card.getQuestion());
        System.out.println(card.getAnswer());
    }
}

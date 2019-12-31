package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

    class Card{
        String suit;
        String number;

        public Card (String suit, String number){
            this.suit = suit;
            this.number = number;
        }

        public String toString (){
            return "(" + suit + " " + number + ")";
        }
    }

    class Deck {
        String suit[] = {"CLUB", "DIAMOND", "HEART", "SPADE"};
        String number[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        ArrayList<Card> deck = new ArrayList<>();

        public Deck() {
            for (int i = 0; i < suit.length; i++) {
                for (int j = 0; j < number.length; j++) {
                    deck.add(new Card(suit[i], number[j]));
                }
            }
        }

        public void shuffle() {
            Collections.shuffle(deck);
            //List나 배열의 내용을 랜덤 형태로 보여주고 할 때 사용
        }

        public Card deal() {
            //반환 타입이 card?
            return deck.remove(0);
        }
    }

    class Player {
        ArrayList<Card> list = new ArrayList<>();

        public void getCard(Card card) {
            list.add(card);
        }

        public void showCards() {
            System.out.println(list);
        }
    }

    public class CardGame {
        public static void main(String[] args) {
            Deck deck = new Deck();
            deck.shuffle();
            Player p1 = new Player();
            Player p2 = new Player();
            p1.getCard(deck.deal());
            p2.getCard(deck.deal());
            p1.showCards();
            p2.showCards();
        }
    }


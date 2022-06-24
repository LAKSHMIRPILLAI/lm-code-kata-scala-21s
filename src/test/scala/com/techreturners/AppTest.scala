package com.techreturners

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class AppTest extends AnyFlatSpec with Matchers{
      val cardGame=new CardGame()
      val sam=new Player("Sam",0)
      val dealer=new Player("Dealer",0)
      val result=cardGame.play21s(sam,dealer)
      Console.println(result)

      "At the start scores of the player" should "be equal to zero" in {
            val cardGame=new CardGame()
            val sam=new Player("Sam",0)
            val dealer=new Player("Dealer",0)
            assert(sam.playerScore==0)
            assert(dealer.playerScore==0)
      }
      "Initial scores of the player" should "not be equal to zero" in {
            assert(cardGame.playCardGame(sam)!=0)
            assert(cardGame.playCardGame(dealer)!=0)
            assert(sam.playerScore!=0)
            assert(dealer.playerScore!=0)
      }

      "If cards drawn are Jack or Queen or King" should "give a score of 10 " in{
            cardGame.getScore(CardsInTheDeck("Jack",1)) should be (10)
            cardGame.getScore(CardsInTheDeck("Queen",1)) should be (10)
            cardGame.getScore(CardsInTheDeck("King",1)) should be (10)
      }
      "If cards drawn are Ace" should "give a score of 11 " in{
             cardGame.getScore(CardsInTheDeck("Ace",1)) should be (11)
      }
      "If cards drawn are Diamond,Spade,Club,Heart" should "give a score of given value " in{
            cardGame.getScore(CardsInTheDeck("Diamond",1)) should be (1)
            cardGame.getScore(CardsInTheDeck("Heart",3)) should be (3)
            cardGame.getScore(CardsInTheDeck("Club",7)) should be (7)
            cardGame.getScore(CardsInTheDeck("Spade",1)) should not be 3
      }


}

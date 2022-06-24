package com.techreturners
import scala.util.Random


class CardGame {
  val deckCount: Int = 52
  var randomCard = new Random()

  def play21s(player1:Player,player2:Player):String= {
    var score1: Int = player1.playerScore
    var score2: Int = player2.playerScore
    score1 = playCardGame(player1: Player)
    score2 = playCardGame(player2: Player)
    Console.println(player1.playerScore ,player2.playerScore)
    val winner: String = evaluateScore(player1,player2)
    s"The winner is $winner"
  }

  def evaluateScore(player1:Player,player2:Player):String={
    var result: String = ""
    if (player1.playerScore == 21 || player2.playerScore == 21) {
      Console.println("Enter1")
      if (player1.playerScore  == 21) result = player1.player
      else result = player2.player
    }
    else  if (player1.playerScore > 21 || player2.playerScore > 21) {
      Console.println("Enter2")
      if (player1.playerScore  > 21) result = player2.player
      else result = player1.player
    }
    else {
      Console.println("Enter3")
      if (player1.playerScore <17 && player2.playerScore<21) {
        while (player1.playerScore < 17 && player2.playerScore < 21) {
          Console.println("Enter 4")
          val draw: CardsInTheDeck = drawCard()
          val score: Int = getScore(draw)
          player1.scoreOfPlayer(score)
          Console.println(player1.playerScore)
          if (player1.playerScore >=17 && player1.playerScore<21) {
            Console.println("Enter 5")
            while (player2.playerScore < 21) {
              val draw: CardsInTheDeck = drawCard()
              val score: Int = getScore(draw)
              player2.scoreOfPlayer(score)
              Console.println(player2.playerScore)
              if (player2.playerScore > player1.playerScore && player2.playerScore <= 21) {
                result = player2.player
              }
              if (player2.playerScore > 21) {
                result = player1.player
              }
            }
           }
          else if (player1.playerScore >=21 && player2.playerScore<21){
            result=player2.player
          }

        }
      }
      else if(player1.playerScore >=17 && player2.playerScore<21){
        Console.println("Enter 6")
        while (player2.playerScore <21) {
          val draw: CardsInTheDeck = drawCard()
          val score:Int = getScore(draw)
          player2.scoreOfPlayer(score)
          Console.println(player2.playerScore)
          if (player2.playerScore >player1.playerScore &&player2.playerScore <=21){
            result=player2.player
          }
          if (player2.playerScore >21)
            result=player1.player
        }
      }
    }
    result
  }


  def playCardGame(player:Player):Int= {
    val cardDrawn1: CardsInTheDeck = drawCard()
    //Console.println(s"First Draw $cardDrawn1")
    val cardDrawn2: CardsInTheDeck = drawCard()
    //Console.println(s"Second Draw $cardDrawn2")
    val handScore:Int=getScore(cardDrawn1)+getScore(cardDrawn2)
    //Console.println(s"Total $handScore")
    player.scoreOfPlayer(handScore)
    handScore
  }

  def drawCard():CardsInTheDeck={
    val cardType:List[String]=List("Ace","King","Queen","Jack","Diamond","Spade","Heart","Club")
    val cardDrawn=CardsInTheDeck(cardType(randomCard.nextInt(cardType.length)),1+randomCard.nextInt(9))
    cardDrawn
  }


 def getScore(cardDrawn:CardsInTheDeck):Int={
   val cardStatus:CardsInTheDeck=cardDrawn
   val cardType=cardStatus.card
   val score= cardType match{
     case "Ace"=>11
     case "King"=>10
     case "Queen"=>10
     case "Jack"=>10
    // case "Ace"=>10
     case _=> cardStatus.value
   }
  score
 }

}
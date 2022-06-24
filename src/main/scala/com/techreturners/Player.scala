package com.techreturners


class Player(name:String,score:Int) {
 val player:String=name
 var playerScore:Int=score
 def scoreOfPlayer(score:Int):Int={
  playerScore+=score
  playerScore
 }

}

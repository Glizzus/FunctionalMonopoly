object Dice {

  def roll: Int = {
    val random = scala.util.Random
    // We generate two d6 as opposed to one d12 in order to better simulate real games
    val dice1 = random.nextInt(6) + 1
    val dice2 = random.nextInt(6) + 1
    dice1 + dice2
  }
}

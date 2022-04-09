import scala.annotation.tailrec

object Client extends App {

  val player1 = new HumanPlayer()
  val player2 = Player

  GameHandler.greet()
  GameHandler.prompt()
  GameHandler.handleInput(player1)

  print(RailroadProperties.reading.toString)

  @tailrec
  def gameLoop(player1: HumanPlayer, player2: Player): Unit = {
    GameHandler.prompt()
    GameHandler.handleInput(player1)
    gameLoop(player1, player2)
  }

}
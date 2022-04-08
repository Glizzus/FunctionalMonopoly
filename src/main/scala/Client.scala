import scala.annotation.tailrec

object Client extends App {

  GameHandler.greet()
  GameHandler.prompt()
  GameHandler.handleInput()


  @tailrec
  def gameLoop(player1: HumanPlayer, player2: RobotPlayer): Unit = {
    GameHandler.prompt()
    GameHandler.handleInput()
    gameLoop(player1, player2)
  }

}
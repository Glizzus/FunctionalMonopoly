import scala.annotation.tailrec
import scala.io.StdIn.readLine

object GameHandler {

  def greet(): Unit = {
    println("Welcome to Functional Monopoly")
  }

  def prompt(): Unit =  {
    println("[R]oll, [V]iew properties, [P]osition, [T]rade, [Quit]")
  }

  def handleInput(): Unit = {
    val input = getInput
    val matched = inputMatcher(input)
  }

  /**
   * This method gets and validates use input
   * @return the user input if valid
   */
  @tailrec
  private def getInput: String = {
    val input = readLine.toUpperCase.trim
    input match {
      case "R" | "V" | "P" | "T" => input
      case "QUIT" =>
        println("Goodbye")
        sys.exit(0)
      case _ =>
        println("Error: Invalid input")
        prompt()
        getInput
    }
  }

  // IMPURE METHOD
  /**
   * This tells the users what they rolled, as well as special messages for special rolls
   * @param roll an int of what the user rolled, and a boolean for whether they got doubles or not
   */
  private def rollMessages(roll: (Int, Boolean)): Unit = {
    val num = roll._1
    val doubles = roll._2
    num match {
      case 2 | 3 | 4 | 5 | 6 | 7 | 9 | 10 | 12 =>
        println(f"You rolled a $num.")
      case 8 | 11 =>
        println(f"You rolled an $num.") // This ensures that their is a grammatically correct "an" before 8 or 11
      case _ =>
        throw new IllegalArgumentException
    }
    if (doubles) {
      println("You rolled doubles!")
      // In craps, two ones are called "snake eyes"
      if (num == 2) println("Snake eyes!")
    }
  }


  // IMPURE METHOD
  /**
   * Matches inputs to determine what to do with them
   * @param input the
   * @return this returns a dice roll for case "R", nothing for cases "V", "P" and a TradeManager for "T".
   */
  private def inputMatcher(input: String): Either[Option[(Int, Boolean)], TradeManager] = {
    input match {                                           // TODO: Make this return type less stupid
      case "R" =>
        val roll = rollDice
        rollMessages(roll._1, roll._2)
        Left(Some(roll)) // is this really less confusing than OOP?
      case "V" => throw new UnsupportedOperationException
      case "P" => throw new UnsupportedOperationException
      case "T" => Right(TradeManager())
    }
  }


  /**
   * This calculates the new position on the board.
   * @return The position mapped to a legitimate position of a location.
   */
  val newPosition: Int => Int = (pos) => pos % 40


  // IMPURE METHOD
  /**
   * Rolls two six-sided dice
   * @return a tuple containing the roll, and whether the roll was doubles or not
   */
  def rollDice: (Int, Boolean) = {
    val random = scala.util.Random
    // We generate two d6 as opposed to one d12 in order to better simulate real games
    val dice1 = random.nextInt(6) + 1
    val dice2 = random.nextInt(6) + 1
    (dice1 + dice2, dice1 == dice2)
  }
}





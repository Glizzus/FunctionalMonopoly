import scala.annotation.tailrec
import scala.collection.immutable.Queue

object Client extends App {

  @tailrec
  def deckCheck(deck: Queue[Any]): Unit = {
    if (deck.isEmpty)  println("Done")
    else {
      println(deck.head)
      println("")
      deckCheck(deck.dequeue._2) // Tuple indexing starts at 1? What the hell?
    }
  }

  deckCheck(Deck.generateChanceDeck())
  println("")
  deckCheck(Deck.generateCommDeck())

}

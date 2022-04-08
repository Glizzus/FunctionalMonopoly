import org.scalatest.funsuite.AnyFunSuite

import scala.annotation.tailrec
import scala.collection.immutable.Queue

class DeckTest extends AnyFunSuite {

  test("CommunityChest Queue should always have a size of 16") {
    assert(Deck.generateCommDeck().size === 16)
    assert(Deck.generateCommDeck().size === 16)
    assert(Deck.generateCommDeck().size === 16)
    assert(Deck.generateCommDeck().size === 16)
  }

  test("Chance Queue should always have a size of 16") {
    assert(Deck.generateChanceDeck().size === 16)
    assert(Deck.generateChanceDeck().size === 16)
    assert(Deck.generateChanceDeck().size === 16)
    assert(Deck.generateChanceDeck().size === 16)
  }

  // This test has a (1 / 16!) chance of a false negative
  test("CommunityChest Queue should be randomized") {
    val deck1 = Deck.generateCommDeck()
    val deck2 = Deck.generateCommDeck()
    assert(!deck1.equals(deck2))
  }

  // This test has a (1 / 16!) chance of a false negative
  test("Chance Queue should be randomized") {
    val deck1 = Deck.generateCommDeck()
    val deck2 = Deck.generateCommDeck()
    assert(!deck1.equals(deck2))
  }


  @tailrec
  final def deckCheck(deck: Queue[Any]): Unit = {
    if (deck.isEmpty)  println("Done")
    else {
      println(deck.head)
      println("")
      deckCheck(deck.dequeue._2) // Tuple indexing starts at 1? What the hell?
    }
  }

  deckCheck(Deck.generateCommDeck())
  deckCheck(Deck.generateChanceDeck())

}

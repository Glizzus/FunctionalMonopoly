import org.scalatest.funsuite.AnyFunSuite

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


}

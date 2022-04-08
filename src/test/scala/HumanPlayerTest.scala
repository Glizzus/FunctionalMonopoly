import org.scalatest.funsuite.AnyFunSuite

class HumanPlayerTest extends AnyFunSuite {

  test("Newly instantiated HumanPlayer should have correct default values") {
    val human = new HumanPlayer()
    val emptyGroup = new PropertiesGroup()
    assert(human.money === 1500)
    assert(human.position === 0)
    assert(human.properties === emptyGroup)
  }

  test("giveMoney() should correctly change a HumanPlayer's money") {
    val human = new HumanPlayer()
    val richHuman = human.giveMoney(1000)
    assert(richHuman.money === 2500)
    val poorHuman = human.giveMoney(-1500)
    assert(poorHuman.money === 0)

  }

  test("isBankrupt() should correctly reflect whether a HumanPlayer has negative money") {
    val MCHammer = new HumanPlayer(-15)
    assert(MCHammer.isBankrupt)
    val almost = new HumanPlayer(0)
    assert(!almost.isBankrupt)
  }


}

import scala.collection.immutable.Queue

object Deck {

  val communityChestDeck: Queue[CommunityChest] = generateCommDeck()
  val chanceDeck: Queue[Chance] = generateChanceDeck()

  protected case class Chance(id: Int, description: String) {
    override def toString: String = description
  }

  // ALL CHANCE CARDS IN THE US VERSION OF MONOPOLY
  // -------------------------------------------------------------------------------------------------------------------
  val advBoard: Chance = Chance(0, "Advance to Boardwalk.")
  val advGoChance: Chance = Chance(1, "Advance to Go (Collect $200).")
  val advIll: Chance = Chance(2, "Advance to Illinois Avenue.\nIf you pass Go, collect $200.")
  val advSt: Chance = Chance(3, "Advance to St. Charles Place.\nIf you pass Go, collect $200.")

  // This Chance appears twice in the deck, so we just copy it and assign the copy a different ID
  val advNearRR1: Chance = Chance(4,
    "Advance to the nearest Railroad.\nIf unowned, you may buy it from the Bank."
      + "\nIf owned, pay owner twice the rental to which they are otherwise entitled.")
  val advNearRR2: Chance = advNearRR1.copy(id = 5)

  val advNearUtil: Chance = Chance(6,
    "Advance token to nearest Utility.\nIf unowned, you may buy it from the Bank."
      + "\nIf owned, throw dice and pay owner a total ten times amount thrown.")

  val bankDiv: Chance = Chance(7, "Bank pays you dividend of $50.")
  val getOutJailChance: Chance = Chance(8, "Get out of Jail Free.")
  val goBackThree: Chance = Chance(9, "Go Back 3 Spaces.")
  val goToJailChance: Chance = Chance(10, "Go to Jail.\nGo directly to Jail, do not pass Go, do not collect $200.")

  val makeGenRepairs: Chance = Chance(11,
    "Make general repairs on all your property.\nFor each house pay $25.\nFor each hotel pay $100.")

  val speedFine: Chance = Chance(12, "Speeding fine $15.")
  val tripToReading: Chance = Chance(13, "Take a trip to Reading Railroad.\nIf you pass Go, collect $200.")
  val chairMan: Chance = Chance(14, "You have been elected Chairman of the Board.\nPay each player $50.")
  val loanMatures: Chance = Chance(15, "Your building loan matures.\nCollect $150.")
  // -------------------------------------------------------------------------------------------------------------------

  /**
   * IMPURE METHOD
   * This method generates a shuffled Queue of each Chance card.
   *
   * @return a queue containing each Chance card.
   */
  def generateChanceDeck(): Queue[Chance] = {
    val defaultList: List[Chance] = List(advBoard, advGoChance, advIll, advSt, advNearRR1, advNearRR2,
                                                 advNearUtil, bankDiv, getOutJailChance, goBackThree, goToJailChance,
                                                 makeGenRepairs, speedFine, tripToReading, chairMan, loanMatures)
    val shuffled = scala.util.Random.shuffle(defaultList)
    Queue(shuffled: _*)
  }

  protected case class CommunityChest(id: Int, description: String) {
    override def toString: String = description
  }

  //All COMMUNITY CHEST CARDS IN THE US VERSION OF MONOPOLY
  // -------------------------------------------------------------------------------------------------------------------
  val advGoComm: CommunityChest = CommunityChest(0, "Advance to Go (Collect $200).")
  val bankErr: CommunityChest = CommunityChest(1, "Bank error in your favor.\nCollect $200.")
  val docFee: CommunityChest = CommunityChest(2, "Doctor's fee.\nPay $50.")
  val saleStock: CommunityChest = CommunityChest(3, "From sale of stock you get $50.")
  val getOutJailComm: CommunityChest = CommunityChest(4, "Get Out of Jail Free.")

  val goToJailComm: CommunityChest = CommunityChest(5,
    "Go to Jail.\nGo directly to jail, do not pass Go, do not collect $200.")

  val fundMatures: CommunityChest = CommunityChest(6, "Holiday fund matures.\nReceive $100.")
  val taxRefund: CommunityChest = CommunityChest(7, "Income tax refund.\nCollect $20.")
  val birthday: CommunityChest = CommunityChest(8, "It is your birthday.\nCollect $10 from every player.")
  val lifeInsurance: CommunityChest = CommunityChest(9, "Life insurance matures.\nCollect $100.")
  val hospitalFees: CommunityChest = CommunityChest(10, "Pay hospital fees of $100.")
  val schoolFees: CommunityChest = CommunityChest(11, "Pay school fees of $50.")
  val consultancy: CommunityChest = CommunityChest(12, "Receive $25 consultancy fee.")

  val repair: CommunityChest = CommunityChest(13, "You are assessed for street repair." +
    "\n$40 per house.\n$115 per hotel.")

  val beauty: CommunityChest = CommunityChest(14, "You have won second prize in a beauty contest.\nCollect $10.")
  val inherit: CommunityChest = CommunityChest(15, "You inherit $100.")
  // -------------------------------------------------------------------------------------------------------------------

  /**
   * IMPURE METHOD
   * This method generates a shuffled Queue of each Community Chest card.
   *
   * @return a Queue containing each CommunityChest card
   */
  def generateCommDeck(): Queue[CommunityChest]= {
    val defaultList = List(advGoComm, bankErr, docFee, saleStock, getOutJailComm, goToJailComm, fundMatures, taxRefund,
                           birthday, lifeInsurance, hospitalFees, schoolFees, consultancy, repair, beauty, inherit)
    val shuffled = scala.util.Random.shuffle(defaultList)
    Queue(shuffled: _*)
  }



}

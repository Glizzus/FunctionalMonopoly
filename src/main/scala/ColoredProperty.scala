/**
 * A trait for representing a single property in a color group.
 */
trait ColoredProperty extends Property {

  val title: String
  val position: Int
  val price: Int
  val mortgage: Int
  override val owner: Option[Player] = None
  val rent: Rent
  val houses: Int = 0

  override def toString: String = {
    super.toString +
      s"\nRent: $$${rent.default}" +
      s"\nWith 1 House   $$${rent.oneHouse}" +
      s"\nWith 2 Houses  $$${rent.twoHouses}" +
      s"\nWith 3 Houses  $$${rent.threeHouses}" +
      s"\nWith 4 Houses  $$${rent.fourHouses}" +
      s"\nWith HOTEL   $$${rent.withHotel}" +
      s"\nMortgage Value: $$$mortgage"
  }

}


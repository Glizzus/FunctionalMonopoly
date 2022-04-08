trait ColoredProperty extends Property {

  val title: String
  val position: Int
  val price: Int
  val mortgage: Int
  override val owner: Option[Player] = None
  val rent: Rent
  val houses: Int = 0

}


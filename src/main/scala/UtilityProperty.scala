case class UtilityProperty(title: String,
                           position: Int,
                           final val price: Int = 150, // the default price of both utility spaces in Monopoly
                           final val mortgage: Int = 75, // the default mortgage of both utility spaces
                           override val owner: Option[Player] = None) extends Property {

  val bothUtilsOwned: Boolean = false

  val defaultRentMultiplier: Int = 4
  val bothUtilsMultiplier: Int = 10

  val electricCompany: UtilityProperty = UtilityProperty("Electric Company", 12)
  val waterWorks: UtilityProperty = UtilityProperty("Water Works", 28 )


}

case class UtilityProperty(override val title: String,
                           override val position: Int,
                           price: Int = 150, // the default price of both utility spaces in Monopoly
                           mortgage: Int = 75, // the default mortgage of both utility spaces
                           override val isOwned: Boolean = false) extends Property {

  val bothUtilsOwned: Boolean = false

  val defaultRentMultiplier: Int = 4
  val bothUtilsMultiplier: Int = 10

  val electricCompany: UtilityProperty = UtilityProperty("Electric Company", 12)
  val waterWorks: UtilityProperty = UtilityProperty("Water Works", 28 )


}

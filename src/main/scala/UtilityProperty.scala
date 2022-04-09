case class UtilityProperty(title: String,
                           position: Int,
                           final val price: Int = 150, // the default price of both utility spaces in Monopoly
                           final val mortgage: Int = 75, // the default mortgage of both utility spaces
                           override val owner: Option[Player] = None) extends Property {

  override def toString: String = {
    s"${super.toString}\nIf one Utility is owned rent is 4 times amount shown on dice.\n" +
      "If both Utilities are owned rent is 10 times amount shown on dice" + "Mortgage Value: $75.00"
  }
}
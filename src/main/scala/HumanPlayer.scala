class HumanPlayer(override val money: Int = 1500,
                       override val position: Int = 0,
                       override val properties: PropertiesGroup = new PropertiesGroup()) extends Player {

  // TODO: Refactor this
  /**
   * This returns a new HumanPlayer instance that has an added property.
   * Because the type of the property parameter is checked, any casts should be safe.
   *
   * @param property the property to be added to the player
   * @return a new human player
   */
  override def addProperty(property: Property): Player = super.addProperty(property)

  override def giveMoney(deltaMoney: Int): Player = super.giveMoney(deltaMoney)

}
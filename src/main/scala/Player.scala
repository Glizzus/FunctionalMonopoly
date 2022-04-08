case class Player(money: Int, position: Int, properties: PropertiesGroup) extends Location {

  def this() = {
    this(1500, 0, new PropertiesGroup())
  }

  /**
   * This returns a new HumanPlayer instance that has an added property.
   * Because the type of the property parameter is checked, any casts should be safe.
   *
   * @param property the property to be added to the player
   * @return a new human player
   */
  def addProperty(property: Property): Player = {
    property match {
      // These casts should be safe
      case _: UtilityProperty =>

        val utilProp = property.asInstanceOf[UtilityProperty] // Casts property to UtilityProperty
        val newUtils = properties.utilities :+ utilProp // Creates the new Utilities list with the new property
        val newProperties = properties.copy(utilities = newUtils) // Creates the new PropertiesGroup with the new List
        this.copy(properties = newProperties) // Returns the new player with the added property

      case _: RailroadProperty =>

        val rrProp = property.asInstanceOf[RailroadProperty]
        val newRailroads = properties.railroads :+ rrProp
        val newProperties = properties.copy(railroads = newRailroads)
        this.copy(properties = newProperties)

      case _: ColoredProperty =>
        val colorProp = property.asInstanceOf[ColoredProperty]
        val newColoreds = properties.colors :+ colorProp
        val newProperties = properties.copy(colors = newColoreds)
        this.copy(properties = newProperties)

      case _ => throw new IllegalArgumentException
    }
  }

  def giveMoney(deltaMoney: Int): Player = this.copy(money = money + deltaMoney)

  def isBankrupt: Boolean = this.money < 0

}
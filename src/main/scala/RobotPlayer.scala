class RobotPlayer(override val money: Int = 1500,
                  override val position: Int = 0,
                  override val properties: PropertiesGroup = new PropertiesGroup()) extends Player {


  override def addProperty(property: Property): Player = super.addProperty(property)

  override def giveMoney(deltaMoney: Int): Player = super.giveMoney(deltaMoney)

  override def moveBy(spaces: Int): Player = super.moveBy(spaces)


}

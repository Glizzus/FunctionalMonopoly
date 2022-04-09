/**
 * A class for defining the HumanPlayer
 * @param money the amount of money the player has
 * @param position the current position of the player
 * @param properties all of the properties that a player owns
 */
class HumanPlayer(override val money: Int = 1500,
                  override val position: Int = 0,
                  override val properties: PropertiesGroup = new PropertiesGroup()) extends Player {

  /**
   * This returns a new HumanPlayer instance that has an added property.
   * Because the type of the property parameter is checked, any casts should be safe.
   *
   * @param property the property to be added to the player
   * @return a new human player
   */
  override def addProperty(property: Property): Player = super.addProperty(property)

  /**
   * Returns a new HumanPlayer with the money added to the HumanPlayer total
   * @param deltaMoney the difference in money to be added
   * @return a new human player with a new money count
   */
  override def giveMoney(deltaMoney: Int): Player = super.giveMoney(deltaMoney)

  /**
   * Changes the players position by a certain amount.
   * The player usually only moves forward, but for certain chance cards, they go back.
   *
   * @param spaces the amount of spaces to move
   * @return a new human player with a new position
   */
  override def moveBy(spaces: Int): Player = super.moveBy(spaces)
}
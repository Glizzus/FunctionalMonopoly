case class HumanPlayer(override val money: Int = 1500,
                       override val position: Int = 0,
                       override val properties: PropertiesGroup) extends Player

/**
 * This is kind of a "junk drawer" object for spaces on the board that are not properties
 */
object ActionSpaces {

  case class ActionSpace(position: Int) extends Location

    val go: ActionSpace = ActionSpace(0)
    val incomeTax: ActionSpace = ActionSpace(4)
    val jail: ActionSpace = ActionSpace(10)
    val parking: ActionSpace = ActionSpace(20)
    val goToJail: ActionSpace = ActionSpace(30)
    val luxTax: ActionSpace = ActionSpace(38)

  case class ChanceSpace(position: Int) extends Location

    val chance1: ChanceSpace = ChanceSpace(7)
    val chance2: ChanceSpace = ChanceSpace(22)
    val chance3: ChanceSpace = ChanceSpace(26)

  case class ChestSpace(position: Int) extends Location

    val chest1: ChestSpace = ChestSpace(2)
    val chest2: ChestSpace = ChestSpace(17)
    val chest3: ChestSpace = ChestSpace(33)

}

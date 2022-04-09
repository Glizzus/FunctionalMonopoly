// This was chosen for fast random access
import scala.collection.immutable.Vector

//Every thing from these namespaces are used
import ActionSpaces._
import ColoredProperties._
import RailroadProperties._
import UtilityProperties._

/**
 * This object represents the board. The board has 40 spaces and is circular in nature. The board
 * field has a physical representation of the board.
 */
object Board {

  /**
   * This is a physical representation of the board, but it is sorted by positition in memory in a clockwise position
   * starting from GO.
   */
  val board: Vector[Location] = {
    Vector(parking, kenAve, chance2, indAve, illAve, bAndO, atAve, ventAve, waterWorks, marvGard, goToJail,
           nyAve,                                                                                   pacAve,
           tenAve,                                                                                northCar,
           chest2,                                                                                  chest3,
           stJames,                                                                                 penAve,
           pennsylvania,                       /*MONOPOLY*/                                      shortLine,
           virAve,                                                                                 chance3,
           statesAve,                                                                            parkPlace,
           electricCompany,                                                                         luxTax,
           stCharles,                                                                            boardwalk,
           jail, conAve, verAve, chance1, orAve, reading, incomeTax, baltAve, chest1, medAve, go).sortBy(_.position)
  }
}

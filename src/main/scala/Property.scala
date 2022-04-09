/**
 * A trait for all properties
 */
trait Property extends Location {

  val title: String
  val price: Int
  val mortgage: Int
  val owner: Option[Player] = None
  val position: Int

  override def toString: String = {
    f"    ${title.toUpperCase}"
  }

}







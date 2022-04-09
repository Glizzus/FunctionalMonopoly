/**
 * A trait for handling everything with a position on the board.
 * Despite how lightweight this is, it synchronizes damn near everything.
 */
trait Location {
  val position: Int
}

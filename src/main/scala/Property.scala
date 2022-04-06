trait Property extends Location {

  val title: String
  val price: Int
  val mortgage: Int
  val isOwned: Boolean = false
  override val position: Int

}







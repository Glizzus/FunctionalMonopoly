case class ColoredProperty(override val title: String,
                           override val position: Int,
                           override val price: Int,
                           override val mortgage: Int,
                           override val isOwned: Boolean = false,
                           color: String,
                           rent: Rent) extends Property {

}

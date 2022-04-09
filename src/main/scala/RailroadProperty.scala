case class RailroadProperty(override val title: String,
                            position: Int,
                            price: Int = 200,
                            mortgage: Int = 100,
                            override val owner: Option[Player] = None) extends Property {

  override def toString: String = {
    super.toString +
      "\n      Rent:   $25" +
      "\nIf 2 R.R.'s are owned:   $50" +
      "\nIf 3 R.R.'s are owned:   $100" +
      "\nIf 4 R.R.'s are owned:   $200" +
      "\n     Mortgage Value $100"
  }
}

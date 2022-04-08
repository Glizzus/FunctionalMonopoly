case class RailroadProperty(title: String,
                            position: Int,
                            price: Int = 200,
                            mortgage: Int = 100,
                            override val owner: Option[Player] = None) extends Property {

    val rentWithOneRailroad: Int = 25
    val rentWithTwoRailroads: Int = 50
    val rentWithThreeRailroads: Int = 100
    val rentWithFourRailroads: Int = 200

    val reading = new RailroadProperty("Reading Railroad", 5)
    val pennsylvania = new RailroadProperty("Pennsylvania Railroad", 15)
    val bAndO = new RailroadProperty("B & O Railroad", 25)
    val shortLine = new RailroadProperty("Short Line Railroad", 35)



}

case class RailRoadProperty(override val title: String,
                            override val position: Int,
                            price: Int = 200,
                            mortgage: Int = 100,
                            override val isOwned: Boolean = false) extends Property {

    val rentWithOneRailroad: Int = 25
    val rentWithTwoRailroads: Int = 50
    val rentWithThreeRailroads: Int = 100
    val rentWithFourRailroads: Int = 200

    val reading = new RailRoadProperty("Reading Railroad", 5)
    val pennsylvania = new RailRoadProperty("Pennsylvania Railroad", 15)
    val bAndO = new RailRoadProperty("B & O Railroad", 25)
    val shortLine = new RailRoadProperty("Short Line Railroad", 35)



}

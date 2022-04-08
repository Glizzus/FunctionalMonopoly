trait Player extends Location {

  val money: Int = 1500 // players start with 1500 dollars
  val position: Int = 0 // players start at Go
  val properties: PropertiesGroup
      = PropertiesGroup(List[UtilityProperty](),
                        List[RailroadProperty](),
                        List[ColoredProperty]())

}

case class PropertiesGroup(utilities: List[UtilityProperty],
                          railroads: List[RailroadProperty],
                           colors: List[ColoredProperty]) {

  def this() = {
    this(List[UtilityProperty](), List[RailroadProperty](), List[ColoredProperty]())
  }
}




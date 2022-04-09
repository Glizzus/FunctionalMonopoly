/**
 * A class to encapsulate all of the properties to make Player instantiation easier.
 * @param utilities a list of UtilityProperty
 * @param railroads a list of RailroadProperty
 * @param colors a list of ColoredProperty
 */
case class PropertiesGroup(utilities: List[UtilityProperty],
                          railroads: List[RailroadProperty],
                           colors: List[ColoredProperty]) {

  def this() = {
    this(List[UtilityProperty](), List[RailroadProperty](), List[ColoredProperty]())
  }
}




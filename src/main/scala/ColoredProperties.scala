
object ColoredProperties {

  // I now know why multiple inheritance is discouraged
  sealed trait Color {
    val houseCost: Int
  }
    sealed trait Brown extends Color      { val houseCost = 50  }
    sealed trait LightBlue extends Color  { val houseCost = 50  }
    sealed trait Magenta extends Color    { val houseCost = 100 }
    sealed trait Orange extends Color     { val houseCost = 100 }
    sealed trait Red extends Color        { val houseCost = 150 }
    sealed trait Yellow extends Color     { val houseCost = 150 }
    sealed trait Green extends Color      { val houseCost = 200 }
    sealed trait DarkBlue extends Color   { val houseCost = 200 }


  case class BrownProperty(title: String,
                           position: Int,
                           price: Int,
                           mortgage: Int,
                           override val owner: Option[Player] = None,
                           rent: Rent) extends ColoredProperty with Brown

  val medAve: BrownProperty = BrownProperty("Mediterranean Avenue", 1, 60, 30, rent = Rent(2, 10, 30, 90, 160, 250))
  val baltAve: BrownProperty = BrownProperty("Baltic Avenue", 3, 60, 30, rent = Rent(4, 20, 60, 180, 320, 450))


  case class LightBlueProperty(title: String,
                           position: Int,
                           price: Int,
                           mortgage: Int,
                           override val owner: Option[Player] = None,
                           rent: Rent) extends ColoredProperty with LightBlue

  val orAve: LightBlueProperty = LightBlueProperty("Oriental Avenue", 6, 100, 50, rent = Rent(6, 30, 90, 270, 400, 550))
  val verAve: LightBlueProperty = LightBlueProperty("Vermont Avenue", 8, 100, 50, rent = Rent(6, 30, 90, 270, 400, 550))
  val conAve: LightBlueProperty = LightBlueProperty("Connecticut Avenue", 9, 120, 60,
                                                    rent = Rent(8, 40, 100, 300, 450, 600))


  case class MagentaProperty(title: String,
                           position: Int,
                           price: Int,
                           mortgage: Int,
                           override val owner: Option[Player] = None,
                           rent: Rent) extends ColoredProperty with Magenta




  case class OrangeProperty(title: String,
                           position: Int,
                           price: Int,
                           mortgage: Int,
                           override val owner: Option[Player] = None,
                           rent: Rent) extends ColoredProperty with Orange

  case class RedProperty(title: String,
                           position: Int,
                           price: Int,
                           mortgage: Int,
                           override val owner: Option[Player] = None,
                           rent: Rent) extends ColoredProperty with Red

  case class YellowProperty(title: String,
                           position: Int,
                           price: Int,
                           mortgage: Int,
                           override val owner: Option[Player] = None,
                           rent: Rent) extends ColoredProperty with Yellow

  case class GreenProperty(title: String,
                            position: Int,
                            price: Int,
                            mortgage: Int,
                            override val owner: Option[Player] = None,
                            rent: Rent) extends ColoredProperty with Green

  case class DarkBlueProperty(title: String,
                            position: Int,
                            price: Int,
                            mortgage: Int,
                            override val owner: Option[Player] = None,
                            rent: Rent) extends ColoredProperty with DarkBlue







}

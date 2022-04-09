
/**
 * This object just groups all of the properties in color groups together.
 * It also has traits and case classes for properties of their respective colors.
 */
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
                           rent: Rent) extends ColoredProperty with Brown {

    override def toString: String = {
      "(Brown)" +
      s"(Houses: $houses" +
        super.toString +
        s"\nHouses cost $houseCost each" +
        s"\nHotels, $houseCost, plus 4 houses"
    }
  }

  val medAve: BrownProperty = BrownProperty("Mediterranean Avenue", 1, 60, 30, rent = Rent(2, 10, 30, 90, 160, 250))
  val baltAve: BrownProperty = BrownProperty("Baltic Avenue", 3, 60, 30, rent = Rent(4, 20, 60, 180, 320, 450))


  case class LightBlueProperty(title: String,
                             position: Int,
                             price: Int,
                             mortgage: Int,
                             override val owner: Option[Player] = None,
                             rent: Rent) extends ColoredProperty with LightBlue {

    override def toString: String = {
      "(Light Blue)" +
        s"(Houses: $houses" +
        super.toString +
        s"\nHouses cost $houseCost each" +
        s"\nHotels, $houseCost, plus 4 houses"
    }
  }

  val orAve: LightBlueProperty = LightBlueProperty("Oriental Avenue", 6, 100, 50, rent = Rent(6, 30, 90, 270, 400, 550))
  val verAve: LightBlueProperty = orAve.copy("Vermont Avenue", 8)

  val conAve: LightBlueProperty = LightBlueProperty("Connecticut Avenue", 9, 120, 60,
                                                    rent = Rent(8, 40, 100, 300, 450, 600))


  case class MagentaProperty(title: String,
                             position: Int,
                             price: Int,
                             mortgage: Int,
                             override val owner: Option[Player] = None,
                             rent: Rent) extends ColoredProperty with Magenta {

    override def toString: String = {
      "(Magenta)" +
        s"(Houses: $houses" +
        super.toString +
        s"\nHouses cost $houseCost each" +
        s"\nHotels, $houseCost, plus 4 houses"
    }
  }

  val stCharles: MagentaProperty = MagentaProperty("St. Charles Place", 11, 140, 70,
                                                   rent = Rent(10, 50, 150, 450, 625, 750))
  val statesAve: MagentaProperty = stCharles.copy("States Avenue", 13)
  val virAve: MagentaProperty = MagentaProperty("Virginia Avenue", position = 14, 160, 80,
                                                rent = Rent(12, 60, 180, 500, 700, 900))

  case class OrangeProperty(title: String,
                            position: Int,
                            price: Int,
                            mortgage: Int,
                            override val owner: Option[Player] = None,
                            rent: Rent) extends ColoredProperty with Orange {

    override def toString: String = {
      "(Orange)" +
        s"(Houses: $houses" +
        super.toString +
        s"\nHouses cost $houseCost each" +
        s"\nHotels, $houseCost, plus 4 houses"
    }
  }

  val stJames: OrangeProperty = OrangeProperty("St. James Place", 16, 180, 90, rent = Rent(14, 70, 200, 550, 750, 950))
  val tenAve: OrangeProperty = stJames.copy("Tennessee Avenue", 18)
  val nyAve: OrangeProperty = OrangeProperty("New York Avenue", 19, 200, 100, rent = Rent(16, 18, 220, 600, 800, 1000))

  case class RedProperty(title: String,
                         position: Int,
                         price: Int,
                         mortgage: Int,
                         override val owner: Option[Player] = None,
                         rent: Rent) extends ColoredProperty with Red {

    override def toString: String = {
      "(Red)" +
        s"(Houses: $houses" +
        super.toString +
        s"\nHouses cost $houseCost each" +
        s"\nHotels, $houseCost, plus 4 houses"
    }
  }

  val kenAve: RedProperty = RedProperty("Kentucky Avenue", 21, 220, 110, rent = Rent(18, 90, 250, 700, 875, 1050))
  val indAve: RedProperty = kenAve.copy("Indiana Avenue", 23)
  val illAve: RedProperty = RedProperty("Illinois Avenue", 24, 240, 120, rent = Rent(20, 100, 300, 750, 925, 1100))

  case class YellowProperty(title: String,
                            position: Int,
                            price: Int,
                            mortgage: Int,
                            override val owner: Option[Player] = None,
                            rent: Rent) extends ColoredProperty with Yellow {

    override def toString: String = {
      "(Yellow)" +
        s"(Houses: $houses" +
        super.toString +
        s"\nHouses cost $houseCost each" +
        s"\nHotels, $houseCost, plus 4 houses"
    }
  }

  val atAve: YellowProperty = YellowProperty("Atlantic Avenue", 26, 260, 130, rent = Rent(22, 110, 330, 800, 975, 1150))
  val ventAve: YellowProperty = atAve.copy("Ventnor Avenue", 27)
  val marvGard: YellowProperty = YellowProperty("Marvin Gardens", 29, 280, 140,
                                                rent = Rent(24, 120, 360, 860, 1025, 1200))

  case class GreenProperty(title: String,
                           position: Int,
                           price: Int,
                           mortgage: Int,
                           override val owner: Option[Player] = None,
                           rent: Rent) extends ColoredProperty with Green {

    override def toString: String = {
      "(Green)" +
        s"(Houses: $houses" +
        super.toString +
        s"\nHouses cost $houseCost each" +
        s"\nHotels, $houseCost, plus 4 houses"
    }
  }

  val pacAve: GreenProperty = GreenProperty("Pacific Avenue", 31, 300, 150, rent = Rent(26, 130, 390, 900, 1100, 1275))
  val northCar: GreenProperty = pacAve.copy("North Carolina Avenue", 32)
  val penAve: GreenProperty = GreenProperty("Pennsylvania Avenue", 34, 320, 160,
                                            rent = Rent(28, 150, 450, 1000, 1200, 1400))

  case class DarkBlueProperty(title: String,
                              position: Int,
                              price: Int,
                              mortgage: Int,
                              override val owner: Option[Player] = None,
                              rent: Rent) extends ColoredProperty with DarkBlue {

    override def toString: String = {
      "(Dark Blue)" +
        s"(Houses: $houses" +
        super.toString +
        s"\nHouses cost $houseCost each" +
        s"\nHotels, $houseCost, plus 4 houses"
    }
  }

    val parkPlace: DarkBlueProperty = DarkBlueProperty("Park Place", 37, 350, 175,
                                                       rent = Rent(35, 175, 500, 1100, 1300, 1500))
    val boardwalk: DarkBlueProperty = DarkBlueProperty("Boardwalk", 39, 400, 200,
                                                       rent = Rent(50, 200, 600, 1400, 1700, 2000))

}

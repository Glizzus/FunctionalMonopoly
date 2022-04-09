
/**
 * A class for encapsulating different rent values
 * @param default rent with no houses
 * @param oneHouse rent with one house
 * @param twoHouses rent with two houses
 * @param threeHouses rent with three houses
 * @param fourHouses rent with four houses
 * @param withHotel rent with a hotel
 */
case class Rent(default: Int,
                oneHouse: Int,
                twoHouses: Int,
                threeHouses: Int,
                fourHouses: Int,
                withHotel: Int)

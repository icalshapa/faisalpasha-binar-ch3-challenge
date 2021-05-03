package weapon

class Scissor(
    var scissorScissor:Int,
    var scissorPaper:Int,
    var scissorRock:Int) : Weapon{
    override fun vsScissor(): Int {
        return (scissorScissor * 1)
    }

    override fun vsPaper(): Int {
        return (scissorPaper * 3)
    }

    override fun vsRock(): Int {
        return (scissorRock * 2)
    }


}
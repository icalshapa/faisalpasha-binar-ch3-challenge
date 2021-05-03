package weapon

class Rock (
    var rockScissor:Int,
    var rockPaper:Int,
    var rockRock:Int):Weapon{
    override fun vsScissor(): Int {
        return (rockScissor * 3)
    }

    override fun vsPaper(): Int {
        return (rockPaper * 2)
    }

    override fun vsRock(): Int {
        return (rockRock * 1)
    }

}
package weapon

class Paper (
    var paperScissor:Int,
    var paperPaper:Int,
    var paperRock:Int): Weapon{
    override fun vsScissor(): Int {
        return (paperScissor * 2)
    }

    override fun vsPaper(): Int {
        return (paperPaper * 1)
    }

    override fun vsRock(): Int {
        return (paperRock * 3)
    }
}
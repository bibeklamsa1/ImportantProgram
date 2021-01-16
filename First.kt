import java.time.LocalDate

public class First{
    lateinit var d:LocalDate;
    init {
        d = LocalDate.now();
    }
    public fun getYear():Int{
        return d.year
    }
}

fun main(args: Array<String>) {
    var d = First()
    print(d.getYear())
}

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    /* TODO */
    override fun compareTo(other: MyDate): Int =
        when {
            year != other.year -> year - other.year
            month != other.month -> month - other.month
            else -> {
                other.dayOfMonth - dayOfMonth
            }
        }
    }


fun compare(date1: MyDate, date2: MyDate) = date1 < date2
package models.exceptions

class TestException(
    private val regString: String,
    private val expected: String,
    private val caught: String,
    s: String? = null,
) : Exception(s) {
    override val message: String
        get() = "Error in line `$regString`. Excepted `$expected`. but get `$caught`"

}
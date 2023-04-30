package designpattern


/**
 * @created 11/11/2022 - 10:34 AM
 * @project KotlinPlayGround
 * @author lwinminkhant 11/11/22
 */
interface Logger{
    fun log(string: String)
}
class ConsoleLogger:Logger{
    override fun log(string: String) {
        print("Console log: $string")
    }

}
class XMLLogger:Logger{
    override fun log(string: String) {
        print("XML log: $string")
    }
}


abstract class LoggerFactory{
    abstract fun getLogger():Logger
}
class XMLFactory: LoggerFactory() {
    override fun getLogger(): Logger {
        return XMLLogger()
    }
}

class ConsoleFactory: LoggerFactory(){
    override fun getLogger(): Logger {
        return ConsoleLogger()
    }
}

fun main() {
    var logFactory: LoggerFactory = ConsoleFactory()
    logFactory.getLogger().log("Logging in console is great")
    logFactory = XMLFactory()
    logFactory.getLogger().log("Logging in xml also nice")
}
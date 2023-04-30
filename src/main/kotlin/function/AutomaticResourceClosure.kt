package function

import java.io.File


/**
 * @created 04/11/2022 - 11:27 AM
 * @project KotlinPlayGround
 * @author lwinminkhant 11/4/22
 */
class AutomaticResourceClosure {
    fun readFile() {
        return File("/home/lwinminkhant/WorkSpace/Lab/src/main/resources/myFile.txt").inputStream().use {
            it.bufferedReader()
                    .lineSequence()
                    .forEach(::println)
        }

    }

    fun main() {
        val automaticResourceClosure = AutomaticResourceClosure()
        automaticResourceClosure.readFile()
    }
}
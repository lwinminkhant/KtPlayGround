package hackerrank



/**
 * @created 02/10/2022 - 3:20 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 10/2/22
 */
class CountingValley {

    /*fun countingValleys(steps: Int, path: String): Int {
        var myNum: Int? = null
        print(myNum)
        // Write your code here
        var numV = 0
        var sealevel = 0
        var tempMax = 0
        for(trip in path){
            if(trip=='D'){
                sealevel--
            }else if(trip =='U') sealevel ++

            if(sealevel > tempMax){
                tempMax = sealevel
            }else if(sealevel>0){
                numV++
                tempMax = 0
            }
        }
        return numV
    }*/
    fun countingValleys(steps: Int, path: String): Int {
        // Write your code here
        var numV = 0
        var sealevel = 0


        for(trip in path){
            if(trip=='D'){
                sealevel--
                if(sealevel == -1)
                    numV++
            }else if(trip =='U') sealevel ++

        }
        return numV

    }
}

fun main() {
    print(CountingValley().countingValleys(8,"UUUUDDDD"))
}
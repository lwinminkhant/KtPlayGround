package designpattern


/**
 * @created 02/01/2023 - 9:56 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 1/2/23
 */
class Adapter {
}
data class Item(val name: String, val price: Double){

}
data class Payment(val type:String, val amount:Double){
    fun pay(){
        print("$type $amount $")
    }
}
package function

import java.lang.IllegalStateException


/**
 * @created 04/11/2022 - 2:07 PM
 * @project KotlinPlayGround
 * @author lwinminkhant 11/4/22
 */
class ObjectAndFunctionNotation {

}

class Payment(private val creditCard: CreditCard, private val amount:Int){

    fun combine(payment: Payment): Payment =
            if(creditCard == payment.creditCard){
                Payment(creditCard, amount + payment.amount)
            }else throw IllegalStateException("Cards don't match.")

    /*companion object{
        fun groupByCard(payments: List<Payment>): List<Payment>{
            payments.groupBy { it.creditCard }
                    .map { it.reduce(Payment::combine) }
        }
    }*/
}
class CreditCard {

}

fun main() {

}
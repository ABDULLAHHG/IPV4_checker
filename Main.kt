fun main() {
    testCases()
}



//region check and validation
fun check(name: String , result : Boolean , correctResult : Boolean){
    if (result == correctResult){
        println("Success - $name")
    }else{
        println("Failed -  $name")
    }
}

fun validation(ipAddress: String):Boolean{

    val octets = ipAddress.split('.')

    if ((octets).size != 4){
        return false
    }

    for (octet in octets){

        when {
        !octet.matches(Regex("\\d+")) -> return false

        octet.toInt() !in 0..255 -> return false

        ((octet.length > 1) && (octet[0] == '0'))->return false
        }

    }
    return true



}

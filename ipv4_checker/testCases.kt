fun testCases(){
    validTestCases()
    invalidTestCases()


}


//region valid test cases
fun validTestCases(){
    println("Valid Test Cases")
    // valid cases // TODO Camel Case
    val localIP : String = "127.0.0.1" // Local Host Default IP
    val privateNetwork : String = "0.0.0.0" // Private Network Default IP
    val ipv4TypeC : String = "192.168.1.1" // IPV4 Type C
    val ipv4TypeB : String = "172.16.1.0" // IPV4 Type B
    val ipv4TypeA : String = "10.0.0.0" // IPV4 Type A

    // run check
    check(
        name = "Local Host Default IP",
        result = validation(localIP),
        correctResult = true,
    )

    check(
        name = "Private Network Default IP Address",
        result = validation(privateNetwork),
        correctResult = true,
    )

    check(
        name = "IPV4 Type C",
        result = validation(ipv4TypeC),
        correctResult = true,
    )

    check(
        name = "IPV4 Type B",
        result = validation(ipv4TypeB),
        correctResult = true,
    )

    check(
        name = "IPV4 Type A",
        result = validation(ipv4TypeA),
        correctResult = true,
    )
}
//endregion


//region Invalid Test Cases
fun invalidTestCases(){
    println("Invalid Test Cases")

    //invalid characters
    val stringOfCharacters : String = "adflasf"

    // more than 3 dots
    val moreThanThreeDots : String = "1.1.1.1.1.1"

    // all segments are zeros
    val ZeroCase : String = "00.00.00.00"


    // all segments are zeros
    val characterIpAddress : String = "AB.CD.EF.GH"

    // Hello with dots with numbers
    val helloDot : String = "Hello.255.255.255"

    // out of valid range from 0 to 255
    val OutOfValidIntgerRange : String = "256.256.256.256"

    // negative ip address
    val negativeNumbers : String = "-10.-1.1.-1"

    // run check
    check(
        name = "Invalid Characters",
        result = validation(stringOfCharacters),
        correctResult = false,
    )

    check(
        name = "More than 3 dots",
        result = validation(moreThanThreeDots),
        correctResult = false,
    )

    check(
        name = "all segments are zeros",
        result = validation(ZeroCase),
        correctResult = false,
    )

    check(
        name = "Characters IP Address",
        result = validation(characterIpAddress),
        correctResult = false,
    )

    check(
        name = "out of valid range from 0 to 255",
        result = validation(OutOfValidIntgerRange),
        correctResult = false,
    )

    check(
        name = "Negative IP Address",
        result = validation(negativeNumbers),
        correctResult = false,
    )

    check(
        name = "hello Dots with numbers",
        result = validation(helloDot),
        correctResult = false,
    )

}
//endregion
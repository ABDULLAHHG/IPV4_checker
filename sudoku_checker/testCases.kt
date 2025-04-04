fun testCases(){
    testCasesForMatrix16x16()
    testCasesForMatrix9x9()
    testCasesForMatrix4x4()
}


//region Matrix 16x16
fun testCasesForMatrix16x16(){
    println("Test Cases For Matrix 16x16")

    // Valid case
    val firstCase: List<List<Char>> = listOf(
        listOf( '1','2','3','4',  '5','6','7','8',  '9','A','-','C',  'D','-','F','G'),
        listOf( '5','6','7','8',  '9','-','B','C',  'D','-','F','G',  '1','-','3','4'),
        listOf( '9','A','B','C',  '2','1','-','3',  '4','-','6','7',  '-','5','8','-'),
        listOf( 'D','E','F','G',  '-','-','-','4',  '-','B','2','3',  '6','7','-','A'),

        listOf( '2','7','1','5',  '3','4','6','9',  'A','C','-','E',  '-','8','-','B'),
        listOf( '3','8','G','-',  '1','-','-','F',  '-','4','-','2',  '9','-','-','C'),
        listOf( '4','B','9','-',  '-','5','A','-',  '-','3','1','-',  'G','-','7','6'),
        listOf( '6','C','D','-',  '-','G','-','-',  '5','-','7','8',  '4','3','2','1'),

        listOf( '-','-','-','-',  '4','2','1','5',  '-','6','-','A',  'B','C','D','E'),
        listOf( 'F','3','4','1',  '6','-','8','A',  '2','-','9','5',  '-','G','-','-'),
        listOf( 'B','5','8','7',  '-','D','-','E',  '3','G','-','4',  '2','1','6','-'),
        listOf( 'E','G','-','D',  'C','F','-','-',  '-','1','B','-',  '5','4','-','-'),

        listOf( '8','1','-','-',  'A','7','2','6',  '-','5','-','-',  'C','D','E','F'),
        listOf( 'A','-','-','-',  'B','-','-','-',  '1','-','3','6',  '-','9','5','2'),
        listOf( '7','4','-','-',  'D','C','-','-',  '-','F','-','-',  '-','6','-','-'),
        listOf( 'C','-','E','-',  'G','3','4','-',  '-','D','-','-',  '7','-','-','8'))

    // Duplicate in SubMatrix 4x4
    val secondCase: List<List<Char>> = listOf(
        listOf( '1','2','3','4',  '5','6','7','8',  '9','A','-','C',  'D','-','F','G'),
        listOf( '2','6','7','8',  '6','-','B','C',  'D','-','F','G',  '1','-','3','4'),
        listOf( '9','A','B','C',  '2','1','-','3',  '4','-','6','7',  '-','5','8','-'),
        listOf( 'D','E','F','G',  '-','-','-','4',  '-','B','2','3',  '6','7','-','A'),

        listOf( '2','7','1','5',  '3','4','6','9',  'A','C','-','E',  '-','8','-','B'),
        listOf( '3','8','G','-',  '1','-','-','F',  '-','4','-','2',  '9','-','-','C'),
        listOf( '4','B','9','-',  '-','5','A','-',  '-','3','1','-',  'G','-','7','6'),
        listOf( '6','C','D','-',  '-','G','-','-',  '5','-','7','8',  '4','3','2','1'),

        listOf( '-','-','-','-',  '4','2','1','5',  '-','6','-','A',  'B','C','D','E'),
        listOf( 'F','3','4','1',  '6','-','8','A',  '2','-','9','5',  '-','G','-','-'),
        listOf( 'B','5','8','7',  '-','D','-','E',  '3','G','-','4',  '2','1','6','-'),
        listOf( 'E','G','-','D',  'C','F','-','-',  '-','1','B','-',  '5','4','-','-'),

        listOf( '8','1','-','-',  'A','7','2','6',  '-','5','-','-',  'C','D','E','F'),
        listOf( 'A','-','-','-',  'B','-','-','-',  '1','-','3','6',  '-','9','5','2'),
        listOf( '7','4','-','-',  'D','C','-','-',  '-','F','-','-',  '-','6','-','-'),
        listOf( 'C','-','E','-',  'G','3','4','-',  '-','D','-','-',  '7','-','-','8'))

    // duplicate in row
    val thirdCase: List<List<Char>> = listOf(
        listOf( '1','1','3','4',  '5','5','7','8',  '9','A','-','C',  'D','-','F','G'),
        listOf( '5','6','7','8',  '9','-','B','C',  'D','-','F','G',  '1','-','3','4'),
        listOf( '9','A','B','C',  '2','1','-','3',  '4','-','6','7',  '-','5','8','-'),
        listOf( 'D','E','F','G',  '-','-','-','4',  '-','B','2','3',  '6','7','-','A'),

        listOf( '2','2','1','5',  '3','3','6','9',  'A','C','-','E',  '-','8','-','B'),
        listOf( '3','8','G','-',  '1','-','-','F',  '-','4','-','2',  '9','-','-','C'),
        listOf( '4','B','9','-',  '-','5','A','-',  '-','3','1','-',  'G','-','7','6'),
        listOf( '6','C','D','-',  '-','G','-','-',  '5','-','7','8',  '4','3','2','1'),

        listOf( '-','-','-','-',  '4','2','1','5',  '-','6','-','A',  'B','C','D','E'),
        listOf( 'F','3','4','1',  '6','-','8','A',  '2','-','9','5',  '-','G','-','-'),
        listOf( 'B','5','8','7',  '-','D','-','E',  '3','G','-','4',  '2','1','6','-'),
        listOf( 'E','G','-','D',  'C','F','-','-',  '-','1','B','-',  '5','4','-','-'),

        listOf( '8','1','-','-',  'A','7','2','6',  '-','5','-','-',  'C','D','E','F'),
        listOf( 'A','-','-','-',  'B','-','-','-',  '1','-','3','6',  '-','9','5','2'),
        listOf( '7','4','-','-',  'D','C','-','-',  '-','F','-','-',  '-','6','-','-'),
        listOf( 'C','-','E','-',  'G','3','4','-',  '-','D','-','-',  '7','-','-','8'))

    // duplicate in column
    val fourthCase: List<List<Char>> = listOf(
        listOf( '1','2','3','4',  '5','6','7','8',  '9','A','-','C',  'D','-','F','G'),
        listOf( '1','6','7','8',  '9','-','B','C',  'D','-','F','G',  '1','-','3','4'),
        listOf( '9','A','B','C',  '2','1','-','3',  '4','-','6','7',  '-','5','8','-'),
        listOf( 'D','E','F','G',  '-','-','-','4',  '-','B','2','3',  '6','7','-','A'),

        listOf( '1','2','1','5',  '5','6','6','9',  'A','C','-','E',  '-','8','-','B'),
        listOf( '3','8','G','-',  '1','-','-','F',  '-','4','-','2',  '9','-','-','C'),
        listOf( '4','B','9','-',  '-','5','A','-',  '-','3','1','-',  'G','-','7','6'),
        listOf( '6','C','D','-',  '-','G','-','-',  '5','-','7','8',  '4','3','2','1'),

        listOf( '-','-','-','-',  '4','2','1','5',  '-','6','-','A',  'B','C','D','E'),
        listOf( 'F','3','4','1',  '6','-','8','A',  '2','-','9','5',  '-','G','-','-'),
        listOf( 'B','5','8','7',  '-','D','-','E',  '3','G','-','4',  '2','1','6','-'),
        listOf( 'E','G','-','D',  'C','F','-','-',  '-','1','B','-',  '5','4','-','-'),

        listOf( '8','1','-','-',  'A','7','2','6',  '-','5','-','-',  'C','D','E','F'),
        listOf( 'A','-','-','-',  'B','-','-','-',  '1','-','3','6',  '-','9','5','2'),
        listOf( '7','4','-','-',  'D','C','-','-',  '-','F','-','-',  '-','6','-','-'),
        listOf( 'C','-','E','-',  'G','3','4','-',  '-','D','-','-',  '7','-','-','8'))

    // invalid character or symbol
    val fifthCase: List<List<Char>> = listOf(
        listOf( 'S','%','3','4',  '5','6','7','8',  '9','A','-','C',  'D','-','F','G'),
        listOf( '5','6','7','8',  '9','-','B','C',  'D','-','F','G',  '1','-','3','4'),
        listOf( '9','A','B','C',  '2','1','-','3',  '4','-','6','7',  '-','5','8','-'),
        listOf( 'D','E','F','G',  '-','-','-','4',  '-','B','2','3',  '6','7','-','A'),

        listOf( '2','S','1','5',  '3','4','6','9',  'A','C','-','E',  '-','8','-','B'),
        listOf( '3','8','G','-',  '1','-','-','F',  '-','4','-','2',  '9','-','-','C'),
        listOf( '4','B','9','-',  '-','5','A','-',  '-','3','1','-',  'G','-','7','6'),
        listOf( '6','C','D','-',  '-','G','-','-',  '5','-','7','8',  '4','3','2','1'),

        listOf( '-','-','-','-',  '4','2','1','5',  '-','6','-','A',  'B','C','D','E'),
        listOf( 'F','3','4','1',  '6','-','8','A',  '2','-','9','5',  '-','G','-','-'),
        listOf( 'B','5','8','7',  '-','D','-','E',  '3','G','-','4',  '2','1','6','-'),
        listOf( 'E','G','-','D',  'C','F','-','-',  '-','1','B','-',  '5','4','-','-'),

        listOf( '8','1','-','-',  'A','7','2','6',  '-','5','-','-',  'C','D','E','F'),
        listOf( 'A','-','-','-',  'B','-','-','-',  '1','-','3','6',  '-','9','5','2'),
        listOf( '7','4','-','-',  'D','C','-','-',  '-','F','-','-',  '-','6','-','-'),
        listOf( 'C','-','E','-',  'G','3','4','-',  '-','D','-','-',  '7','-','-','8'))


    // run the test cases
    check(
        name = "Case 1 - Valid Case",
        result = validation(firstCase),
        correctResult = true
    )

    check(
        name = "Case 2 - duplicate in SubMatrix 4x4",
        result = validation(secondCase),
        correctResult = false
    )

    check(
        name = "Case 3 - duplicate in Rows ",
        result = validation(thirdCase),
        correctResult = false
    )

    check(
        name = "Case 4 - duplicate in Columns",
        result = validation(fourthCase),
        correctResult = false
    )
    check(
        name = "Case 5 - invalid character or symbol",
        result = validation(fifthCase),
        correctResult = false
    )
}
//endregion

//region Matrix 9x9
fun testCasesForMatrix9x9(){
    println("Test Cases For Matrix 9x9")
// valid case
    val firstCase: List<List<Char>> = listOf(
        listOf(  '1','4','5'   ,'2','3','-',  '-','8','7'  ),
        listOf(  '2','-','6'   ,'1','-','7',  '-','9','3'  ),
        listOf(  '3','-','7'   ,'8','-','6',  '-','1','2'  ),

        listOf(  '6','-','1'   ,'3','-','2',  '-','4','5'  ),
        listOf(  '7','-','8'   ,'5','-','3',  '-','-','9'  ),
        listOf(  '5','-','2'   ,'4','-','-',  '-','6','1'  ),

        listOf(  '4','-','3'   ,'9','-','-',  '-','2','8'  ),
        listOf(  '8','-','-'   ,'7','-','5',  '-','3','4'  ),
        listOf(  '9','-','-'   ,'6','-','-',  '-','5','-'  ),
    )

    // duplicate in 3x3 matrix
    val secondCase: List<List<Char>> = listOf(
        listOf(  '1','2','5'   ,'4','3','-',  '-','8','7'  ),
        listOf(  '2','-','6'   ,'1','-','4',  '-','7','3'  ),
        listOf(  '3','-','7'   ,'8','-','6',  '-','1','2'  ),

        listOf(  '6','-','1'   ,'3','-','2',  '-','4','5'  ),
        listOf(  '7','-','8'   ,'5','-','3',  '-','-','9'  ),
        listOf(  '5','-','2'   ,'-','-','7',  '-','6','1'  ),

        listOf(  '4','-','3'   ,'9','-','-',  '-','2','8'  ),
        listOf(  '8','-','-'   ,'7','-','5',  '-','3','4'  ),
        listOf(  '9','-','-'   ,'6','-','-',  '-','5','-'  ),
    )

    // duplicate in row
    val thirdCase: List<List<Char>> = listOf(
        listOf(  '1','4','5'   ,'2','3','-',  '-','8','7'  ),
        listOf(  '1','-','6'   ,'1','-','7',  '-','9','3'  ),
        listOf(  '3','-','7'   ,'8','-','6',  '-','1','2'  ),

        listOf(  '6','-','1'   ,'3','-','2',  '-','4','5'  ),
        listOf(  '7','-','8'   ,'5','-','3',  '-','-','9'  ),
        listOf(  '5','-','2'   ,'4','-','-',  '-','6','1'  ),

        listOf(  '4','-','3'   ,'9','-','-',  '-','2','8'  ),
        listOf(  '8','-','-'   ,'7','-','5',  '-','3','4'  ),
        listOf(  '9','-','-'   ,'6','-','-',  '-','5','-'  ),
    )

    // duplicate in col
    val fourthCase: List<List<Char>> = listOf(
        listOf(  '1','1','5'   ,'2','3','-',  '-','8','7'  ),
        listOf(  '2','-','6'   ,'1','-','7',  '-','9','3'  ),
        listOf(  '3','-','7'   ,'8','-','6',  '-','1','2'  ),

        listOf(  '6','-','1'   ,'3','-','2',  '-','4','5'  ),
        listOf(  '7','-','8'   ,'5','-','3',  '-','-','9'  ),
        listOf(  '5','-','2'   ,'4','-','-',  '-','6','1'  ),

        listOf(  '4','-','3'   ,'9','-','-',  '-','2','8'  ),
        listOf(  '8','-','-'   ,'7','-','5',  '-','3','4'  ),
        listOf(  '9','-','-'   ,'6','-','-',  '-','5','-'  ),
    )

    // run the test cases
    check(
        name = "Case 1 - Valid Case",
        result = validation(firstCase),
        correctResult = true
    )

    check(
        name = "Case 2 - duplicate in SubMatrix 3x3",
        result = validation(secondCase),
        correctResult = false
    )

    check(
        name = "Case 3 - duplicate in Rows ",
        result = validation(thirdCase),
        correctResult = false
    )

    check(
        name = "Case 4 - duplicate in Columns",
        result = validation(fourthCase),
        correctResult = false
    )

}
//endregion

//region Matrix 4x4
fun testCasesForMatrix4x4(){
    println("Test Cases For Matrix 4x4")

    // valid case
    val firstCase: List<List<Char>> = listOf(
        listOf(  '1','2',  '3','4',  ),
        listOf(  '4','3',  '2','1',  ),

        listOf(  '2','1',  '4','3',  ),
        listOf(  '3','4',  '1','2',  ))

    // duplicate in 2x2 matrix case
    val secondCase: List<List<Char>> = listOf(
        listOf(  '1','2',  '3','4',  ),
        listOf(  '4','1',  '2','3',  ),

        listOf(  '2','3',  '4','1',  ),
        listOf(  '3','-',  '1','-',  ))

    // duplicate in row case
    val thirdCase: List<List<Char>> = listOf(
        listOf(  '1','1',  '3','4',  ),
        listOf(  '4','3',  '2','1',  ),

        listOf(  '2','-',  '4','3',  ),
        listOf(  '3','4',  '1','2',  ))

    // duplicate in column case
    val fourthCase: List<List<Char>> = listOf(
        listOf(  '1','2',  '3','4',  ),
        listOf(  '1','2',  '3','4',  ),

        listOf(  '2','1',  '4','3',  ),
        listOf(  '3','4',  '1','2',  ))

    // invalid character or symbol case
    val fifthCase: List<List<Char>> = listOf(
        listOf(  'A','S',  '@','%',  ),
        listOf(  '4','3',  '2','1',  ),

        listOf(  '2','1',  '4','3',  ),
        listOf(  '3','4',  '1','2',  ))

    // number out of range the space case //TODO
    val sixthCase: List<List<Char>> = listOf(
        listOf(  '5','6',  '3','4',  ),
        listOf(  '4','3',  '2','1',  ),

        listOf(  '2','1',  '4','3',  ),
        listOf(  '3','4',  '1','2',  ))


    // run the test cases
    check(
        name = "Case 1 - Valid Case",
        result = validation(firstCase),
        correctResult = true
    )

    check(
        name = "Case 2 - duplicate in SubMatrix 2x2",
        result = validation(secondCase),
        correctResult = false
    )

    check(
        name = "Case 3 - duplicate in Rows ",
        result = validation(thirdCase),
        correctResult = false
    )

    check(
        name = "Case 4 - duplicate in Columns",
        result = validation(fourthCase),
        correctResult = false
    )
    check(
        name = "Case 5 - invalid character or symbol",
        result = validation(fifthCase),
        correctResult = false
    )

    check(
        name = "Case 6 - number out of range",
        result = validation(sixthCase),
        correctResult = false
    )
}
//endregion


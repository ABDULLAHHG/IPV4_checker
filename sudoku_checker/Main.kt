// if you forget sudoku, check below link to refresh your memory.
// https://sudoku.com/how-to-play/sudoku-rules-for-complete-beginners/
// simple rules, each column and row and SubMatrix should contain every digit
// from 1 to 9 and characters from A to G if matrix 16x16
// from 1 to 9 if matrix 9x9
// from 1 to 4 if matrix 4x4
// the only acceptable symbol is `-`

import kotlin.math.sqrt

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

fun validation(matrix: List<List<Char>>):Boolean{
    return when{
        (checkDuplicateInRows(matrix)) -> false
        (checkDuplicateInColumns(matrix)) -> false
        (checkDuplicateInSubMatrix(matrix)) -> false
        (checkInvalidCharacterOrSymbolOrNumber(matrix)) -> false
        else -> true

    }

}

//endregion

//region Check Duplicate In Rows
fun checkDuplicateInRows(matrix: List<List<Char>>): Boolean {
    for (row in matrix) {
        val rowValues = mutableSetOf<Char>()
        for (element in row) {
            if (element != '-') {
                if(!rowValues.add(element = element)){
                    return true
                }
            }

        }
    }
    return false
}
//endregion

//region Check Duplicate In Columns
fun checkDuplicateInColumns(matrix: List<List<Char>>): Boolean {

    val numRows = matrix.size
    val numCols = matrix[0].size

    for (colIndex in 0 until numCols) {
        val columnValues = mutableListOf<Char>() // list to store the character

        for (rowIndex in 0 until numRows) {
            val cellValue = matrix[rowIndex][colIndex]
            if (cellValue != '-') { // TODO
                if (columnValues.contains(cellValue)) { // check if the list contains that character
                    return true
                }
                columnValues.add(cellValue)
            }
        }
    }

    return false
}
//endregion

//region Check Duplicate In SubMatrix
fun checkDuplicateInSubMatrix(matrix: List<List<Char>>):Boolean{

    val subMatrixLength : Int = sqrt(matrix.size.toDouble()).toInt()

    // Check for duplicates in the top-left SubMatrix
    return if (findDuplicateInSubMatrix(matrix = matrix ,
        started_row = 0 ,
        start_col = 0 ,
        subMatrixLength=subMatrixLength)
        ){true}

    // Check for duplicates in the top-right SubMatrix
    else if (findDuplicateInSubMatrix(matrix = matrix ,
        started_row = 0 ,
        start_col = matrix.size - (subMatrixLength),
        subMatrixLength=subMatrixLength)
        ){true}

    // Check for duplicates in the bottom-left SubMatrix
    else if (findDuplicateInSubMatrix(matrix = matrix ,
        started_row = matrix.size - (subMatrixLength) ,
        start_col = 0,
        subMatrixLength=subMatrixLength)
        ){true}

    // Check for duplicates in the bottom-right SubMatrix
    else if (findDuplicateInSubMatrix(matrix = matrix ,
        started_row = matrix.size - (subMatrixLength) ,
        start_col = subMatrixLength,
        subMatrixLength=subMatrixLength)
        ){true}

    else {
        false
    }


}

fun findDuplicateInSubMatrix(matrix: List<List<Char>> , started_row: Int , start_col: Int , subMatrixLength: Int):Boolean{
    // to save characters that subMatrixValues
    val subMatrixValues = mutableSetOf<Char>()

    for (row_index in started_row until started_row+subMatrixLength){
        for (col_index in start_col until start_col+subMatrixLength){
            if (matrix[row_index][col_index] != '-'){
                if(!subMatrixValues.add(element = matrix[row_index][col_index])){ // check if the element have subMatrixValues
                    return true
                }
            }
        }
    }
    return false


}
//endregion

//region Check Invalid Character Or Symbol Or Number
fun checkInvalidCharacterOrSymbolOrNumber(matrix: List<List<Char>>):Boolean{
    val lentgh = matrix.size
    for (row in matrix) {
        for (char in row) {
            if (!isValidCharacterOrNumber(char , lentgh)) {
                return true // Found an invalid character
            }
        }
    }
    return false // No invalid characters found
}

fun isValidCharacterOrNumber(char: Char , length:Int ): Boolean {
    if (length <= 9){
        return char in '1'..('1'+ length-1) || char == '-'
    }else {
        return char in '1'..'9' || char in 'A'..('A' + length - 1) || char == '-'
    }
}
//endregion

//region Old Check Duplicate In Rows
fun oldCheckDuplicateInRows(matrix: List<List<Char>>): Boolean {
    for (row in matrix) {
        val sortedDescendingRow = row.sortedDescending()

        for (i in 0 until (sortedDescendingRow.size - 1)) {
            if (sortedDescendingRow[i] == '-') {
                break // cause it is sorted in descending that mean all left is '-' so break
            }
            else if (sortedDescendingRow[i] == sortedDescendingRow[i + 1]) {
                return true // Found a duplicate
            }
        }
    }
    return false // No duplicates found in any row
}
//endregion

class Matrix(private val data: List<List<Int>>) {
    val rows: Int = data.size
    val cols: Int = data[0].size
    operator fun plus(other: Matrix): Matrix {
        require(rows == other.rows && cols == other.cols) { "Matrix dimensions must agree" }
        val result = List(rows) { i ->
            List(cols) { j ->
                data[i][j] + other.data[i][j]
            }
        }
        return Matrix(result)
    }

    operator fun minus(other: Matrix): Matrix {
        require(rows == other.rows && cols == other.cols) { "Matrix dimensions must agree" }
        val result = List(rows) { i ->
            List(cols) { j ->
                data[i][j] - other.data[i][j]
            }
        }
        return Matrix(result)
    }

    operator fun times(other: Matrix): Matrix {
        require(cols == other.rows) { "Matrix A's columns must equal Matrix B's rows" }
        val result = List(rows) { i ->
            List(other.cols) { j ->
                (0 until cols).sumOf { k -> data[i][k] * other.data[k][j] }
            }
        }
        return Matrix(result)
    }

    override fun toString(): String {
        return data.joinToString("\n") { row -> row.joinToString("\t") }
    }
}

fun readMatrix(): Matrix {
    println("Enter matrix dimensions (rows and columns):")
    val (rows, cols) = readLine()!!.split(" ").map { it.toInt() }
    println("Enter matrix values row by row, with each row on a new line and values separated by spaces:")

        val data = List(rows) {
        readLine()!!.split(" ").map { it.toInt() }
    }

    return Matrix(data)
}

fun main() {
    println("Enter matrix A:")
    val matrixA = readMatrix()
    println("Enter matrix B:")
    val matrixB = readMatrix()
    println("Matrix A:")
    println(matrixA)
    println("Matrix B:")
    println(matrixB)
    println("Matrix A + Matrix B:")
    println(matrixA + matrixB)
    println("Matrix A - Matrix B:")
    println(matrixA - matrixB)
    println("Matrix A * Matrix B:")
    println(matrixA * matrixB)
}
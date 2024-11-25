open class Person(val firstName: String, val lastName: String, var age: Int) {
    constructor(firstName: String, lastName: String) : this(firstName, lastName, 0)

    override fun toString(): String {
        return "Person(firstName='$firstName', lastName='$lastName', age=$age)"
    }
}

class Student(
    firstName: String,
    lastName: String,
    age: Int,
    val enrollmentNo: String,
    val branch: String,
    val classLevel: String,
    val labBatch: String
) : Person(firstName, lastName, age) {
    constructor(
        firstName: String,
        lastName: String,
        enrollmentNo: String,
        branch: String,
        classLevel: String,
        labBatch: String
    ) : this(firstName, lastName, 0, enrollmentNo, branch, classLevel, labBatch)

    override fun toString(): String {
        return "${super.toString()}, Student(enrollmentNo='$enrollmentNo', branch='$branch', class='$classLevel', labBatch='$labBatch')"
    }
}

fun main() {
    val students = arrayListOf(
        Student("Divya", "Parmar", 20, "S1234", "CE", "Class A", "Batch A"),
        Student("Delsy", "Yadav", 22, "S5678", "IT", "Class B", "Batch B"),
        Student("Bhavya", "Raval", 19, "S9101", "IOT", "Class C", "Batch C"),
        Student("Vaibhavi", "Patel", 21, "S1121", "CSBS", "Class D", "Batch D"),
        Student("Carol", "Davis", 23, "S3141", "CE", "Class E", "Batch E")
    )
    students.forEach { println(it) }
}

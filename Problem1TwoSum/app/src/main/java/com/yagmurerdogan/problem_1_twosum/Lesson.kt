package com.yagmurerdogan.problem_1_twosum

/*
    --- What is HashMap? ---

    val name = mutableMapOf<Key,Value>("Key1" to "Value", "Key2" to "Value2")

    * We can read and write mutableMapOf and HashMap but we can only read mapOf.


 */

class Student(var no: Int, var name: String, var className: String) {}


fun main() {
    //   ******** Exercise 1 ********

    val student1 = Student(1, "Yağmur", "12/C")
    val student2 = Student(2, "Ela", "11/A")
    val student3 = Student(3, "Gizem", "9/D")

    val students = HashMap<Int, Student>()
    students[student1.no] = student1
    students[student2.no] = student2
    students[student3.no] = student3

    for ((studentNo, studentObject) in students) {
        println("*************")
        println("Student No: $studentNo")
        println("Student Name: ${studentObject.name}")
        println("Student Class Name: ${studentObject.className}")
    }

    /*
            Output

        *************
        Student No: 1
        Student Name: Yağmur
        Student Class Name: 12/C
        *************
        Student No: 2
        Student Name: Ela
        Student Class Name: 11/A
        *************
        Student No: 3
        Student Name: Gizem
        Student Class Name: 9/D

     */


    //   ******** Exercise 2 ********

    val numbers = mapOf<Int, String>(1 to "one", 2 to "two")

    val fruits = mutableMapOf<String, String>("Red" to "Apple", "Yellow" to "Banana")

    val countries = HashMap<String, Int>()

    countries["Turkey"] = 1 //put method
    countries["Korea"] = 2

    println(countries.toString())
    //output -> {Turkey=1, Korea=2}

    println(countries["Turkey"]) //get method
    //output -> 1

    println(countries.containsKey("USA"))
    //output -> false

    println(countries.containsValue(3))
    //output -> false

}

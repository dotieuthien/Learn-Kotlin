package classes
import classes.Course

interface CourseRepository {
    val isCoursePersisted: Boolean
    fun getById(id: Int): Course
    fun save(course: Course): Int {
        println("course: $course")
        return course.id
    }
}

interface Repository {
    fun getAll(): Any
}

class SqlCourseRepository : CourseRepository, Repository{
    override val isCoursePersisted: Boolean
        get() = TODO()
    override fun getById(id: Int): Course {
        return Course(id, "SQL Course", "ABC")
    }

    override fun getAll(): Any {
        return 1
    }
}

class NoSqlCourseRepository: CourseRepository{
    override val isCoursePersisted: Boolean
        get() = TODO()
    override fun getById(id: Int): Course {
        return Course(id, "SQL Course", "ABC")
    }

    override fun save(course: Course): Int {
        println("course in NoSqlCourseRepository: $course")
        return course.id
    }
}

interface A {
    fun doSomething() {
        println("doSomething in A")
    }
}

interface B {
    fun doSomething() {
        println("doSomething in B")
    }
}

class AB: A, B {
    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
    }

    fun additionalFunction() {
        super<A>.doSomething()
        super<B>.doSomething()
    }
}

fun main() {
    val SqlCourseRepository = SqlCourseRepository()
    val course = SqlCourseRepository.getById(2)
    println("Course is: $course")
    val courseId = SqlCourseRepository.save(Course(5, "SQL Course", "ABC"))
    println("Saved Id is: $courseId")

    val noSqlCourseRepository = NoSqlCourseRepository()
    val course1 = noSqlCourseRepository.getById(2)
    println("Course is: $course1")
    val noSQLCourseId = noSqlCourseRepository.save(Course(6, "SQL Course", "ABC"))
    println("Saved Id in noSqlCourseRepository is: $noSQLCourseId")

    val ab = AB()
    ab.doSomething()
    ab.additionalFunction()
}
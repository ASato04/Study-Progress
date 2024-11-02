package kotli1.com.study.classes.base

abstract class Animal {
    abstract var life:Int
    abstract var pow:Int
    abstract var atk:Int
    abstract val animal:String
    abstract val sound:String
    abstract val inventory:Array<String>
    fun makesound(){
        println("$animal says $sound")
    }
}


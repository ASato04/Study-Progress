package kotli1.com.study.classes.first

import kotli1.com.study.classes.base.Animal

open class Fox (): Animal() {
    override val animal = "Alex"
    override var atk= 5
    override var life = 60
    override var pow = 10
    override val sound="Ring-ding-ding-ding-dingeringeding!"
    override val inventory: Array<String> = arrayOf("Health Potion","Fur")
}
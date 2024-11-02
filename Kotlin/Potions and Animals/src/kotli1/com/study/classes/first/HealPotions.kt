package kotli1.com.study.classes.first

import kotli1.com.study.classes.base.Animal
import kotli1.com.study.classes.base.Items

class HealPotions(val lifeP:Int): Items {
    override val id = "Heal_Potion"
    override fun use(charAnimal: Animal) {
        charAnimal.life += lifeP
    }
}


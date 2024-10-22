val song = """Dog goes woof
Cat goes meow
Bird goes tweet
And mouse goes squeek

Cow goes moo
Frog goes croak
And the elephant goes toot

Ducks say quack
And fish go blub
And the seal goes ow ow ow

But there’s one sound
That no one knows
What does the fox say?

Ring-ding-ding-ding-dingeringeding!
Gering-ding-ding-ding-dingeringeding!
Gering-ding-ding-ding-dingeringeding!
What the fox say?

Wa-pa-pa-pa-pa-pa-pow!
Wa-pa-pa-pa-pa-pa-pow!
Wa-pa-pa-pa-pa-pa-pow!
What the fox say?

Hatee-hatee-hatee-ho!
Hatee-hatee-hatee-ho!
Hatee-hatee-hatee-ho!
What the fox say?

Joff-tchoff-tchoffo-tchoffo-tchoff!
Tchoff-tchoff-tchoffo-tchoffo-tchoff!
Joff-tchoff-tchoffo-tchoffo-tchoff!
What the fox say?

Big blue eyes
Pointy nose
Chasing mice
And digging holes

Tiny paws
Up the hill
Suddenly you’re standing still

Your fur is red
So beautiful
Like an angel in disguise

But if you meet
A friendly horse
Will you communicate by
Mo-o-o-o-orse?
Mo-o-o-o-orse?
Mo-o-o-o-orse?

How will you speak to that
Ho-o-o-o-orse?
Ho-o-o-o-orse?
Ho-o-o-o-orse?
What does the fox say?

Jacha-chacha-chacha-chow!
Chacha-chacha-chacha-chow!
Chacha-chacha-chacha-chow!
What the fox say?

Fraka-kaka-kaka-kaka-kow!
Fraka-kaka-kaka-kaka-kow!
Fraka-kaka-kaka-kaka-kow!
What the fox say?

A-hee-ahee ha-hee!
A-hee-ahee ha-hee!
A-hee-ahee ha-hee!
What the fox say?

A-oo-oo-oo-ooo!
Woo-oo-oo-ooo!
What does the fox say?

The secret of the fox
Ancient mystery
Somewhere deep in the woods
I know you’re hiding
What is your sound?
Will we ever know?
Will always be a mystery
What do you say?

You’re my guardian angel
Hiding in the woods
What is your sound?

(Fox sings)
Wa-wa-way-do wub-wid-bid-dum-way-do wa-wa-way-do

Will we ever know?

(Fox sings)
Bay-budabud-dum-bam

I want to

(Fox sings)
Mama-dum-day-do

I want to
I want to know!

(Fox sings)
Abay-ba-da bum-bum bay-do"""

val UneditedOtherAnimals = song.slice(0 ..< song.indexOf("But there’s one sound"))
val formattingOtherAnimals = UneditedOtherAnimals.replace(Regex("The|the|And|and"),"")
    .replace(Regex("  +"), "")
    .replace(Regex("say |go "),"goes ")
    .replace(Regex("^ +",RegexOption.MULTILINE),"")
    .replace(Regex("^.",RegexOption.MULTILINE)){it.value.uppercase()}
    .replace(Regex("\n\n+"),"\n")

val rollnum = 0
val listOfSounds = ( formattingOtherAnimals.split(Regex("\n"))).toTypedArray()

fun turnIntoMap(rolln:Int,arrayan:Array<Pair<String,String>>):Map<String,String>{
    val (x,y)= listOfSounds[rolln].split(" goes ")
    val z = Pair<String,String>(x,y)
    return if (rolln == listOfSounds.size-2){(arrayan+z).toMap()}
    else turnIntoMap(rolln+1,arrayan+z)
}

val foxSounds = song.slice(song.indexOf("What does the fox say?")..<song.length)

val foxSoundsArray:Array<String> = foxSounds
    .replace(foxSounds.substring((foxSounds.indexOf("The secret of the fox"))..<(foxSounds.indexOf("(Fox sings)"))),"")

    .replace(foxSounds.substring((foxSounds.indexOf("Big blue"))..
            (foxSounds.indexOf("se?\nWhat"))+2),"")

    .replace(Regex("What does the fox say\\?|What the fox say\\?|I want to|" +
            " know!|Will we ever know\\?|\\(Fox sings\\)"),"")

    .replace(Regex("\n+"),"\n")

    .split("\n").toTypedArray()


fun main(){
    println(foxSoundsArray::class.simpleName+ foxSoundsArray.size)
    val animalsMap = turnIntoMap(rollnum, emptyArray())
    println("type an animal name to check his sound")

    fun mainl(numfox:Int):Any?{
        val x = readln()
        return if(animalsMap.containsKey(x)){println(animalsMap[x]);mainl(numfox)}
        else if (x == "Fox"){println(foxSoundsArray[numfox]);mainl(numfox+1)}
        else{
            println("Hoi!")
        }

    }
    mainl(1)
}

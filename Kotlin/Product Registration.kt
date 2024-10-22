var registrationBase:Array<Pair<String,Float>> = arrayOf()


fun inputProducts (registration:Array<Pair<String,Float>>):Array<Pair<String,Float>> {
    println("'stop' for exit")
    val name = readln()
    return if (name == "stop") {
        registration
        }

    else{
    val price = readln().toFloat()
    val productAndPrice = Pair(name, price)

    inputProducts(registration + productAndPrice)
    }}



fun main (){
    val x:Array<Pair<String,Float>> =(inputProducts(registrationBase))
    x.forEach { (product, price) ->
        println("Produto: $product, Preço: $price")
    }}


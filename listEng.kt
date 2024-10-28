import java.io.File

val x = "Eu estava ansioso para comer no novo restaurante, mas estava fechado  nton I was looking forward to eating at the new restaurant, but it was closed.  \n" +
        "\n" +
        "Ele é viciado em assistir TV  nton He is addicted to watching TV - to what  \n" +
        "\n" +
        "Ele quer o direito de portar armas  nton He wants the right to bear arms - what  \n" +
        "\n" +
        "I prefiro ficar em casa  nton I would rather stay home. - not to stay (After verbal idioms would rather and had better there is no to)  \n" +
        "\n" +
        "O filme foi razoavelmente bom  nton The film was rather good  \n" +
        "\n" +
        "Não foi barato, pelo contrário caro.  nton It wasn't cheap, rather expensive  \n" +
        "\n" +
        "Meu hobby é escrever  nton My hobby is writing  \n" +
        "\n" +
        "Nós partimos cedo de manhã:  nton We set out early in the morning. - início de uma fornada/missão  \n" +
        "\n" +
        "We left early in the morning  nton We went out early in the morning - partir sem um motivo importante-específico  \n" +
        "\n" +
        "Nos foi contada a notícia  nton We were told the news  \n" +
        "\n" +
        "A notícia nos foi contada  nton The news was told to us  \n" +
        "\n" +
        "Um premio foi dado a ele  nton A prize was given to him  \n" +
        "\n" +
        "Jornais são vendidos no trem?  nton Are newspapers sold on the train?  \n" +
        "\n" +
        "Ela sugeriu ir ao cinema  nton Whe suggested going to the movies  \n" +
        "\n" +
        "Ele teve o telhado arrumado essa manhã  nton He had the roof fixed this morning / he had the roof repaired this morning  \n" +
        "\n" +
        "Eu tenho meu cabelo cortado todo mês  nton I have my hair cut every month \n"

var edited = x.replace(Regex("\n+"),"\n")
    .replace(Regex(" +")," ")
    .replace(Regex(" \n"),"\n")
    .replace(Regex("^.",RegexOption.MULTILINE)){"\""+it.value}
    .replace(Regex("\n",RegexOption.MULTILINE)){"\""+it.value}
    .replace(Regex(" nton ")){"\""+it.value+"\""}


val a:MutableList<String> = mutableListOf()

fun e(){ while(edited != ""){
    val itemL = edited.slice(0..edited.indexOf("\n"))
    val itemk = itemL.split(" nton ")
    a.add(itemk[0])
    a.add(itemk[1])
    edited = edited.replace(itemL,"")
}}


val nome = "lista.txt"


fun main(){
    e()
    println(a.toString())
    File(nome).bufferedWriter().use { writer ->
        writer.write(a.toString())}
}

////////////////////////////////////
// Equipo 3  entrega:01/04/2024   //
// Aguilar Matías Agustín         //
// Eliseo Nisias Marin Navarro    //
// John Harley Llanes Escobar     //
////////////////////////////////////

import kotlin.random.Random
import kotlin.random.nextInt

data class Pregunta(
    val question: String,
    var options: MutableList<String>,
    val answer: String
)
//**** Validar Entrada de datos ****//
fun esTexto(cadena: String): Boolean {
    return cadena.matches(Regex("^[a-zA-Z ]+\$"))
}

fun validarValorNro(limiteNumero:Float): Int {
    var dato = 0F
    var resp = 0
    try {
        dato = readln().toFloat()
        if (dato>limiteNumero){
            throw NumberFormatException("El valor esta por fuera del permitido")
        }
        resp = dato.toInt()
    } catch (ex: NumberFormatException) {
        println("Error al ingresar el dato.")
        validarValorNro(limiteNumero)
    }
    return resp
}

fun validarValorText():String{
    var texto=""
    texto= readln()
    while(texto.isEmpty() ){
        println("Error al ingresar el dato")
        texto= readln()
    }
    return  texto
}

fun validarValorSoloText():String{
    var texto=""
    texto= readln()
    while(texto.isEmpty() || esTexto(texto)==false){
        println("Error al ingresar el dato")
        println("Por favor solo ingresar letras")
        texto= readln()
    }
    return  texto
}

fun validarOpciones(opciones:List<String>):String{
    var texto=validarValorText().toUpperCase()
    while(texto !in opciones){
        println("Opcion no valida")
        texto=validarValorText().toUpperCase()
    }
    return texto
}
//**** Fin Validar Entrada de datos ****//

//****Codigo Partida ****//
fun cargarPreguntas(): MutableList<Pregunta> {
    val listaPreguntas: MutableList<Pregunta> = mutableListOf()


    listaPreguntas.add(Pregunta(
        "¿Cuál es el río más largo del mundo?",
        mutableListOf("Nilo", "Amazonas", "Mississippi", "Yangtsé"),
        "Amazonas"
    ))


    listaPreguntas.add(Pregunta(
        "¿Cuál es el metal más caro?",
        mutableListOf("Oro", "Platino", "Rodio", "Paladio"),
        "Rodio"
    ))


    listaPreguntas.add(Pregunta(
        "¿Quién escribió la obra 'Romeo y Julieta'?",
        mutableListOf("William Shakespeare", "Charles Dickens", "Jane Austen", "Fyodor Dostoevsky"),
        "William Shakespeare"
    ))


    listaPreguntas.add(Pregunta(
        "¿Cuál es el país más grande del mundo por área terrestre?",
        mutableListOf("China", "Estados Unidos", "Canadá", "Rusia"),
        "Rusia"
    ))


    listaPreguntas.add(Pregunta(
        "¿Qué elemento químico tiene el símbolo 'Fe'?",
        mutableListOf("Hierro", "Oxígeno", "Carbono", "Plata"),
        "Hierro"
    ))


    listaPreguntas.add(Pregunta(
        "¿En qué año comenzó la Segunda Guerra Mundial?",
        mutableListOf( "1941","1939", "1943", "1945"),
        "1939"
    ))


    listaPreguntas.add(Pregunta(
        "¿Cuál es el planeta más grande del sistema solar?",
        mutableListOf( "Saturno", "Neptuno", "Urano","Júpiter",),
        "Júpiter"
    ))


    listaPreguntas.add(Pregunta(
        "¿Qué artista pintó 'La última cena'?",
        mutableListOf( "Pablo Picasso", "Vincent van Gogh","Leonardo da Vinci", "Michelangelo"),
        "Leonardo da Vinci"
    ))


    listaPreguntas.add(Pregunta(
        "¿Cuál es el océano más grande del mundo?",
        mutableListOf( "Atlántico","Pacífico", "Índico", "Antártico"),
        "Pacífico"
    ))


    listaPreguntas.add(Pregunta(
        "¿Quién fue el primer presidente de los Estados Unidos?",
        mutableListOf( "Thomas Jefferson", "Abraham Lincoln", "John Adams","George Washington",),
        "George Washington"
    ))


    listaPreguntas.add(Pregunta(
        "¿Cuál es el animal más grande del mundo?",
        mutableListOf( "Elefante africano", "Dinosaurio","Ballena azul", "Jirafa"),
        "Ballena azul"
    ))


    listaPreguntas.add(Pregunta(
        "¿Quién escribió 'Cien años de soledad'?",
        mutableListOf( "Mario Vargas Llosa","Gabriel García Márquez", "Jorge Luis Borges", "Pablo Neruda"),
        "Gabriel García Márquez"
    ))


    listaPreguntas.add(Pregunta(
        "¿Cuál es el metal más liviano?",
        mutableListOf( "Aluminio", "Plomo","Litio", "Titanio"),
        "Litio"
    ))


    listaPreguntas.add(Pregunta(
        "¿Quién fue el primer ser humano en viajar al espacio?",
        mutableListOf( "Neil Armstrong", "Buzz Aldrin", "Alan Shepard","Yuri Gagarin",),
        "Yuri Gagarin"
    ))


    listaPreguntas.add(Pregunta(
        "¿Cuál es la capital de Francia?",
        mutableListOf( "Londres", "Berlín", "Madrid","París"),
        "París"
    ))


    listaPreguntas.add(Pregunta(
        "¿Cuál es el país más poblado del mundo?",
        mutableListOf("China", "India", "Estados Unidos", "Indonesia"),
        "China"
    ))


    listaPreguntas.add(Pregunta(
        "¿Cuál es el hueso más largo del cuerpo humano?",
        mutableListOf( "Tibia", "Radio", "Húmero","Fémur"),
        "Fémur"
    ))


    listaPreguntas.add(Pregunta(
        "¿En qué continente se encuentra el desierto del Sahara?",
        mutableListOf( "Asia","África", "América", "Europa"),
        "África"
    ))


    listaPreguntas.add(Pregunta(
        "¿Quién escribió 'El Quijote'?",
        mutableListOf( "Federico García Lorca", "Jorge Luis Borges","Miguel de Cervantes", "Pablo Neruda"),
        "Miguel de Cervantes"
    ))


    listaPreguntas.add(Pregunta(
        "¿Cuál es el primer elemento de la tabla periódica?",
        mutableListOf("Helio", "Litio", "Berilio","Hidrógeno",),
        "Hidrógeno"
    ))


    listaPreguntas.add(Pregunta(
        "¿Quién pintó la Mona Lisa?",
        mutableListOf( "Pablo Picasso", "Vincent van Gogh", "Michelangelo","Leonardo da Vinci"),
        "Leonardo da Vinci"
    ))
    Pregunta(
        "¿Cuál es la montaña más alta del mundo?",
        mutableListOf( "Monte Kilimanjaro","Monte Everest", "Monte McKinley", "Monte Aconcagua"),
        "Monte Everest"
    )
    Pregunta(
        "¿Cuál es el hueso más pequeño del cuerpo humano?",
        mutableListOf( "Falange", "Vértebra","Estribo", "Hueso nasal"),
        "Estribo"
    )
    Pregunta(
        "¿En qué país se encuentra la Gran Muralla China?",
        mutableListOf("China", "Japón", "Corea del Sur", "Mongolia"),
        "China"
    )
    Pregunta(
        "¿Quién fue el autor de la teoría de la relatividad?",
        mutableListOf( "Isaac Newton", "Galileo Galilei", "Stephen Hawking","Albert Einstein"),
        "Albert Einstein"
    )


    Pregunta(
        "¿Cuál es el número atómico del oxígeno?",
        mutableListOf( "6", "10","8", "12"),
        "8"
    )
    Pregunta(
        "¿Quién fue el primer hombre en pisar la Luna?",
        mutableListOf( "Buzz Aldrin","Neil Armstrong", "Yuri Gagarin", "Alan Shepard"),
        "Neil Armstrong"
    )
    Pregunta(
        "¿Cuál es la capital de Italia?",
        mutableListOf( "Milán","Roma", "Nápoles", "Florencia"),
        "Roma"
    )
    Pregunta(
        "¿Quién escribió 'Harry Potter'?",
        mutableListOf( "Stephen King", "George R.R. Martin", "J.R.R. Tolkien","J.K. Rowling"),
        "J.K. Rowling"
    )
    Pregunta(
        "¿Cuál es la moneda oficial de Japón?",
        mutableListOf( "Dólar", "Euro", "Libra esterlina","Yen"),
        "Yen"
    )
    Pregunta(
        "¿Quién fue el primer presidente de México?",
        mutableListOf( "Benito Juárez","Guadalupe Victoria", "Miguel Hidalgo", "Porfirio Díaz"),
        "Guadalupe Victoria"
    )
    Pregunta(
        "¿Cuál es el océano más pequeño del mundo?",
        mutableListOf("Océano Ártico", "Océano Antártico", "Océano Índico", "Océano Pacífico"),
        "Océano Ártico"
    )
    Pregunta(
        "¿En qué año cayó el muro de Berlín?",
        mutableListOf( "1991", "1987","1989", "1993"),
        "1989"
    )
    Pregunta(
        "¿Cuál es la capital de España?",
        mutableListOf( "Barcelona", "Valencia", "Sevilla","Madrid"),
        "Madrid"
    )
    Pregunta(
        "¿Quién fue el primer emperador romano?",
        mutableListOf( "Julio César","César Augusto", "Nerón", "Trajano"),
        "César Augusto"
    )
    Pregunta(
        "¿Cuál es el país más pequeño del mundo?",
        mutableListOf("Mónaco","Ciudad del Vaticano", "Nauru", "San Marino"),
        "Ciudad del Vaticano"
    )
    Pregunta(
        "¿Quién pintó 'La noche estrellada'?",
        mutableListOf("Pablo Picasso", "Claude Monet","Vincent van Gogh", "Leonardo da Vinci"),
        "Vincent van Gogh"
    )
    Pregunta(
        "¿Cuál es el proceso natural que produce la lluvia ácida?",
        mutableListOf( "Actividad volcánica", "Liberación de clorofluorocarbonos", "Contaminación lumínica","Combustión de combustibles fósiles"),
        "Combustión de combustibles fósiles"
    )
    Pregunta(
        "¿En qué año comenzó la Primera Guerra Mundial?",
        mutableListOf("1914", "1916", "1918", "1920"),
        "1914"
    )
    Pregunta(
        "¿Cuál es el animal más rápido del mundo?",
        mutableListOf("León", "Aguila", "Tortuga","Guepardo"),
        "Guepardo"
    )
    Pregunta(
        "¿Qué instrumento musical tocaba el famoso compositor Mozart?",
        mutableListOf( "Violín","Piano", "Cello", "Flauta"),
        "Piano")


    Pregunta(
        "¿Qué instrumento musical tocaba el famoso compositor Mozart?",
        mutableListOf("Piano", "Violín", "Cello", "Flauta"),
        "Piano"
    )
    Pregunta(
        "¿Cuál es la distancia aproximada entre la Tierra y la Luna?",
        mutableListOf( "300,000 kilómetros","384,400 kilómetros", "450,000 kilómetros", "500,000 kilómetros"),
        "384,400 kilómetros"
    )
    Pregunta(
        "¿Quién escribió 'La Odisea'?",
        mutableListOf( "Sófocles", "Eurípides", "Esquilo","Homero"),
        "Homero"
    )
    Pregunta(
        "¿Cuál es el punto más alto de la Tierra?",
        mutableListOf( "Monte Kilimanjaro", "Monte Aconcagua", "Monte Fuji","Monte Everest"),
        "Monte Everest"
    )
    Pregunta(
        "¿Quién descubrió América?",
        mutableListOf( "Amerigo Vespucci", "Fernando de Magallanes","Cristóbal Colón", "Vasco Núñez de Balboa"),
        "Cristóbal Colón"
    )
    Pregunta(
        "¿Cuál es el país con más islas del mundo?",
        mutableListOf("Suecia", "Filipinas", "Indonesia", "Japón"),
        "Indonesia"
    )


    return listaPreguntas
}

fun revolverPreguntas(opciones:MutableList<String>):MutableList<String>{
    val random =Random.nextInt(1..3)
    for (i in 0..random){
        if(i+1<=3){
            var aux=opciones[i]
            opciones[i]=opciones[i+1]
            opciones[i+1]=aux
        }
    }

    return opciones
}

fun preguntarPublic(opciones:MutableList<String>){
    val listaRespuestaCuatroOpciones = mutableListOf(
        mutableListOf("75%", "10%", "15%", "0%"),
        mutableListOf("5%", "90%", "3%", "2%"),
        mutableListOf("15%", "20%", "5%", "60%"),
        mutableListOf("7%", "15%", "3%", "75%"),
        mutableListOf("10%", "2%", "3%", "85%"),
        mutableListOf("20%", "15%", "5%", "60%"),
    )
    val listaRespuestaDosOpciones = mutableListOf(
        mutableListOf("80%", "20%"),
        mutableListOf("70%", "30%"),
        mutableListOf("85%", "15%"),
        mutableListOf("30%","70%"),
        mutableListOf("40%",  "60%"),
        mutableListOf("10%",  "90%"),
    )
    val random =Random.nextInt(0..5)
    marcoSimple {
        println("El publico a votado y este es el resultado:")
    }

    for (i in 0..opciones.size-1){
        marcotitle(opciones.get(i)+" "+if(opciones.size==2) listaRespuestaDosOpciones[random][i] else listaRespuestaCuatroOpciones[random][i])
    }
    sistemPause()

}

fun comodinLlamarAmigo(opciones:MutableList<String>){
    val random =Random.nextInt(0..opciones.size-1)
    marcoSimple {
        println("Llamando a amigo...")
    }
    sistemPause()
    marcoSimple {
        println("Amigo:Creo que la opcion ganadora es "+opciones.get(random))
    }
}

fun cincuentaCincuenta(pregunta: Pregunta,opciones:MutableList<String>,mostrar:MutableList<String>): MutableList<String> {
    var nuevaLista:MutableList<String> = mutableListOf()
    for (i in mostrar){
        if(gano(pregunta,opciones,i.split(":")[0])==1){
            var auxPost=mostrar.indexOf(i)
            if(auxPost+1<=3){
                nuevaLista.add(mostrar.get(auxPost))
                nuevaLista.add(mostrar.get(auxPost+1))
            } else{
                nuevaLista.add(mostrar.get(auxPost-1))
                nuevaLista.add(mostrar.get(auxPost))
            }

            break
        }
    }
    return nuevaLista
}

fun mostrarPregunta(preguntasAmostrar:MutableList<String>, comodin: MutableList<String>){
    for (i in preguntasAmostrar){
        marcoSimple {
            marcotitle(i)
        }
    }
    if(comodin.size>0) marcoSimple{ marcotitle("E: Usar comodin")}
}

fun gano(pregunta: Pregunta,respuesta : List<String>,resp:String):Int{
    return if(pregunta.options.get(respuesta.indexOf(resp)) == pregunta.answer) 1 else 0
}

fun hacerPregunta(pregunta: Pregunta,comodin:MutableList<String>):Int{
    var respuesta : MutableList<String> = if(comodin.size>0) mutableListOf("A","B","C","D","E") else mutableListOf("A","B","C","D")
    var preguntasAmostrar:MutableList<String> = mutableListOf()
    for (i in 0..3){
        preguntasAmostrar.add(respuesta[i]+": "+pregunta.options[i])
    }
    var respuestaComodin : MutableList<String> = comodin.map {
        it.split(":")[0]
    }.toMutableList()
    var resp =""
    var respComodin=""
    do{
        if (resp=="E"){
            marcoSimple { println("¿Cual comodin va a usar?") }
            for( i in comodin){
                marcotitle(i)
            }
            respComodin = validarOpciones(respuestaComodin)
            when(respComodin){
                "1"->{
                    preguntasAmostrar=cincuentaCincuenta(pregunta,respuesta,preguntasAmostrar)
                    respuesta= preguntasAmostrar.map{
                        it.split(":")[0]
                    }.toMutableList()
                    comodin.remove("1:Cincuenta por ciento (50:50)")
                    respuestaComodin.remove("1")
                    if (comodin.size>0) respuesta.add("E")
                }
                "2"->{
                    preguntarPublic(preguntasAmostrar)
                    respuestaComodin.remove("2")
                    comodin.remove("2:Preguntar al público")
                }
                "3"->{
                    comodinLlamarAmigo(preguntasAmostrar)
                    respuestaComodin.remove("3")
                    comodin.remove("3:Llamar a un amigo")
                }
                "4"->{
                    respuestaComodin.remove("4")
                    comodin.remove("4:Cambio de pregunta")
                    return 2
                }
            }
            if(comodin.size==0) respuesta.remove("E")
        }
        marcoSimple { println(pregunta.question) }
        mostrarPregunta(preguntasAmostrar,comodin)
        resp = validarOpciones(respuesta)
    }while(resp=="E")
    return if(preguntasAmostrar.contains(resp+": "+pregunta.answer)) 1 else 0
}

fun nuevoJuego(){
    var respuesta : List<String> = listOf("SI","NO")
    var comodin : MutableList<String> = mutableListOf(
        "1:Cincuenta por ciento (50:50)",
        "2:Preguntar al público",
        "3:Llamar a un amigo",
        "4:Cambio de pregunta"
    )
    var listaPreguntasTotal=cargarPreguntas()
    val listaPreguntasRevueltas: MutableList<Pregunta> = mutableListOf()

    while(listaPreguntasRevueltas.size != 11){
        var pregunta = listaPreguntasTotal.random()
        if(pregunta !in  listaPreguntasRevueltas ){
            pregunta.options = revolverPreguntas(pregunta.options)
            listaPreguntasRevueltas.add(pregunta)
        }
    }

    marcoSimple {
        println("Primero Registra tus datos")
    }

    marcotitleSimple("Nombre y Apellidos: ")
    var nombre= validarValorSoloText()

    marcotitleSimple("Ingrese su DNI: ")
    var DNI = validarValorNro(99999999F)

    marcotitleSimple("Ingrese tu Nacionalidad: ")
    var pais = validarValorSoloText()

    marcotitleSimple("Desea Iniciar las preguntas: si/no")
    var confim = validarOpciones(respuesta)

    if(confim.equals("SI")){
        var num=1
        var i=0
        var totalPuntos=0
        while(num!=0 && i<listaPreguntasRevueltas.size){
            var pregunta =listaPreguntasRevueltas.get(i)
            num=hacerPregunta(pregunta,comodin)
            var monto=""
            when(num){
                0 ->{
                    marcotitleSimple("Incorrecto respuesta correcta es ${pregunta.answer}")
                    marcotitleSimple("Gracias por participar")
                    totalPuntos=0
                }
                1 ->{
                    marcotitleSimple("Correcto la respuesa corracta es ${pregunta.answer}")
                    totalPuntos++
                    monto=(1000000*totalPuntos).toString()
                    println("A ganado:1000000")
                    println("Total en Juego:${monto}")
                }
                2 ->{
                    marcotitleSimple("Cambiando de pregunta...")
                    sistemPause()
                }
            }
            if(totalPuntos>0 && totalPuntos==5){
                println("Si se retira ahora puede llevarse ${monto}, si no tendra que acertar hasta la ultima pregunta")
                println("¿Quiere retirarse? si/no?")
                confim = validarOpciones(respuesta)
                if(confim=="SI"){
                    num=0
                    marcotitleSimple("Gracias por participar a ganador ${monto}")
                    sistemPause()
                }else{
                    marcotitleSimple("Un aplazo para el concursante ${nombre} va por el todo!!!")
                    sistemPause()
                }
            }
            i++
        }
        if(i>=10 && totalPuntos>0){
            sistemPause()
            mostrarCopa()
            marcoSimple {
                println("Felicidades "+ color("YELLOW")+ nombre+ color("RESET")+" has ganado :D")
            }
        }
    }

}
//****Fin Codigo Partida ****//

fun intruciones(){
    marcoSimple {
        println("Reglas del juego")
    }
    marcotitle("Descripción")
    println("Juego basado en el concurso de TV ¿Quién \nquiere ser millonario?, consistente en \nresponder a 10 preguntas que se presentan\n secuencialmente con la ayuda de varios\n comodines.")
    sistemPause()
    marcotitle("Mecánica")
    println("Se presentarán preguntas con 4 opciones \nde respuesta, hasta un máximo de 10. Para \nresponder se podrá establecer tiempo o no.")
    println("El jugador dispondrá de cuatro comodines \nque podrá utilizar una sola vez a lo largo \nde la partida, que son: llamada, público,\n 50% y tiempo extra.")
    println("Tras formularse cada pregunta el jugador\n podrá contestar o plantarse. Por cada\n respuesta correcta se ganarán puntos,\n asegurándose los puntos conseguidos \nen las preguntas 3 y 6. Si se falla \na una pregunta el jugador quedará \neliminado con los puntos que haya \npodido asegurar hasta el momento. \nSi se planta conservará los puntos \nconseguidos hasta la última respuesta \nacertada.")
    sistemPause()
    marcotitle("Objetivo")
    println("Acertar 10 preguntas o en su defecto \nconseguir la máxima puntuación.")
    sistemPause()
}

fun color(code: String): String {
    return when(code) {
        "RESET" -> "\u001b[0m"
        "BLACK" -> "\u001b[0;30m"
        "RED" -> "\u001b[0;31m"
        "GREEN" -> "\u001b[0;32m"
        "YELLOW" -> "\u001b[0;33m"
        "BLUE" -> "\u001b[0;34m"
        "MAGENTA" -> "\u001b[0;35m"
        "CYAN" -> "\u001b[0;36m"
        "WHITE" -> "\u001b[0;37m"
        "BLACK_BOLD" -> "\u001b[1;30m"
        "RED_BOLD" -> "\u001b[1;31m"
        "GREEN_BOLD" -> "\u001b[1;32m"
        "YELLOW_BOLD" -> "\u001b[1;33m"
        "BLUE_BOLD" -> "\u001b[1;34m"
        "MAGENTA_BOLD" -> "\u001b[1;35m"
        "CYAN_BOLD" -> "\u001b[1;36m"
        "WHITE_BOLD" -> "\u001b[1;37m"
        "BLACK_UNDERLINED" -> "\u001b[4;30m"
        "RED_UNDERLINED" -> "\u001b[4;31m"
        "GREEN_UNDERLINED" -> "\u001b[4;32m"
        "YELLOW_UNDERLINED" -> "\u001b[4;33m"
        "BLUE_UNDERLINED" -> "\u001b[4;34m"
        "MAGENTA_UNDERLINED" -> "\u001b[4;35m"
        "CYAN_UNDERLINED" -> "\u001b[4;36m"
        "WHITE_UNDERLINED" -> "\u001b[4;37m"
        "BLACK_BACKGROUND" -> "\u001b[40m"
        "RED_BACKGROUND" -> "\u001b[41m"
        "GREEN_BACKGROUND" -> "\u001b[42m"
        "YELLOW_BACKGROUND" -> "\u001b[43m"
        "BLUE_BACKGROUND" -> "\u001b[44m"
        "MAGENTA_BACKGROUND" -> "\u001b[45m"
        "CYAN_BACKGROUND" -> "\u001b[46m"
        "WHITE_BACKGROUND" -> "\u001b[47m"
        "BLACK_BRIGHT" -> "\u001b[0;90m"
        "RED_BRIGHT" -> "\u001b[0;91m"
        "GREEN_BRIGHT" -> "\u001b[0;92m"
        "YELLOW_BRIGHT" -> "\u001b[0;93m"
        "BLUE_BRIGHT" -> "\u001b[0;94m"
        "MAGENTA_BRIGHT" -> "\u001b[0;95m"
        "CYAN_BRIGHT" -> "\u001b[0;96m"
        "WHITE_BRIGHT" -> "\u001b[0;97m"
        "BLACK_BOLD_BRIGHT" -> "\u001b[1;90m"
        "RED_BOLD_BRIGHT" -> "\u001b[1;91m"
        "GREEN_BOLD_BRIGHT" -> "\u001b[1;92m"
        "YELLOW_BOLD_BRIGHT" -> "\u001b[1;93m"
        "BLUE_BOLD_BRIGHT" -> "\u001b[1;94m"
        "MAGENTA_BOLD_BRIGHT" -> "\u001b[1;95m"
        "CYAN_BOLD_BRIGHT" -> "\u001b[1;96m"
        "WHITE_BOLD_BRIGHT" -> "\u001b[1;97m"
        "BLACK_BACKGROUND_BRIGHT" -> "\u001b[0;100m"
        "RED_BACKGROUND_BRIGHT" -> "\u001b[0;101m"
        "GREEN_BACKGROUND_BRIGHT" -> "\u001b[0;102m"
        "YELLOW_BACKGROUND_BRIGHT" -> "\u001b[0;103m"
        "BLUE_BACKGROUND_BRIGHT" -> "\u001b[0;104m"
        "MAGENTA_BACKGROUND_BRIGHT" -> "\u001b[0;105m"
        "CYAN_BACKGROUND_BRIGHT" -> "\u001b[0;106m"
        "WHITE_BACKGROUND_BRIGHT" -> "\u001b[0;107m"
        else -> "" // Valor por defecto, podría ser lanzar una excepción o devolver un mensaje de error
    }
}

fun marcoJuego(callback:()->Unit){
    println("${color("YELLOW")}*${"-".repeat(40)}*")
    println("*--${" ".repeat(36)}--*${color("RESET")}")
    callback()
    println("${color("YELLOW")}*--${" ".repeat(36)}--*")
    println("*${"-".repeat(18)}2024${"-".repeat(18)}*${color("RESET")}")
}


fun marcoSimple(callback:()->Unit){
    println("${color("YELLOW")}*${"-".repeat(40)}*${color("RESET")}")
    callback()
    println("${color("YELLOW")}*${"-".repeat(40)}*${color("RESET")}")
}


fun marcotitle(title:String){
    print("${" ".repeat(8)}${color("YELLOW")}:>${color("RESET")}")
    print(title)
    println("${color("YELLOW")}<:${color("RESET")}")
}

fun marcotitleSimple(title:String){
    print("${color("YELLOW")}:>${color("RESET")}")
    print(title)
    println("${color("YELLOW")}<:${color("RESET")}")
}


fun sistemPause(){
    println("Preccione ENTER para continuar...")
    readLine()
}

fun mostrarCopa(){
    println("_______"+color("YELLOW")+"000000000000000000000"+color("RESET")+"_______ \n" +
            "________"+color("YELLOW")+"0000000000000000000"+color("RESET")+"________ \n" +
            "_________"+color("YELLOW")+"00000000000000000"+color("RESET")+"_________ \n" +
            "__________"+color("YELLOW")+"000000000000000"+color("RESET")+"__________ \n" +
            "___________"+color("YELLOW")+"0000000000000"+color("RESET")+"___________ \n" +
            "___"+color("YELLOW")+"0000____0000000000000"+color("RESET")+"____"+color("YELLOW")+"0000"+color("RESET")+"___ \n" +
            "__"+color("YELLOW")+"00"+color("RESET")+"__"+color("YELLOW")+"00"+color("RESET")+"___"+color("YELLOW")+"0000000000000"+color("RESET")+"___"+color("YELLOW")+"00"+color("RESET")+"__"+color("YELLOW")+"00"+color("RESET")+"__ \n" +
            "_"+color("YELLOW")+"00"+color("RESET")+"____"+color("YELLOW")+"00"+color("RESET")+"_"+color("YELLOW")+"000000000000000"+color("RESET")+"_"+color("YELLOW")+"00"+color("RESET")+"____"+color("YELLOW")+"00"+color("RESET")+"_ \n" +
            "_"+color("YELLOW")+"00"+color("RESET")+"______"+color("YELLOW")+"00000000000000000"+color("RESET")+"______"+color("YELLOW")+"00"+color("RESET")+"_\n" +
            "__"+color("YELLOW")+"00"+color("RESET")+"_____"+color("YELLOW")+"00000000000000000"+color("RESET")+"_____"+color("YELLOW")+"00"+color("RESET")+"__\n" +
            "___"+color("YELLOW")+"00"+color("RESET")+"___"+color("YELLOW")+"0000000000000000000"+color("RESET")+"___"+color("YELLOW")+"00"+color("RESET")+"___ \n" +
            "______"+color("YELLOW")+"00000000000000000000000"+color("RESET")+"______ \n" +
            "_______"+color("YELLOW")+"0000000000000000000000"+color("RESET")+"______ \n" +
            "________"+color("YELLOW")+"00000000000000000000"+color("RESET")+"_______ \n" +
            "_________"+color("YELLOW")+"000000000000000000"+color("RESET")+"________ \n" +
            "________________"+color("YELLOW")+"000"+color("RESET")+"________________ \n" +
            "________________"+color("YELLOW")+"000"+color("RESET")+"________________ \n" +
            "_______________"+color("YELLOW")+"00000"+color("RESET")+"_______________ \n" +
            "______________"+color("YELLOW")+"0000000"+color("RESET")+"______________ \n" +
            "______________"+color("YELLOW")+"0000000"+color("RESET")+"______________ \n" +
            "_________"+color("YELLOW")+"00000000000000000"+color("RESET")+"_________ \n" +
            "________"+color("YELLOW")+"0000000000000000000"+color("RESET")+"________ \n" +
            "________"+color("YELLOW")+"0000000000000000000"+color("RESET")+"________ \n" +
            "________"+color("YELLOW")+"0000000000000000000"+color("RESET")+"________")
}

fun main() {
    val bienvenida = "BIENVENIDOS AL JUEGO, QUIERO SER MILLONARIO"
    marcoSimple {
        println(bienvenida)
    }
    var opcion: Int=0

    do{
        marcoJuego {
            marcotitle("****** MENU ******")
            println("  1... INICIAR PÁRTIDA")
            println("  2... INSTRUCCIONES DE JUEGO")
            println("  3... SALIR DEL JUEGO")
        }
        marcoSimple {
            println("Ingrese su opción: ")
        }

        opcion = readLine()?.toIntOrNull() ?: 0

        when (opcion) {
            1 -> nuevoJuego()
            2 -> intruciones()
            3 -> println("Saliendo del juego")
            else -> println("Opción inválida. Por favor, seleccione una opción válida.")
        }

    }while(opcion!=3)
}
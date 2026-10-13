import Derivacion._

// Funciones base
val cte = (x: Double) => 2.0
val f   = (x: Double) => x * x
val g   = (x: Double) => x * x * x
val h   = (x: Double) => f(x) / g(x)
val j   = (x: Double) => g(x) / f(x)
f

// Pruebas de derivadaDiv
val h1 = derivadaDiv((x: Double) => x * x, (x: Double) => x + 1)
val h2 = derivadaDiv(f, g)
val h3 = derivadaDiv(g, f)
val h4 = derivadaDiv(g, f)

h1(1)
h2(2)
h3(2)
h4(2)

// Pruebas de derivada
derivada(cte)(5)
derivada(cte)(6)
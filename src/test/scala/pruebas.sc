import Derivacion._

// Funciones base
val cte = (x: Double) => 2.0
val ident = (x: Double) => x
val cuad = (x: Double) => x * x
val cubo = (x: Double) => x * x * x
val cuarta = (x: Double) => x * x * x * x
val quinta = (x: Double) => x * x * x * x * x
val sexta = (x: Double) => math.pow(x, 6)
val masUno = (x: Double) => x + 1
val sen = (x: Double) => math.sin(x)
val cos = (x: Double) => math.cos(x)
val raiz = (x: Double) => math.sqrt(x)

// derivada
derivada(cuad)(3)
derivada(cubo)(-1)
derivada(cuarta)(2)
derivada(sen)(0)
derivada(quinta)(2)
derivada(sexta)(1)
derivada(raiz)(4)
derivada(cte)(5)

// derivadaSuma
derivadaSuma(cuad, quinta)(4)
derivadaSuma(ident, cubo)(6)
derivadaSuma(masUno, cte)(-5)
derivadaSuma(cos, sexta)(1)
derivadaSuma(raiz, raiz)(8)

// derivadaResta
derivadaResta(cubo, cuad)(2)
derivadaResta(cuarta, cubo)(1)
derivadaResta(cuad, cuad)(7)
derivadaResta(sen, cos)(1)
derivadaResta(ident, cte)(4)

// derivadaMult
derivadaMult(sexta, quinta)(7)
derivadaMult(cubo, cte)(4)
derivadaMult(cos, cuad)(8)
derivadaMult(ident, quinta)(-2)
derivadaMult(sen, raiz)(2)

// derivadaDiv
derivadaDiv(cuad, masUno)(4)
derivadaDiv(cubo, cos)(2)
derivadaDiv(cte, sexta)(1)
derivadaDiv(cuad, ident)(0)
derivadaDiv(cte, ident)(0)


// Casos generados con ayuda de IA
val expo = (x: Double) => math.exp(x)
val ln   = (x: Double) => math.log(x)
val osc  = (x: Double) => math.sin(30 * x)

derivada(expo)(0)                 // 1
derivada(ln)(1)                   // 1
derivada(ln)(0.1)                 // NaN
derivada(osc)(0)                  // 30
derivadaSuma(expo, ln)(1)         // e + 1 ≈ 3.71828
derivadaMult(cuad, cubo)(-3)      // 405
derivadaDiv(cte, sen)(0.001)      // ≈ -1999999.67
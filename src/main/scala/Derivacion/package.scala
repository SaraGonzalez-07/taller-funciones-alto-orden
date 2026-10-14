package object Derivacion {
  /** Taller 2: Funciones de Alto Orden
   *
   * @author Margareth Sophya Gamboa Izquierdo
   * 2518629-3743
   * @author Sara Michelle González Posso
   * 2519548-3743
   *
   */
  // Ecuación de 5 puntos
  def derivada(f: Double => Double): Double => Double = {
    //Definir parametros
      val h=0.1

      (x0:Double)=> {
        (f(x0 - 2 * h) - 8 * f(x0 - h) + 8 * f(x0 + h) - f(x0 + 2 * h)) / (12 * h)
      }
  }

  // (f + g)' = f' + g'
  def derivadaSuma(f: Double => Double, g: Double => Double): Double => Double = {
    (x:Double) => derivada(f) (x) + derivada(g) (x)

  }

  // (f - g)' = f' - g'
  def derivadaResta(f: Double => Double, g: Double => Double): Double => Double = {
    (x: Double) => derivada(f)(x) - derivada(g)(x)
  }


  // (f * g)' = f' * g + f * g'
  def derivadaMult(f: Double => Double, g: Double => Double): Double => Double = {
    (x:Double) => (derivada(f) (x) * g(x))+ (f(x) * derivada(g) (x))

  }

  // (f / g)' = (f' * g - f * g') / g^2
  def derivadaDiv(f: Double => Double, g: Double => Double): Double => Double = {
    (x: Double) => (derivada(f)(x) * g(x) - f(x) * derivada(g)(x)) / (g(x) * g(x))
  }
}
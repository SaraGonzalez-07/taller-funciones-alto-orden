package object Derivation {

  def derivada(f: Double => Double): Double => Double = {
    ??? // Implementar ecuación de 5 puntos
  }

  def derivadaSuma(f: Double => Double, g: Double => Double): Double => Double = {
    ??? // (f + g)' = f' + g'
  }

  def derivadaResta(f: Double => Double, g: Double => Double): Double => Double = {
    ??? // (f - g)' = f' - g'
  }

  def derivadaMult(f: Double => Double, g: Double => Double): Double => Double = {
    ??? // (f * g)' = f' * g + f * g'
  }

  def derivadaDiv(f: Double => Double, g: Double => Double): Double => Double = {
    ??? // (f / g)' = (f' * g - f * g') / g^2
  }
}
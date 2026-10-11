package object Derivacion {

  // Ecuación de 5 puntos
  def derivada(f: Double => Double): Double => Double = {
    //Definir parametros
    def deviVarianbles (x:Duoble, h:Double): Double {
      //val c=
      //if (x=c or y=c)

      val fx = f (x)

      val h=0.1
    //Dividimos en dos derivadas
      val dev1= (f(x0)-f(x0 - h))/h
      val dev2= (f(x0 + h)-f(x0))/h
      val dev1Abs = math.abs(dev1)
      val dev2Abs = math.abs(dev2)
      val dif= (dev1Abs - dev2Abs)
      val tolerancia= 0.001


      (x0:Double)=> (f(x0 - 2*h)-8*f(x0 - h)+8*f(x0 + h)-f(x0 + 2*h))/(12*h)
    }

  }

  // (f + g)' = f' + g'
  def derivadaSuma(f: Double => Double, g: Double => Double): Double => Double = {

  }

  // (f - g)' = f' - g'
  def derivadaResta(f: Double => Double, g: Double => Double): Double => Double = {
    ???
  }

  // (f * g)' = f' * g + f * g'
  def derivadaMult(f: Double => Double, g: Double => Double): Double => Double = {

  }

  // (f / g)' = (f' * g - f * g') / g^2
  def derivadaDiv(f: Double => Double, g: Double => Double): Double => Double = {
    ???
  }
}
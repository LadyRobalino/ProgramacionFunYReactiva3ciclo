// MÉTODO 1
def greaterThan(a: Int, b: Int): Int = {
  if (a > b) a else b
}
greaterThan(2,3)


// MÉTODO 2
def radianesAgrados(rad : Double) : Double = {
  val grados = rad * (180/ math.Pi)
  grados
}
radianesAgrados(2)


// MÉTODO 3
def farenheitACelsiua(farenheit : Double): Double = {
  val celsius = (farenheit - 32) * 5 / 9
  celsius
}
farenheitACelsiua(4)


// MÉTODO 4
def eliminarVocalesAbiertas(texto : String): String = {
  val textoNew = texto.toLowerCase
    .replaceAll("a", "")
    .replaceAll("e", "")
    .replaceAll("o", "")
  textoNew
}
print (eliminarVocalesAbiertas("lalelo"))


//MÉTODO 5
def calcularAngulo(distancia : Int, velociInicial: Double): Double ={
  val g = 9.8
  val argumento = (distancia * g)/(velociInicial * velociInicial)
  val angulo = 0.5 * Math.asin(argumento)
  angulo
}
calcularAngulo(3,2.5)



// MÉTODO SUMA DE CUADRADOS
def f1(n: Int) = ((1 to n).map(i => Math.pow(i,2))).sum
f1(6)

// MÉTODO PRODUCTO ALTERNANTE DE LOS PRIMEROS
def f2(n : Int): Int = {
  (1 to n).map(i => if (i % 2 == 0) -i else i ).product
}
f2(6)

// MÉTODO SUMA DE LOS INVERSOS
def f3(n : Int): Int = {
  (1 to n).map(i => if(i % 2 == 0) -i else 0).sum
}
f3(6)


// MÉTODO PRODUCTO DE LOS PRIMEROS
def f4(n : Int): Int = {
  (1 to n).map(i => if (i % 3 == 0) i else 1).product
}
f4(5)


// MÉTODO SUMA DE SECUENCIA MULTIPLICADA POR CONSTANTE
def f5(n: Int, k: Int): Int = {
  (1 to n).map(i => i * k).sum
}
f5(6,7)
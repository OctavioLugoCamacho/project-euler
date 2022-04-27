def sum = 1000
for (int a = 1; a <= sum/3; a++) {
  for (int b = a + 1; b <= sum/2; b++)
  {
    def c = sum - a - b
    if ( (a * a) + (b * b) == (c * c) )
      println "a: ${a}, b: ${b}, c: ${c}, product: ${a * b * c}"
  }
}
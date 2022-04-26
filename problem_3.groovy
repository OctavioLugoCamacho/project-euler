long num = 600851475143L;
boolean isPrime = true;

for (int i in 2..num-1) {
  if (num % i == 0) {
    for (int j in 2..i-1) {
      if (i % j == 0) {
        isPrime = false
      }
    }
    if (isPrime) {
      println i
    }
  }
}
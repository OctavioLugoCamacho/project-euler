def primes = []
def num = 2
while(primes.size < 10001) {
  boolean flag = false
  for (int i = 2; i <= num / 2; ++i) {
    if (num % i == 0) {
      flag = true;
      break;
    }
  }

  if (!flag) {
    primes.add(num)
  }
  num++
}

println primes[primes.size - 1]
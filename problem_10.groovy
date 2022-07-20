long sum = 0
sum = (2..2000000).collect { Long n ->
  isPrime(n) ? n : 0
}.sum()
// for(long i in 2..2000000) {
// 	if(isPrime(i)) {
// 		sum += i
// 	}
// }
println sum

def boolean isPrime(long n) {
  def count = 0
  long sqrt = (long)Math.sqrt(n)

  for(long i in 1..sqrt) {
    if(n % i == 0) {
      count++
    }
    if(count > 1) {
      return false
    }
  }
  return true
}
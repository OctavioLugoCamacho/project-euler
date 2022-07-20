Long sum = (2..2000000).collect { Long n ->
  isPrime(n) ? n : 0
}.sum()
println sum

def boolean isPrime(Long n) {
  def count = 0
  for(Long i in 1..Math.sqrt(n)) {
    if(n % i == 0) count++
    if(count > 1) return false
  }
  true
}
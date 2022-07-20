Long sum = (2..2000000).collect { Long n ->
  isPrime(n) ? n : 0
}.sum()
println sum

def boolean isPrime(long n) {
  def count = 0
  Long sqrt = Math.sqrt(n)

  // count = (2..sqrt).findAll { Long i -> 
  //   i % 2 == 1
  // }.collect { Long i ->
  //   (n % i == 0) ? 1 : 0
  // }.sum()
  // !icount > 1)

  for(Long i in 1..sqrt) {
    if(n % i == 0) count++ 
    if(count > 1) {
      return false
    }
  }
  return true
}
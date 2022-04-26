for(int i = 999 * 999; i >= 100 * 100; i--) {
  if(isPalindrome(i) == true) {
    println i
    break
  }
}

static boolean isPalindrome(int x) {
  int[] bits = new int[7]
  int index = 1
  while(x > 0) {
    bits[index] = x % 10
    index++
    x /= 10
  }
  for(int i = 1; i <= index / 2; i++) {
    if(bits[i] != bits[index-i]) {
      return false
    }
  }
  return true
}
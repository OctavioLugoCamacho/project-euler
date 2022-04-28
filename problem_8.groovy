def products = []
def string = ""
def count = 0
new File("numbers.txt").eachLine {
  s -> {
    string = string + s
  }
}

while(count < string.length() - 12) {
  def numbers = []
  long num = 1
  for(int i in count..count + 12) {
    numbers.add(string[i] as Integer)
  }
  numbers.each { num *= it }
  products.add(num)
  count++
}

println products.max()
def sum = 0
def a = 1
def b = 2

while(a < 4000000) {
  if ((a & 1) == 0 ) {
    sum += a
  }
  b = a + b
  a = b - a
}

println sum
int num = 100

def sumOfSquares = (num * (num + 1)) / 2
sumOfSquares *= sumOfSquares

def squareOfSum = (num * (num + 1) * (2 * num + 1)) / 6

def difference = sumOfSquares - squareOfSum

println difference
n = int(input("Enter positive integer to find its factorial "))
fact = 1
for i in range(1, n + 1):
    fact *= i
print("<", fact, "> is the factorial of <", n, ">")
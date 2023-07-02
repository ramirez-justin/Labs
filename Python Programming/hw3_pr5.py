# Justin Ramirez   

def dynamic_programming_fibonacci(n):
    # Recursive solution (top-down)
    def fib(n):
        memo = {0: 0, 1: 1}
        def F(i):
            if i not in memo:
                memo[i] = F(i-1) + F(i-2)
            return memo[i]
        return F(n)
    return fib(n)


def fast_doubling_fibonacci(n):
    #Calculates Fibonacci number using the fast doubling method
    def fib(n):
        if n == 0:
            return (0, 1)
        else:
            a, b = fib(n // 2)
            c = a * ((b << 1) - a)
            d = a * a + b * b
            if n & 1:
                return (d, c + d)  # f2n+1
            else:
                return (c, d)  # f2n
    return fib(n)[0]

# Calculate a large Fibonacci number
#print(fast_doubling_fibonacci(50))
#print(dynamic_programming_fibonacci(50))

"""
The time complexity of the "fast doubling" 
method is O(log n), making it significantly 
faster than the dynamic programming approach 
for large inputs. The "fast doubling" method 
is more efficient because it reduces the number 
of computations by approximately half at each step, 
thanks to the "doubling" effect.
"""
def rec_sum(n):
    if n == 0:
        return 0
    else:
        return n + rec_sum(n - 1)
    


print("the sum of numbers: ", rec_sum(10))
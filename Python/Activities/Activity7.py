numbers = list(input("enter numbers to be added: ").split(","))
sum=0
for i in numbers:
    sum=sum+int(i)
print(sum)
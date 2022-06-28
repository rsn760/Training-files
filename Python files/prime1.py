a=int(input("Enter  lower range "))
b=int(input("Enter upper range "))
num=0
for num in range(a, b+1):
    if num>1:
        for i in range(2, num):
            if num%i==0:
                break
        else:
            print(num)

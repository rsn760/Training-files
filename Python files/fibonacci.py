lim=int(input("How many terms to print "))
first= 0
sec=1
count=0
if lim<=0:
    print("Enter positive integer")
elif lim==1:
    print(lim)
    print(first)
else:
    print("Fibonacci series : ")
    while count<lim:
        print(first)
        nxt=first+sec
        first=sec
        sec=nxt
        count+=1

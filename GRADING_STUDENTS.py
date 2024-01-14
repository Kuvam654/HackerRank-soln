num = int(input())
for a in range(1, num+1):
    a = int(input())
    if (a < 38):
        print(a)
    elif (a >= 38):
        b = 5 - (a % 5) 
        if (b < 3 and b >= 0):
            a += b
            print(a)
        else:
            print(a)
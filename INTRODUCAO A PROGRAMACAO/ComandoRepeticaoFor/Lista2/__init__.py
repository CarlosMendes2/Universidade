a = 10
print(a)
for b in range(1,4):
    print(a,b)
    c = a+b
    print(a,b,c)
    a = a-b
    print(a,b,c)
print(a,b,c)
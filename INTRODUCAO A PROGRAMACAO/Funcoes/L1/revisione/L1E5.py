import bibLetras

conta = 0

for i in range(6):
    x = input()
    if(bibLetras.testaVogal(x)):
        conta+=1
print(conta)

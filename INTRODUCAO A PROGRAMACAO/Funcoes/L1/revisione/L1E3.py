import bibNumeros

multiplo = 0

for i in range(5):
    entrada = int(input())
    if(bibNumeros.testaMultiplo4(entrada) == True):
        multiplo += 1

print(multiplo)

import bibNumeros


entrada = input()
valores = entrada.split()

for i in range(len(valores)):
    valores[i] = int(valores[i])

contador = 0
for i in range(len(valores)):
    if(bibNumeros.testaMultiplo4(valores[i]) == True):
        contador+=1

print(contador)

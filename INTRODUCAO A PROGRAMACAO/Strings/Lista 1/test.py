vovos = [2,1,5,3,4]

listaOrdem = []

menor = vovos[0]
for i in range(5):
    for j in range(5):
        if(vovos[i] < menor):
            menor = vovos[i]
            print(menor)
    print(menor)
    listaOrdem.append(menor)

print(listaOrdem)

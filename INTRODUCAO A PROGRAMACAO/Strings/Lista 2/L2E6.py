import bibStrings2
#06

listaNomes = ["nomeI","nomeII","nomeIII","nomeIV","nomeV","nomeVI","nomeVII","nomeVIII","nomeIX"]

lista = []
for i in range(len(listaNomes)):
    palavra = bibStrings2.removeVogal(listaNomes[i])
    lista.append(len(palavra))

total = 0
for i in range(len(lista)):
    total += lista[i]

print(lista)
print("Total de consoantes",total)

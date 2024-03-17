lista  = []

quantidade = 4

for i in range(quantidade):
    a = input("Nome cliente: \n")
    b = input("Nome bairro: \n")
    p = [a,b]
    lista.append(p)
print(lista)


maisUmSilva = 0
for i in range(len(lista)):
    if ((lista[i][0].upper()).find("SILVA") != -1 or (lista[i][0].upper()).find("SOUSA") != -1):
        maisUmSilva += 1

nomesCentro = []
for i in range(len(lista)):
    a = lista[i][0].split()
    if(lista[i][1].upper() == "CENTRO"):
        nomesCentro.append(a[0])

nomeVogalClientes = input("Vogal inicial: ").upper()

bairrosFiltrados = []
for i in range(len(lista)):
    if (lista[i][0][0].upper() == nomeVogalClientes):
        if (lista[i][1] not in bairrosFiltrados):
            bairrosFiltrados.append(lista[i][1])


print(f"Silvas e Sousas = {maisUmSilva} \n")
print(f"Clientes que moram no centro: {nomesCentro} \n")
print(f"Bairros Filtrados: {bairrosFiltrados}\n")

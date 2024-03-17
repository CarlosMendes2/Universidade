setores = []
salarios = []


for i in range(3):
    setores.append(input("Setores: ").upper())

for i in range(3):
    salarios.append(int(input("Salários: ")))

salarioAntigo = []

for i in range(3):
    salarioAntigo.append(salarios[i])
    if(setores[i] == "RH" or setores[i] == "ALMOXARIFADO"):
        salarios[i] *= 1.2

diferenca = []
for i in range(3):
    dif = salarios[i]-salarioAntigo[i]
    diferenca.append(dif)

aumento = []
for i in range(3):
    if(diferenca[i]>0):
        aumento.append(diferenca[i])
        print(salarios[i])
    else:
        aumento.append(0)

somaAumento = 0
for i in range(3):
    somaAumento += aumento[i]
print(somaAumento)
    

    

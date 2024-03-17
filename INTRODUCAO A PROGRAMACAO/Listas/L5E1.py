# while (entrada > 0)

#Nº Jovens
#Maior idade para um adulto
# media de idade para idosos


numeroJovens = 0
adultoMaisVelho = 0
idadeIdosos = 0
contadorIdosos = 0

entrada = int(input("Idade: "))

while(entrada > 0):
    if (entrada > 0 and entrada < 20):
        numeroJovens += 1
    elif(entrada >= 20 and entrada <= 60):
        if(entrada > adultoMaisVelho):
            adultoMaisVelho = entrada
    else:
        idadeIdosos+= entrada
        contadorIdosos+=1
    entrada = int(input("Idade: "))

if(numeroJovens == 0):
    print("Não hà Jovens")
else:
    print(f"Quantidade de Jovens → {numeroJovens}")

if(adultoMaisVelho == 0):
    print("Não hà Adultos")
else:
    print(f"Maior idade adulto → {adultoMaisVelho}")

if(idadeIdosos == 0):
    print("Não hÀ idosos")
else:
    mediaIdosos = idadeIdosos // contadorIdosos
    print(f"Média idade idosos → {mediaIdosos}")

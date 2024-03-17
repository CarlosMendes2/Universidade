import random

nomeA = ["Maria","Ana","Joana","Sofia","Beatriz","Carolina","Inês","Laura","Matilde","Diana","Rita","Margarida","Andreia","Catarina","Mariana","Sara","Gabriela","Leonor","Isabela","Camila"]  #F
nomeB = ["João","Pedro","Guilherme","Luís","Miguel","André","Francisco","Ricardo","António","Diogo","Thiago","Gonçalo","José","Carlos","Manuel","Daniel","Eduardo","Felipe","Vasco","Tomás","Alexandre"]  #M
sexo = ["masculino","feminino"]
tipo = ["Cachorro","Gato","Pássaro","Peixe","Lontra","Porco","Cobra"]
catalogo = []
for i in range(200):
    p = []
    sorteioSx = random.randint(0,1)
    sorteioTipo = random.randint(0,len(tipo))
    idade = random.randint(0,30)
    tipoAnimal = tipo[sorteioTipo-1]
    if(sorteioSx == 1):
        sorteioA = random.randint(1,len(nomeA)-1)
        nome = nomeA[sorteioA]
        sexoFinal = sexo[1]
    else:
        sorteioB = random.randint(1,len(nomeB)-1)
        nome = nomeB[sorteioB]
        sexoFinal = sexo[0]
        
    p = [nome,idade,tipoAnimal]
    catalogo.append(p)
    
catalogoTamanho = len(catalogo)
dogsCadastrados = 0
for i in range(catalogoTamanho):
    if(catalogo[i][2] == "Cachorro"):
        dogsCadastrados += 1

nomeDosGatos = []
numeroGatos = 0
idadeGatos = 0
for i in range(catalogoTamanho):
    if(catalogo[i][2] == "Gato"):
        nomeDosGatos.append(catalogo[i][0])
        numeroGatos+=1
        idadeGatos+=catalogo[i][1]
mediaIdadeGatos = idadeGatos/numeroGatos


idadeDosPassaros = []
for i in range(catalogoTamanho):
    if(catalogo[i][2] == "Pássaro"):
        idadeDosPassaros.append(catalogo[i][1])

nomeAnimaisIdadeMenorZero = []
for i in range(catalogoTamanho):
    if(catalogo[i][1] < 1):
        nomeAnimaisIdadeMenorZero.append(catalogo[i][0])

#print(catalogo)
print("----------------------------")


print("Número de cachorros cadastrados:",dogsCadastrados)
print("----------------------------")
print("Nome dos gatos:",nomeDosGatos)
print("----------------------------")
print("Idade dos pássaros:",idadeDosPassaros)
print("----------------------------")
print("Animais com menos de 1 ano:",nomeAnimaisIdadeMenorZero)
print("----------------------------")
print(f"Média idade dos gatos: {mediaIdadeGatos:.2f}")
print("----------------------------")




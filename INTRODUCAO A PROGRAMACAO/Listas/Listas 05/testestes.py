import random

nomeA = ["Maria","Ana","Joana","Sofia","Beatriz","Carolina","Inês","Laura","Matilde","Diana","Rita","Margarida","Andreia","Catarina","Mariana","Sara","Gabriela","Leonor","Isabela","Camila"]  #F
nomeB = ["João","Pedro","Guilherme","Luís","Miguel","André","Francisco","Ricardo","António","Diogo","Thiago","Gonçalo","José","Carlos","Manuel","Daniel","Eduardo","Felipe","Vasco","Tomás","Alexandre"]  #M
sexo = ["masculino","feminino"]

catalogo = []
for i in range(50):
    p = []
    sorteioSx = random.randint(1,2)
    idade = random.randint(1,30)

    if(sorteioSx == 1):
        sorteioA = random.randint(1,len(nomeA)-1)
        nome = nomeA[sorteioA]
        sexoFinal = sexo[1]
    else:
        sorteioB = random.randint(1,len(nomeB)-1)
        nome = nomeB[sorteioB]
        sexoFinal = sexo[0]
    p = [nome,sexoFinal,idade]
    catalogo.append(p)
    
    
    

print(catalogo)


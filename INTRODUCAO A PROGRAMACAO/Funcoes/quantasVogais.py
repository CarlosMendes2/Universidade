import novaBibliotecaAulaFuncoes

char = []

for i in range(10):
    char.append(input(""))

quantVogais = 0
for i in range(len(char)):
    if(novaBibliotecaAulaFuncoes.testeVogal(char[i])):
        quantVogais+=1
    
print(quantVogais)

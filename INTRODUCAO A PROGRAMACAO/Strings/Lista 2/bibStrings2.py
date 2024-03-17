def contemVogal(a): #01
    palavra = a.upper()
    vogal = ["A","E","I","O","U"]
    for i in range(len(palavra)): ## Atenssaum
        if(palavra[i] in vogal):
            return True
    return False

def contaPalavra(a): #02
    frase = a.split()    # Atenssaum split() =! list() | método e parametro
    return len(frase)


# list = ["Ana","Gui","Ale","Bia"]
def contaInicioVogal(a): #03
    vogal = ["A","E","I","O","U"]
    contador = 0
    for i in range(len(a)):           #Atenssaum tanso - > for foi confudido com if
        if(a[i][0].upper() in vogal):
            contador += 1
    return contador

#lista = ["ana","Gui","Ale","Bia","alexandre","gustavo","Ulysses"]
def contaMaisDe3(a): #04
    vogal = ["A","E","I","O","U"]
    contador = 0
    for i in range(len(a)):                  #Atenssaum nome do parametro 
        cont = 0                            
        for j in range(len(a[i])):       
            if(a[i][j].upper() in vogal):  #Atenssaum para upper()
                cont+=1
        if (cont>= 3):
            contador+=1
    return contador

def contaTotalH(a):
    contador = 0
    for i in range(len(a)):
        for j in range(len(a[i])):       #Atenssaum pra o i e j dos for multi
            if(a[i][j].upper() == "H"):
                contador += 1
    return contador
    
def removeVogal(a):
    vogal = ["A","E","I","O","U"]
    palavra = a
    a = ""
    for i in range(len(palavra)):
        if(palavra[i].upper() not in vogal):
            a += palavra[i]
    return a




#.capitalize() - Retorna e não modifica.
# ASCII - M < a, primeiro tudo em maiúsculo e depois ordena.
# find() - retorna -1 quando não encontra
# .join() - só transforma em palavra se for lista de strings
# .upper() não modifica, ela retorna.






































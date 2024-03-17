def multiplicaLista(a,b):
    for i in range(len(a)):
        a[i] = a[i]*b

def contaOcorrencia(a,b):
    ocorrencias = 0
    for i in range(len(a)):
        if(b == a[i]):
            ocorrencias += 1
    return ocorrencias

def removeValor(a,b):
    lista = []
    for i in range(len(a)):
        if(b != a[i]):
            lista.append(a[i])
    a = lista
    return a

def semRepeticao(a):
    lista = []
    for i in range(len(a)):
        if(a[i] not in lista):
            lista.append(a[i])
    return lista

def TestaOrdenacao(a):
    control = True
    for i in range(len(a)-1):
        if(a[i]> a[i+1]):
            control = False
    if (control):
        return True
    else:
        return False

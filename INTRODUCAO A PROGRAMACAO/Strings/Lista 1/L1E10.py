def buscaMenor(arr):
    menor = arr[0]
    menor_indice = 0
    for i in range(1,len(arr)):
        if(arr[i] < menor):
            menor = arr[i]
            menor_indice = [i]
    return menor_indice

def ordenacaoPorSelecao(arr):
    novoArr = []
    for i in range(len(arr)):
        menor = buscaMenor(arr)
        novoArr.append(arr.pop(menor))
    return novoArr


vovos = [["Berenice", "Tornado", "Silva"],["Antonia","Gonçalves","Fernandes"],["Bernadete","Mariana","Gonçaves"],["Jerusa","Roberta","Oliveira"]]

#for i in range(1):
#    nome = input("nome: ")
#    sobrenome1 = input("sobrenome1: ")
#    sobrenome2 = input("sobrenome2: ")
#    p = [nome, sobrenome1, sobrenome2]
#    vovos.append(p)

sobrenomes = []
for i in range(4):
    sobrenomes.append(vovos[i][1])

menor = sobrenomes[0]
for i in range(4):
    if(sobrenomes[i] < menor):
        menor = sobrenomes[i]



listaOrdenada = ordenacaoPorSelecao(sobrenomes)
print(listaOrdenada)

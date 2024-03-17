import bibGaleriaArte
#Escreva um programa que receba como entrada os nomes de 60 obras da galeria
# e exiba o valor total das obras do artista Leonardo Resende.


preco = 0
for i in range(60):
    entrada = input("Nome da obra:\n")
    if(bibGaleriaArte.consultaArtista(entrada).upper() == "LEONARDO RESENDE"):
        preco += bibGaleriaArte.consultaPreco(entrada)
print(preco)





# consultaObra

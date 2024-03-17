import bibGaleriaArte


quantidade = 8
quantidadeQuadros = 0
quadrosPrice = 0
for i in range(quantidade):
    entrada = input()
    if(bibGaleriaArte.consultaTipo(entrada) == "Quadro"):
        quantidadeQuadros += 1
        quadrosPrice += bibGaleriaArte.consultaPreco(entrada)

media = quadrosPrice / quantidadeQuadros
print(media)

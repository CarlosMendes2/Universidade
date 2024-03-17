import bibGaleriaArte

escuturasAdelia = 00
for i in range(5):
    entrada = input()
    if(bibGaleriaArte.consultaArtista(entrada) == "Adélia Machado"):
        if(bibGaleriaArte.consultaTipo(entrada) == "Escultura"):
            escuturasAdelia += 1

print(escuturasAdelia)

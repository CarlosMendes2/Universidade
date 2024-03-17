import bibGaleriaArte

quadro = 0
escultura = 0

for i in range (50):
    entrada = input()
    if(bibGaleriaArte.consultaTipo(entrada) == "Quadro"):
        quadro += 1
    elif(bibGaleriaArte.consultaTipo(entrada) == "Escultura"):
        escultura += 1

if(quadro > escultura):
    print("Mais quadros")
elif(quadro < escultura):
    print("Mais esculturas")
else:
    print("Mesma quantidade")

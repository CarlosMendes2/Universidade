# Entrada de várias letras
# X para o laço e exibe quantas vezes foram lidas "K", "Y" e "W".

entrada = 2
contador = 0
while(entrada!="X"):
    if(entrada == "K" or entrada == "Y" or entrada == "W"):
        contador+=1
    entrada = input("Informe uma letra\n").upper()
if(entrada=="X"):
    print(contador)

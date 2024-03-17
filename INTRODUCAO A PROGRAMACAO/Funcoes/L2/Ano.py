def defineEstacao(a):
    e = a.upper() 
    if(e == "DEZEMBRO" or e == "JANEIRO" or e == "FEVEREIRO"):
        return "Inverno"
    elif(e == "MARÇO" or e == "ABRIL" or e == "MAIO"):
        return "Primavera"
    elif(e == "SETEMBRO" or e == "OUTUBRO" or e == "NOVEMBRO"):
        return "Outono"
    elif(e == "JUNHO" or e == "JULHO" or e == "AGOSTO"):
        return "Verão"
    else:
        return "Entrada Inválida"

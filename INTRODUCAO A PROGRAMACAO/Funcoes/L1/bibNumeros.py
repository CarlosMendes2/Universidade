def testaMultiplo4(a):   # 2 - A
    if(a%4 == 0):
        return True
    else:
        return False
def contaDivisores(a):    # 2 - B
    contador = 0
    for i in range(1,a+1):
        if(a%i == 0):
            contador += 1
    return contador

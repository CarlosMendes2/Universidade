from unidecode import unidecode

def testaVogal(a):
    vogal = ["A","E","I","O","U"]
    if(unidecode(a.upper()) in vogal):
        return True
    else:
        return False

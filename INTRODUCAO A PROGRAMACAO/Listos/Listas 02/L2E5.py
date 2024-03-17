turmaLCC = []
turmaSI = []

for i in range(5):
    turmaLCC.append(int(input(f"Prova {i+1} LCC → ")))
    turmaSI.append(int(input(f"Prova {i+1} SI →")))

vitoriasSI = 0
vitoriasLCC = 0
empates = 0

for i in range(5): 
    if(turmaLCC[i] > turmaSI[i]):
        vitoriasLCC += 1
    elif(turmaLCC[i] < turmaSI[i]): 
        vitoriasSI += 1
    else:
        empates += 1    

print(f"Vitórias LCC: {vitoriasLCC}")#
print(f"Vitórias BSI: {vitoriasSI}")#
print(f"Empates: {empates}")#

pontosSI = 0
pontosLCC = 0

for i in range(5):
    pontosSI += turmaSI[i]
    pontosLCC += turmaLCC[i]
            
if(pontosSI > pontosLCC): #
    print("BSI Vencedor!")
elif(pontosSI < pontosLCC):
    print("LCC Vencedor!")
else:
    print("EMPATE!")
    


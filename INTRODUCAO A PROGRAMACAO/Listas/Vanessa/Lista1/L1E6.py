alunos = []
quantidadeTotal = 0

for i in range(4):
    alunos.append(int(input("| → ")))

for i in range(4):
    quantidadeTotal+= alunos[i]

print(quantidadeTotal)

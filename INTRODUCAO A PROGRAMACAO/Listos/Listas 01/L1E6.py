alunos = []
quantidadeTotalAlunos = 0

for i in range(4):
    alunos.append(int(input(f"Turma {i}:  ")))

for i in range(4):
    quantidadeTotalAlunos += alunos[i]

print(quantidadeTotalAlunos)

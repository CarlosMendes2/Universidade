dados = []
dadosFiltrados = []
for i in range(5):
    entrada = input()
    dados.append(entrada.split())
for i in range(len(dados)):
    dadosFiltrados.append(f"Sra. {dados[i][0].capitalize()}")
dadosFiltrados.sort()
print(dadosFiltrados)

/******************************************
Projecto de Fundamentos de Programacao II
Tema: Gestao de um Centro de Pesquisas Cientificas
Nome: Manuel Manuel, N. 36618
File Name: Analise.java
Data: 24.06.2026
*******************************************/

/*
1. Objectivo
Fazer um sistema para registar e gerir as actividades
de um Centro de Pesquisas Cientificas, incluindo a
gestao de pesquisadores, projectos, laboratorios,
equipamentos, inscricoes e relatorios.


2. GUI - Graphic User Interface

	ApresentacaoVisao
	LoginVisao
	MenuPrincipalVisao
	PesquisadorVisao
	ProjetoVisao
	LaboratorioVisao
	EquipamentoVisao
	InscricaoVisao
	AlocacaoVisao
	RelatorioVisao


3. Entidades Principais

3.1 - Entidades Fortes (existem de forma independente)

	PesquisadorModelo
		int id;
		String nome, numeroDocumento, especialidade,
			nivel, genero, nacionalidade;
		Date dataNascimento;
		boolean activo;

	ProjetoModelo
		int id;
		String titulo, area, descricao, status;
		Date dataInicio, dataFim;
		boolean activo;

	LaboratorioModelo
		int id;
		String nome, localizacao, areaEspecialidade;
		int capacidade;
		boolean activo;

	EquipamentoModelo
		int id;
		String nome, tipo, estado;
		Date dataAquisicao;
		boolean activo;


3.2 - Entidades Fracas (dependem das entidades fortes)

	InscricaoModelo
		int id, idPesquisador, idProjeto;
		String funcao;
		Date dataEntrada;
		/* Depende de: PesquisadorModelo + ProjetoModelo */

	AlocacaoModelo
		int id, idEquipamento, idLaboratorio;
		String observacao;
		Date dataAlocacao;
		/* Depende de: EquipamentoModelo + LaboratorioModelo */

	RelatorioModelo
		int id, idProjeto, idPesquisador;
		String titulo, conteudo;
		Date dataCriacao;
		/* Depende de: ProjetoModelo + PesquisadorModelo */


4. Persistencia de Dados

4.1 - Tabelas de Apoio / Auxiliares
	AreasConhecimento.tab
	StatusProjeto.tab
	TipoEquipamento.tab
	NivelPesquisador.tab
	FuncaoNoProjeto.tab
	EstadoEquipamento.tab
	Nacionalidades.tab

4.2 - Ficheiros de Dados
	Pesquisadores.DAT
	Projetos.DAT
	Laboratorios.DAT
	Equipamentos.DAT
	Inscricoes.DAT
	Alocacoes.DAT
	Relatorios.DAT


5. Implementacao

	Linguagem de Programacao: Java
	Interface Grafica: JavaFX / Swing
	IDE: NetBeans / IntelliJ IDEA
	Persistencia: Ficheiros binarios (.DAT) e ficheiros de texto (.tab)

*/


//Estrutura de diretorio
CentroPesquisas/          ← pasta raiz do projeto
│
├── src/                  ← pasta (todo o código fonte fica aqui)
│   │
│   ├── model/            ← pasta (package)
│   │   ├── PesquisadorModelo.java    
│   │   ├── ProjetoModelo.java        
│   │   └── ...
│   │
│   ├── dao/              ← pasta (package)
│   │   ├── PesquisadorDAO.java       
│   │   └── ...
│   │
│   ├── service/          ← pasta (package)
│   │   └── ...
│   │
│   ├── ui/               ← pasta (package)
│   │   └── ...
│   │
│   └── Main.java         ← ficheiro java (ponto de entrada)
│
└── dados/                ← pasta (ficheiros de dados, NÃO é código)
    ├── Pesquisadores.DAT
    └── ...
	
	
	
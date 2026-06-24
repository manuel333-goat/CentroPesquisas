🔬 Sistema de Gestão de um Centro de Pesquisas Científicas


Projecto académico desenvolvido na cadeira de Fundamentos de Programação II

Universidade Católica de Angola — UCAN




📋 Sobre o Projecto

Sistema desktop para gerir as actividades de um centro de pesquisas científicas,
incluindo o controlo de pesquisadores, projectos, laboratórios e equipamentos.


🚀 Funcionalidades


Gestão de Pesquisadores — cadastro, edição e listagem
Gestão de Projectos — criação, acompanhamento e status
Gestão de Laboratórios — registo e controlo de capacidade
Gestão de Equipamentos — inventário e estado de conservação
Inscrições — associação de pesquisadores a projectos
Alocações — atribuição de equipamentos a laboratórios
Relatórios — documentação de resultados por projecto



🛠️ Tecnologias Utilizadas


Java — linguagem de programação
Java Swing — interface gráfica
Ficheiros .DAT — persistência de dados
Ficheiros .tab — tabelas auxiliares



🏗️ Estrutura do Projecto

src/
├── Main.java
├── model/       → entidades do sistema
├── dao/         → leitura e escrita em ficheiros
├── service/     → regras de negócio
├── ui/          → janelas e interface gráfica
└── util/        → funções auxiliares

dados/
├── *.DAT        → ficheiros de dados
└── *.tab        → tabelas auxiliares


▶️ Como Executar

Compilar:

bashjavac -d . Main.java ui/*.java model/*.java dao/*.java service/*.java

Executar:

bashjava Main


👨‍💻 Autor

CampoInfoNomeManuel ManuelID36618CursoEngenharia InformáticaUniversidadeUniversidade Católica de AngolaCadeiraFundamentos de Programação II


📄 Licença

Este projecto está licenciado sob a licença MIT.

Consulta o ficheiro LICENSE para mais detalhes.

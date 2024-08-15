# Exercício da matéria de Desenvolvimento Mobile (2024/02)

## Aluno: Gabriel Guzzatti

## Professor Orientador: Thierry Mezzari

## Objetivo: 
Neste exercício, você vai criar um sistema simples de gerenciamento de livros em uma biblioteca. O objetivo é praticar conceitos de Orientação a Objetos, como classes, objetos encapsulamento, herança e polimorfismo, usando Kotlin.

## Descrição: 
Você precisa implementar três classes principais: Livro, Usuario, e Biblioteca. A classe Livro representa os livros da biblioteca, a classe Usuario representa as pessoas que pegam emprestado os livros, e a classe Biblioteca gerencia o processo de empréstimo de livros.

## Classe Livro 
- titulo: String
- autor: String
- disponível: String

+ exibirDetalhes()

## Classe Usuario
- nome: String
- livrosEmprestados: String

+ emprestarLivro()
+ devolverLivro()

## Classe Biblioteca
- nome: String
- livros: arrayOf

+ adicionarLivro(livro: Livro)
+ exibirLivrosDisponiveis()

## Implementar o fluxo principal:
• Crie instâncias das classes Livro, Usuario e Biblioteca.
• Adicione alguns livros à biblioteca.
• Empreste e devolva alguns livros usando um ou mais usuários.
• Exiba a lista de livros disponíveis antes e depois dos empréstimos.


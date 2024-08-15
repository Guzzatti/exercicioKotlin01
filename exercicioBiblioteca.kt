class Livro(val titulo: String, val autor: String, var disponivel: String) {
    fun exibirDetalhes() {
        println("Título: $titulo, Autor: $autor, Disponível: $disponivel")
    }
}

class Usuario(val nome: String, val livrosEmprestados: MutableList<String>) {
    fun emprestarLivro(livro: Livro) {
        if (livro.disponivel == "Sim") {
            livro.disponivel = "Não"
            livrosEmprestados.add(livro.titulo)
            println("$nome emprestou o livro: ${livro.titulo}")
        } else {
            println("O livro ${livro.titulo} não está disponível.")
        }
    }

    fun devolverLivro(livro: Livro) {
        if (livro.disponivel == "Não") {
            livro.disponivel = "Sim"
            livrosEmprestados.remove(livro.titulo)
            println("$nome devolveu o livro: ${livro.titulo}")
        } else {
            println("O livro ${livro.titulo} não foi emprestado.")
        }
    }
}

class Biblioteca(val nome: String, val livros: MutableList<Livro>) {
    fun adicionarLivro(livro: Livro) {
        livros.add(livro)
        println("O livro ${livro.titulo} foi adicionado à biblioteca.")
    }

    fun exibirLivrosDisponiveis() {
        println("Livros disponíveis na biblioteca $nome:")
        for (livro in livros) {
            if (livro.disponivel == "Sim") {
                println("Título: ${livro.titulo}, Autor: ${livro.autor}")
            }
        }
    }
}

fun main() {
    val livro1 = Livro("Livro 1", "Autor 1", "Sim")
    val livro2 = Livro("Livro 2", "Autor 2", "Sim")
    val livro3 = Livro("Livro 3", "Autor 3", "Sim")
    val livro4 = Livro("Livro 4", "Autor 4", "Sim")
    val livro5 = Livro("Livro 5", "Autor 5", "Sim")
    val livro6 = Livro("Livro 6", "Autor 6", "Sim")
    val livro7 = Livro("Livro 7", "Autor 7", "Sim")
    val livro8 = Livro("Livro 8", "Autor 8", "Sim")
    val livro9 = Livro("Livro 9", "Autor 9", "Sim")
    val livro10 = Livro("Livro 10", "Autor 10", "Sim")
    val usuario1 = Usuario("Usuário 1", mutableListOf())
    val usuario2 = Usuario("Usuário 2", mutableListOf())

    val biblioteca = Biblioteca("Minha Biblioteca", mutableListOf(livro1, livro2, livro3, livro4, livro5, livro6, livro7, livro8, livro9, livro10))

    println("Lista de livros disponíveis antes dos empréstimos:")
    biblioteca.exibirLivrosDisponiveis()

    usuario1.emprestarLivro(livro1)
    usuario1.emprestarLivro(livro2)
    usuario2.emprestarLivro(livro3)

    usuario1.devolverLivro(livro1)
    usuario2.devolverLivro(livro3)

    usuario1.emprestarLivro(livro4)
    usuario2.emprestarLivro(livro5)
    
    println("...")

    println("Lista de livros disponíveis depois dos empréstimos:")
    biblioteca.exibirLivrosDisponiveis()
}

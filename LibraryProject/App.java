package co.gabrielli;


public class App {
    public static void main(String[] args) {
        Library myLibrary = new Library("myLibrary");
        UserManager userManager = new UserManager();

        User loggedUser = null;
        do {
            System.out.println("Bem-vindo à nossa biblioteca virtual!");
            System.out.println("Informe o próximo passo...");
            System.out.println("Seu login será como estudante ou blibliotecário?");
            String next = UserInput.readString("ESTUDANTE = 1 | BIBLIOTECÁRIO = 2 | Encerrar programa = 3");
            if (next.equals("1")) {
                String nextUser = UserInput.readString("Logar = logar | Criar conta = criar");
                if (nextUser.equalsIgnoreCase("criar")) {
                    String nameUser = UserInput.readString("Digite seu nome de usuário");
                    String passwordUser = UserInput.readString("Digite sua senha");
                    userManager.generateUser(nameUser, passwordUser);
                    System.out.println("CONTA CRIADA COM SUCESSO!");
                } else if (nextUser.equalsIgnoreCase("logar")) {
                    String nameUser = UserInput.readString("Digite seu nome de usuário");
                    String passwordUser = UserInput.readString("Digite sua senha");
                    loggedUser = userManager.authenticate(nameUser, passwordUser);
                    if (loggedUser != null) {
                        System.out.println("LOGIN BEM SUCEDIDO!");
                        userSearch(myLibrary);
                    } else {
                        System.out.println("NOME DE USUÁRIO OU SENHA INCORRETOS!");
                    }
                }
            }else if(next.equals("2")){
                String password = UserInput.readString("Informe a senha da biblioteca");
                if(myLibrary.authenticateLibraryAccess(password)){
                    accessLibrary(myLibrary);
                }else{
                    System.out.println("SENHA INCORRETA! ACESSO NEGADO.");
                }
            }else if(next.equals("3")){
                return;
            }else{
                System.out.println("Opção inválida!");
            }
        }while (true);
    }
        static void userSearch (Library library){
            do {
                String next = UserInput.readString("Listar livros disponíveis = 1 | " + "Listar livros indisponiveis = 2 " + "\n" + "Listar livros por gênero = 3 |" + " Sair = 4");
                switch (next) {
                    case "1":
                        library.availableBooks();
                        break;
                    case "2":
                        library.unavailableBook();
                        break;
                    case "3":
                        String genre = UserInput.readString("Informe o gênero que deseja");
                        library.genreBooks(genre);
                        break;
                    case "4":
                        return;
                    default:
                        System.out.println("Opção inválida!");
                }
            } while (true);

        }
        static void accessLibrary (Library library){
            UserManager userManager = new UserManager();
            User loggedUser = null;
            do {
                String nextUser = UserInput.readString("Login bibliotecário = 1 | Criar login bibliotecário = 2 | Sair = 3");
                if (nextUser.equals("1")) {
                    String nameUser = UserInput.readString("Informe o nome de usuário:");
                    String password = UserInput.readString("Informe sua senha:");
                    loggedUser = userManager.authenticateLibrarian(nameUser,password);
                    if (loggedUser != null) {
                        System.out.println("LOGIN BEM SUCEDIDO!");
                        searchLibrary(library);
                    } else {
                        System.out.println("NOME DE USUÁRIO OU SENHA INCORRETOS!");
                    }

                }else if(nextUser.equals("2")){
                    String nameUser = UserInput.readString("Informe o nome de usuário:");
                    String password = UserInput.readString("Informe sua senha:");
                    userManager.generateLibrarian(nameUser,password);
                }else if(nextUser.equals("3")){
                    return;
                }else{
                    System.out.println("Opção inválida");
                }
            } while (true);
        }
    static void searchLibrary(Library library) {
        do {
            String next = UserInput.readString(
                            "\n"+"Adicionar livro à biblioteca = 1 |  " + " Mudar Status livro = 2" + "\n"
                                + "Listar livros disponíveis   = 3 | Listar livros indisponíveis = 4 " + "\n"
                                + "Listar livros emprestados   = 5 | Remover da biblioteca = 6 " + "\n" +"| Sair = 7"
            );
            switch (next) {
                case "1":
                    String titleBook = UserInput.readString("Digite o nome do livro:");
                    String authorBook = UserInput.readString("Digite o nome do autor:");
                    String statusBook = UserInput.readString("Informe a disponibilidade do livro (Disponível/Indisponivel/emprestado):");
                    String genre = UserInput.readString("Infome o gênero do livro");
                    library.insertBook(titleBook, authorBook, statusBook, genre);
                    System.out.println("Livro inserido com sucesso na biblioteca!");
                    break;
                case "2":
                    int isbn = UserInput.readInt("Informe o ISN do livro");
                    String newStatus = UserInput.readString("Informe o novo status do livro");
                    library.changeStatusBook(isbn, newStatus);
                    break;
                case "3":
                    library.availableBooks();
                    break;
                case "4":
                    library.unavailableBook();
                    break;
                case "5":
                    library.borrowedBook();
                    break;
                case "6":
                    int isbN = UserInput.readInt("Informe o ISBN do livro que deseja remover:");
                    library.removeBook(isbN);
                    break;
                case "7":
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }while(true);
    }

}


import java.util.Scanner;
/**
 * Main Class
 */
public class main {
    /**
     * Main function
     * @param args
     */
    public static void main(String[] args) {
        Scanner captureData = new Scanner(System.in);
        User user = new User();

        String nome, email, password;
        int opcao = 0, userId = 1, posicao = 0;

        while (opcao < 4) {
            System.out.println(
                "Escolha uma opção para iniciar o programa: \n\r" +
                "1 - Para cadastrar um usuário \n\r" +
                "2 - Contutar dados \n\r" +
                "3 - Atualizar dados \n\r" +
                "4 - Sair"
            );
            opcao = captureData.nextInt();

            switch (opcao) {
                case 1:
                    // Nome
                    System.out.println("Digite o seu nome \n\r");
                    nome = captureData.next();
                    // email
                    System.out.println("Digite o seu E-mail \n\r");
                    email = captureData.next();
                    // senha
                    System.out.println("Digite o sua senha \n\r");
                    password = captureData.next();
                    // Insert user data
                    user.createDataUser( nome, email, password, userId, posicao  );
                    // teste
                    userId++;
                    posicao++;
                    //
                    break;
                case 2:
                    // Get user informations
                    user.getUserData();
                    break;
                case 3:
                    // Para verificar se o usuário existe no sistema verificamos o e-mail
                    System.out.println("Digite seu e-mail \n\r");
                    String checkEmail = captureData.next();
                    // Então realizamos uma busca pela listagem
                    Integer currentUserId = user.getUserId( checkEmail );
                    System.out.println( currentUserId );

                    if( currentUserId != 0 ) {
                        // Nome
                        System.out.println("Digite o seu novo \n\r");
                        nome = captureData.next();
                        // email
                        System.out.println("Digite o seu novo E-mail \n\r");
                        email = captureData.next();
                        // senha
                        System.out.println("Digite o sua nova senha \n\r");
                        password = captureData.next();
                        // Insert user data
                        user.updateDataUser( currentUserId, nome, email, password );
                    }
                    break;
            }
        }
    }


}

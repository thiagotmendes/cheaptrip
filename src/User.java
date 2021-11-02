public class User implements UserInterface{
    public String nome, email;
    public String[][] userData = new String[5][4];
    private String password;
    private Integer userId, currentUserId;
//    public Integer posicao;

    @Override
    public Integer getUserId(String email) {
        for (int i = 0; i < 5; i++) {
            boolean b = new String( this.userData[i][1] ).equals(email);
            if( b == true ) {
                return Integer.parseInt( this.userData[i][3] );
//                break;
            }
        }

        return 0;
    }

    @Override
    public void getUserData() {
        for (int i = 0;  i < 5; i++) {
            System.out.println(
                "Nome: " + this.userData[i][0] +
                " Email: " + this.userData[i][1] +
                " Senha: "  + this.userData[i][2] +
                " Id: " + this.userData[i][3] + "\n\r"
            );
        }
    }

    @Override
    public void createDataUser(String nome, String email, String password, Integer userId, Integer posicao) {
        this.userData[posicao][0] = nome;
        this.userData[posicao][1] = email;
        this.userData[posicao][2] = password;
        this.userData[posicao][3] = Integer.toString(userId);
    }

    @Override
    public void updateDataUser( Integer userId, String novoNome, String novoEmail, String novoPassword) {
        for (int i = 0; i < 5; i++) {
            if( Integer.parseInt( this.userData[i][3] )  == userId ) {
                this.userData[i][0] = novoNome;
                this.userData[i][1] = novoEmail;
                this.userData[i][2] = novoPassword;
                break;
            }
        }
    }

    @Override
    public void deleteDataUser() {

    }
}

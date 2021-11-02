public interface UserInterface {
    public void getUserData();
    public Integer getUserId(String email);
    public void createDataUser(String nome, String email, String password, Integer userId, Integer posicao );
    public void updateDataUser( Integer userId, String novoNome, String novoEmail, String novoPassword );
    public void deleteDataUser();
}

package section04;

public class Practice0404 {
    public static void main(String[] args) {
        String isusername = "admin";
        String ispassword = "password123";
        String username = "admin";
        String password = "password123";

        if(username.equals(isusername) && password.equals(ispassword)){
             System.out.println("로그인 성공");
            } else{
                System.out.println("로그인 실패");
            }
        }
    }

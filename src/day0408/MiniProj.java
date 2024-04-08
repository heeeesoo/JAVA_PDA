package day0408;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.exit;

public class MiniProj {

    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        while (true) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("기능을 입력해주세요: ");
            int number = Integer.parseInt(scanner.nextLine());

            System.out.println("입력한 기능: " + number);

            switch (number) {
                case 0:
                    exit(0);
                case 1:
                    System.out.println("회원가입");
                    System.out.println("이름을 입력해주세요: "); // Updated prompt
                    String name = scanner.nextLine(); // Read name input
                    System.out.println("이메일을 입력해주세요: ");
                    String email = scanner.nextLine();
                    System.out.println("비밀번호를 입력해주세요: ");
                    String password = scanner.nextLine();

                    User user = new User(name, email, password); // Updated User object creation
                    userRepository.postUser(user);
                    break;
                case 2:
                    System.out.println("로그인");
                    System.out.println("이메일을 입력해주세요: ");
                    String emailLogin = scanner.nextLine();
                    System.out.println("비밀번호를 입력해주세요: ");
                    String passwordLogin = scanner.nextLine();

                    User userLogin = new User("", emailLogin, passwordLogin); // Updated User object creation
                    userRepository.getUser(userLogin);
                    break;
                case 3:
                    System.out.println("회원정보 수정");

                    System.out.println("수정하고 싶은 회원의 이메일을 입력해주세요: ");
                    String emailUpdate = scanner.nextLine();
                    System.out.println("수정하고 싶은 회원의 비밀번호를 입력해주세요: ");
                    String passwordUpdate = scanner.nextLine();

                    System.out.println("새로운 이름을 입력해주세요: "); // Updated prompt
                    String newName = scanner.nextLine(); // Read name input
                    System.out.println("새로운 이메일을 입력해주세요: ");
                    String newEmail = scanner.nextLine();
                    System.out.println("새로운 비밀번호를 입력해주세요: ");
                    String newPassword = scanner.nextLine();

                    User userUpdate = new User("", emailUpdate, passwordUpdate); // Updated User object creation
                    userRepository.putUser(userUpdate, newName, newEmail, newPassword); // Updated method call

                    break;
                case 4:
                    System.out.println("회원 탈퇴");

                    System.out.println("이메일을 입력해주세요: ");
                    String emailDelete = scanner.nextLine();
                    System.out.println("비밀번호를 입력해주세요: ");
                    String passwordDelete = scanner.nextLine();

                    User userDelete = new User("", emailDelete, passwordDelete); // Updated User object creation
                    userRepository.deleteUser(userDelete);

                    break;
                default:
                    System.out.println("다른 번호를 입력해주세요");
                    break;
            }

//            scanner.close();
        }
    }
}

class UserRepository {
    HashMap<Integer, User> UserRepository = new HashMap<>();
    int number = 0;

    UserRepository() {

    }

    void setUserLogin(User user) {
        Integer userId = getKeyFromValue(UserRepository, user);
        UserRepository.get(userId).isLogin = true;
    }

    void getAllUser() {
        for (Map.Entry<Integer, User> entrySet : UserRepository.entrySet()) {
            System.out.println(entrySet.getKey() + ": " + entrySet.getValue());
        }
    }

    void postUser(User user) {
        UserRepository.put(number, user);
        number += 1;
        getAllUser();
    }

    void getUser(User user) {

        if (getKeyFromValue(UserRepository, user) != null) {
            System.out.println("로그인 성공");
            setUserLogin(user);
            getAllUser();
        } else {
            System.out.println("로그인 실패");
            getAllUser();
        }
    }

    void deleteUser(User user) {
        Integer userId = getKeyFromValue(UserRepository, user);
        if (userId != null) {
            UserRepository.remove(userId);
            getAllUser();
            System.out.println("탈퇴 성공");
        } else {
            System.out.println("탈퇴 실패");
        }
    }

    void putUser(User user, String name, String email, String password) { // Updated method signature
        Integer userId = getKeyFromValue(UserRepository, user);
        System.out.println("put:" + userId);
        if (isLogin(user)) {
            User newUser = new User(name, email, password); // Updated User object creation
            UserRepository.put(userId, newUser);
            getAllUser();
            System.out.println("수정 완료 다시 로그인해주세요.");
        } else {
            System.out.println("로그인 해주세요");
        }
    }

    boolean isLogin(User user) {
        Integer userId = getKeyFromValue(UserRepository, user);
        if (userId != null) {
            return UserRepository.get(userId).isLogin;
        } else {
            System.out.println("회원이 아닙니다.");
            return false;
        }
    }

    public static <K, V> K getKeyFromValue(HashMap<K, V> map, V value) {
        for (HashMap.Entry<K, V> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}


class User {

    String name; // New field
    String email;
    String password;
    boolean isLogin = false;

    User(String name, String email, String password) { // Modified constructor
        this.name = name;
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return email.equals(user.email) && password.equals(user.password);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Email: " + email + ", Password: " + password + ", Login:" + isLogin;
    }
}
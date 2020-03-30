package s7;

class UserManagerImpl implements UserManager{

    @Override
    public void addUser(String userName, String password) {
        System.out.println("来了新同学");
        System.out.println("名字是: " + userName + " 学号是: " + password);
    }

    @Override
    public void delUser(String userName) {
        System.out.println("同学转学了");
        System.out.println("名字是: " + userName);
    }
}
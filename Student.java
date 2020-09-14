public class Student {
    int id;
    int groupid;
    String name;
    String phone;

    @Override
    public String toString(){
        return "Student{"
                + "id='" + id + '\''
                + "groupid='" + groupid + '\''
                + ", name=" + name
                + ", phone=" + phone
                + '}';
    }
}

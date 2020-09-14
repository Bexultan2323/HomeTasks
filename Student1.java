public class Student1 {
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

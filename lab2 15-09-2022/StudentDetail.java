public class StudentDetail {

    int stud_id;
    String stud_name;
    String stud_city;

    StudentDetail(int stud_id) {
        this.stud_id = stud_id;
    }

    StudentDetail(int stud_id, String stud_name) {
        this.stud_id = stud_id;
        this.stud_name = stud_name;
    }

    StudentDetail(int stud_id, String stud_name, String stud_city) {
        this.stud_id = stud_id;
        this.stud_name = stud_name;
        this.stud_city = stud_city;
    }

    void showInfo() {
        System.out.println("ID: " + stud_id + ", Name: " + stud_name + ", location: " + stud_city);
    }

    public static void main(String[] args) {
        StudentDetail stud1 = new StudentDetail(3);
        stud1.showInfo();
        StudentDetail stud2 = new StudentDetail(6, "Ravi Mishra");
        stud2.showInfo();
        StudentDetail stud3 = new StudentDetail(76, "Rajnish Kumar", "Kalyan");
        stud3.showInfo();
    }
}
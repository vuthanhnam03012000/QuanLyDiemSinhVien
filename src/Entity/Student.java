
package Entity;

public class Student extends User {

    public int id;
    public String name;
    public String gender;
    public String date;
    public String lop;
    public String address;

    public Student() {
    }

    public Student(int id, String name, String gender, String date, String lop, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.lop = lop;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(String id) {
        this.id = Integer.parseInt(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}

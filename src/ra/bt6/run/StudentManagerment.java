package ra.bt6.run;

import ra.bt6.service.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagerment  {
    static List<Student> students = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choise;
        do {
            System.out.println("**********MENU**********");
            System.out.println(
                            "1. Thêm Sinh viên.\n" +
                            "2. Sửa học sinh\n" +
                            "3. Xóa học sinh\n" +
                            "4. Tìm kiếm học sinh theo studentId\n" +
                            "5. Sắp xếp theo tên học sinh từ a-z\n" +
                            "6. In ra danh sách học sinh\n" +
                            "7. Sắp xếp điểm tăng dần\n" +
                            "8. Sắp xếp điểm giảm dần\n" +
                            "9. Thoát\n" +
                            "");
            choise = scanner.nextInt();
            scanner.nextLine();
            switch (choise){

                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent(scanner);

                    break;
                case 3:

                    deleteStudent(scanner);
                    break;
                case 4:
                    seachStudent(String.valueOf(scanner));
                    break;
                case 5:

                    break;
                case 6:
                    displayStudent();
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    System.out.println("Thoát chương trình");
                    System.exit(0);
                    break;

            }

        }while (choise != 0);

    }
    public  static void addStudent(){
        Student newStudent = new Student();
        newStudent.input();
        students.add(newStudent);


    }

    public static void displayStudent() {
        for (Student student : students
        ) {
            student.display();
        }
    }


    public static int seachStudent(String id){
        for (int i = 0; i < students.size() ; i++) {
            if(students.get(i).getStudentId() == id){
                return i;
            }else {
                return -1;
            }

        }

        return 0;
    }

    public static void deleteStudent(Scanner scanner){
        System.out.println("Nhập vào Id sinh viên ban muốn xoá");
        String deleteStudentId = scanner.nextLine();
        int deleteIndex = seachStudent(deleteStudentId);
        if (deleteIndex >= 0){
            students.remove(deleteStudentId);
            System.out.println("đã xóa thành công");
        } else {
            System.out.println("Sinh viên muốn xóa không có");
        }

    }
    public static void updateStudent(Scanner scanner){
        System.out.println("Nhập vào Id sinh viên ban muốn cập nhật");
        String idStudent = scanner.nextLine();
        int idUpdate = seachStudent(idStudent);
        if (idUpdate >=0 ){
            Student studentUpdate = new Student();
            studentUpdate.input();
            students.set(idUpdate,studentUpdate);
        }else {
            System.out.println("Sinh viên bạn muốn cập nhật không có");
        }
    }
}

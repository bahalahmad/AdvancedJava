package Enums;

enum Results{
    PASS,FAIL,NR,MAKEUP;
    int marks;
    // We can have constructor , methods inside enum
    Results(){
        System.out.println("CONSTRUCTOR IS GETTING CALLED");
    }
    void setMarks(int marks){
        this.marks = marks;
    }
    int getMarks(){
        return marks;
    }
}
public class Example2 {
    public static void main(String[] args) {
        Results.PASS.setMarks(10);
        int marks = Results.PASS.getMarks();
        System.out.println(marks);

    }
}
// we have total 4 members so 4 object is created so 4 time the constructor is called

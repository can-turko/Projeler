public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void addBulkExamNote1(int mat1, int fizik1, int kimya1){
        mat.note1=mat1;
        fizik.note1=fizik1;
        kimya.note1=kimya1;
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (((this.fizik.note*0.8)+(this.fizik.note1*0.2)) + ((this.kimya.note*0.8)+(this.kimya.note1*0.2)) + ((this.mat.note*0.8)+(this.mat.note1*0.2))) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu Ortalaması : " + ((this.mat.note*0.8)+(this.mat.note1*0.2)));
        System.out.println("Fizik Notu Ortalaması : " + ((this.fizik.note*0.8)+(this.fizik.note1*0.2)));
        System.out.println("Kimya Notu Ortalaması : " + ((this.kimya.note*0.8)+(this.kimya.note1*0.2)));
    }

}
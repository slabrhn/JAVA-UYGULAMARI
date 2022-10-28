
    public class Student {
        String name,stuNo;
        int classes;
        Course mat;
        Course fizik;
        Course kimya;
        double avarage;
        boolean isPass;
       
        public Student(String name,int classes , String stuNo, Course mat, Course fizik, Course kimya) {
           
           this.name = name;
           this.stuNo = stuNo;
           this.classes = classes;
           this.mat = mat;
           this.fizik = fizik;
           this.kimya = kimya;
           this.isPass = false;
       }
        
        public void addExamNote(int mat,int fizik,int kimya) {
              if (mat >= 0 && mat <= 100) {
                   this.mat.examNote = mat;
               }
   
               if (fizik >= 0 && fizik <= 100) {
                   this.fizik.examNote = fizik;
               }
   
               if (kimya >= 0 && kimya <= 100) {
                   this.kimya.examNote = kimya;
               }
        }
        
        public void addQuizNote(int mat,int fizik,int kimya) {
              if (mat >= 0 && mat <= 100) {
                   this.mat.quizNote = mat;
               }
   
               if (fizik >= 0 && fizik <= 100) {
                   this.fizik.quizNote = fizik;
               }
   
               if (kimya >= 0 && kimya <= 100) {
                   this.kimya.quizNote = kimya;
               }
        }
        
         
        
        public void calcAvarage() {
               double matNot=(this.mat.examNote * this.mat.examNoteEtki)+(this.mat.quizNote * this.mat.quizNoteEtki);
               double fizikNot=(this.fizik.examNote * this.fizik.examNoteEtki)+(this.fizik.quizNote * this.fizik.quizNoteEtki);
               double kimyaNot=(this.kimya.examNote * this.kimya.examNoteEtki)+(this.kimya.quizNote *  this.kimya.quizNoteEtki);
   
            this.avarage = (matNot+fizikNot+kimyaNot) / 3;
           }
         
       
         public boolean isCheckpass() {
             calcAvarage();
             return this.avarage >55;
         }
       
         public void isPass() {
             if (this.mat.examNote==0 || this.fizik.examNote == 0 || this.kimya.examNote == 0 || 
                    this.mat.quizNote==0 || this.fizik.quizNote == 0 || this.kimya.quizNote == 0) {
                 
                 System.out.println("Notlar tam olarak girilmemiþ");
           
             }else {
               this.isPass=isCheckpass();
               printNote();
               System.out.println("Ortalama : " + this.avarage);
               
               if (this.isPass) {
                   System.out.println("Sýnýfý Geçti. ");
               } else {
                   System.out.println("Sýnýfta Kaldý.");
               }
           }
             
         }
         
        
        public void printNote(){
               System.out.println("=========================");
               System.out.println("Öðrenci : " + this.name+"\n");
              
           
               System.out.println("Matematik Sinav Notu : " + this.mat.examNote);
               System.out.println("Matematik Sozlu Notu : " + this.mat.quizNote +"\n");
               
             
               System.out.println("Fizik Sinav Notu : " + this.fizik.examNote);
               System.out.println("Fizik Sozlu Notu : " + this.fizik.quizNote+"\n");
             
               
               System.out.println("Kimya Sinav Notu : " + this.kimya.examNote);
               System.out.println("Kimya Sozlu Notu : " + this.kimya.quizNote+"\n");
           }
   
        
        
   
   }
}



    public class Main {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            
            Fighter khabib = new Fighter("khabib", 100, 77, 20,35.0); 
            Fighter mcgregor = new Fighter("mcgregor", 100, 70, 15,25.0);
            
            Ring match= new Ring(khabib, mcgregor, 68, 80);
            match.run();
            
            
    
        }
    
    }
}



    public class Ring {
        Fighter f1;
        Fighter f2;
        int minWeight;
        int maxWeight;
        
        public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
            this.f1 = f1;
            this.f2 = f2;
            this.minWeight = minWeight;
            this.maxWeight = maxWeight;
        }
        
        public void run() {
            if (checkWeight()) {
                
                if (yaziTura()) {
                    
                    while (f2.health > 0 && f1.health >0 ) {
                        
                        f2.health=f1.hit(f2);
                        
                        if (isWin()) {
                            break;
                        }
                        
                        
                        f1.health=f2.hit(f1);
                        
                        if (isWin()) {
                            break;
                        }
                        
                          printScore();
                        
                    }
                    
                }else {
                    
                    
                    while (f2.health > 0 && f1.health >0 ) {
                        
                        
                        f1.health=f2.hit(f1);
                        
                        if (isWin()) {
                            break;
                        }
                        
                        
                        f2.health=f1.hit(f2);
                        
                        if (isWin()) {
                            break;
                        }
                        
                          printScore();
                        
                    }
                    
                
                }
                
                
                
                
                
                
                
            }else {
                  System.out.println("Sporcularýn aðýrlýklarý uyuþmuyor.");
            }
        }
        
        // 0.5 ten kucukse yazi 0.5 ten buyukse tura
        public boolean yaziTura() {
        double sayi =Math.random();
            
            return sayi< 0.5;
        }
        
        public boolean checkWeight() {
            
            return (f1.weight >= this.minWeight && f1.weight <= this.maxWeight ) && (f2.weight >= this.minWeight && f2.weight <= this.maxWeight );
        }
        
        
        public boolean isWin() {
            
            if (f1.health==0) {
                System.out.println("Maçý Kazanan : " + f2.name);
                return true;
            
            }else if (f2.health==0) {
                
                System.out.println("Maçý Kazanan : " + f1.name);
                 return true;
            }
            
            return false;
        }
        
          public void printScore() {
                System.out.println("------------");
                System.out.println(f1.name + " Kalan Can \t:" + f1.health);
                System.out.println(f2.name + " Kalan Can \t:" + f2.health);
            }
          
          
    
    }
}


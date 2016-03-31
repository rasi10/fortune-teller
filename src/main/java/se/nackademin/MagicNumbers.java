package se.nackademin;

public class MagicNumbers {

    private String name;
    private int income;
    private String location;
    private int age;
    private int height;

    public int calculateA() {
        String name = getName();
        int count = 0;
        int userAge = getAge();
        if (name.length() == 0){        	
        	count = -1;
        }else{        	
            for (char c : name.toCharArray()) {
                if (c == ' ') {
                    count++;
                }
            }
        }
        		      
        
        
        count++;        
        count = count + userAge;        
        do{
            count = count -7;
            System.out.println(count);
        }while(count>=10);        
        
        return count;      
    }

    public int calculateB() {
        //TODO: calculate B
        return 0;
    }

    public int calculateC() {
        //TODO: calculate C
        return 0;
    }

    public int calculateD() {
        //TODO: calculate D
        return 0;
    }

    public int calculateE() {
        //TODO: calculate E
        return 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public int getIncome() {
        return this.income;
    }

    public String getLocation() {
        return this.location;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }
    
    
    
}

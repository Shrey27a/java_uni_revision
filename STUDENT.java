 class STUDENT {
     String name;
     int age;
     double score;


    public STUDENT (String name){
        this.name=name;
        System.out.println("Student name is :" + name);
    }

    
    public STUDENT (String name , int age){
        this.name=name;
        this.age=age;
        System.out.println("Student name is :" + name + "   Student age is: " + age);
    }

    public STUDENT (String name , int age , double score){
        this.name=name;
        this.age=age;
        this.score=score;
        System.out.println("Student name is : " + name + "   Student age is:  "+ age + "   Student score is:" +score);
    }

    public static void main(String[] args) {
        STUDENT obj1 =new STUDENT("Shreya");
        STUDENT obj2 =new STUDENT("Shreya" , 20);
        STUDENT obj3 =new STUDENT("Shreya" , 22 , 96.7);


    }
}

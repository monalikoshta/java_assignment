class Person
{
    private String name;
    private String email;

    public Person(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName(){

        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }
}

class Encapsulating_classes
{
    public static void main(String[] args){
        Person p1 = new Person("Monali Koshta", "monali.koshta@quantiphi.com");
        System.out.println("Person's name is: "+p1.getName());
        System.out.println("Person's email is: "+p1.getEmail());
        p1.setName("Monali");
        p1.setEmail("monalikoshta@gmail.com");
        System.out.println("Person's new name is: "+p1.getName());
        System.out.println("Person's new email is: "+p1.getEmail());
    }
}
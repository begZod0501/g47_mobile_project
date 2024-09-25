package homework1;

public class main {
    public static void main(String[] args) {
        try {
            ProgrammingLanguage programmingLanguage=new ProgrammingLanguage(null,null,null);
            System.out.println(programmingLanguage);
        }catch (NullPointerException d){
            System.out.println(" A NullPointerException  occurred " + d.getMessage() );
        }


    }
}

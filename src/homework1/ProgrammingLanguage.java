package homework1;

public class ProgrammingLanguage {

    private String name;
    private String owner;
    private String releaseDate;

    public ProgrammingLanguage(String name,String owner, String releaseDate) {
        this.name=name;
        this.owner=owner;
        this.releaseDate=releaseDate;

    }

    public  String getName() {
        return name;
    }


    public  String getOwner() {
        return owner;
    }


    public  String getReleaseDate() {
        return releaseDate;
    }

    public String  displayInfo(){
      return   "this.name = " + (name!=null ? name: "null") + "," +
        "this.owner = " + (owner!=null ? owner: "null") + "," +
        "this.releaseDate = " +( releaseDate!=null ? releaseDate: "null");
    }


}



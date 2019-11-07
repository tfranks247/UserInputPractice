public class Sibling  {

    private String name;
    private String relationship;

    public Sibling() {
    }

    public Sibling(String name, String relationship) {
        this.name = name;
        this.relationship = relationship;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public void displaytext1(){
        System.out.println("Sibling Name: " + getName());
        System.out.println("Relationship to you: " + getRelationship());
    }
}

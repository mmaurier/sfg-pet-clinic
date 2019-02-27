package guru.springframework.sfgpetclinic.model;

public class PetType extends NamedEntity {

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    private String name;

}

package aleksey_babaykin.project.models.interfaces;

public interface Property {

    String saveProperty(String property);

    String loadProperty(String idInstance);

    String updateProperty(String idInstance);

}
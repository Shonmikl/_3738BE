package aleksey_babaykin.project.models.interfaces;

public interface FileStored {
    boolean loadContext(String id);
    boolean saveContext(String nameSavedFile);
}
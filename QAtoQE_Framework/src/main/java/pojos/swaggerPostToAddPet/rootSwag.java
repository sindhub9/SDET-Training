package pojos.swaggerPostToAddPet;

import java.util.List;

public class rootSwag
{


    private int id;
    private Categeory categeory;
    private String name;
    private List<String> photoUrls;
    private List<Tags> tags;
    private String status;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public Categeory getCategeory() {
        return categeory;
    }

    public void setCategeory(Categeory categeory) {
        this.categeory = categeory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

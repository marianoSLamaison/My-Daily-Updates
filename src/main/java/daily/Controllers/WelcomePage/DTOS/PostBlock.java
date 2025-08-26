package daily.Controllers.WelcomePage.DTOS;
/*
 * Nota: Jackson toma los setter y getters en minuscula de los objetos
 * Puedes modificar como agarra objetos, con objetos en la configuración inicial
 * pero para nuestro projecto, esto que tenemos es ams que suficiente.
 * 
 * Jackson solo se queja si no tiene nada que serializar, a si que asegurate de que pueda serializar
 * algo. Tambien jackson agarra o bien geters publicos, o bien atributos publicos, le es indiferente al parece
 * Tambien jackson toma la primera letra del getter como una minuscula, y si hay un atributo que es public
 * y se llama igual que un getter, solo toma uno de los dos
 */
public class PostBlock {
    private long PostId;
    private String Title;
    private String Previews;
    public PostBlock(long PostId, String Title, String Previews)
    {
        this.PostId = PostId;
        this.Title = Title;
        this.Previews = Previews;
    }
    public long getPostId() 
    {
        return PostId;
    }
    public String getTitle()
    {
        return Title;
    }
    public String getPreview()
    {
        return Previews;
    }
    public String Getman()
    {
        return "";
    }
}
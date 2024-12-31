package lungtungxeng.springboot3.gallery.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Gallery {
    private int id;
    private List<Object> images;

    public Gallery(int galleryId) {
        this.id = galleryId;
    }
}

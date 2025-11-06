package k66httt.ttcn.qlyvattu.entity;

import jakarta.persistence.*;
import k66httt.ttcn.qlyvattu.enums.BannerType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "banner")
@Getter
@Setter
public class Banner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String image;

    private String pageName;

    private Long idProduct;

    private String linkWeb;

    private BannerType bannerType;
}

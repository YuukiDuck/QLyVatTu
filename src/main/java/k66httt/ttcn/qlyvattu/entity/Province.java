package k66httt.ttcn.qlyvattu.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "province")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;

    @OneToMany(mappedBy = "province")
    @JsonIgnore
    private List<Ward> wards;
    @OneToMany(mappedBy = "province")
    private Collection<Ward> ward;

    public Collection<Ward> getWard() {
        return ward;
    }

    public void setWard(Collection<Ward> ward) {
        this.ward = ward;
    }
}


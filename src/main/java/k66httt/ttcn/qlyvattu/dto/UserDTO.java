package k66httt.ttcn.qlyvattu.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data // To String
public class UserDTO {
    private Long id;
    private String username;
    private String email;
    private String fullname;
    private String phone;
    private Boolean active;
    private String authorityName;
}

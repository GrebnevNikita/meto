package MVC;

import javax.persistence.*;

@Entity(name = "ProxySites")
public class ProxySites {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String site_url;


}